let GTextEncoder = new TextEncoder();
let GTextDecoder = new TextDecoder("utf-8");
let DataUtil = {
    strToBase64: function (str) {
        let strBin = this.strToBytes(str);
        return this.bytesToBase64(strBin);
    },
    base64ToStr: function (b64) {
        let b64Bin = this.base64ToBytes(b64);
        return this.bytesToStr(b64Bin);
    },
    bytesToByteArr: function (buffer) {
        let byteArr = Array.from(new Uint8Array(buffer));
        return byteArr;
    },

    bytesToBase64: function (buffer) {
        let b64 = btoa(String.fromCharCode.apply(null, new Uint8Array(buffer)));
        return b64;
    },
    base64ToBytes: function (b64) {
        let binStr = atob(b64);
        let rawLength = binStr.length;
        let array = new Uint8Array(new ArrayBuffer(rawLength));
        for (let i = 0; i < rawLength; i++) {
            array[i] = binStr.charCodeAt(i);
        }
        return array;
    },

    strToBytes: function (str) {
        let bytes = GTextEncoder.encode(str);
        return bytes;
    },
    bytesToStr: function (buffer) {
        let str = GTextDecoder.decode(buffer);
        return str;
    },

    bigIntToBytes: function (bn) {
        if (bn != null && bn !== undefined) {
            let hex = bn.toString(16);
            if (hex.length % 2) {
                hex = '0' + hex;
            }
            let len = hex.length / 2;
            let u8 = new Uint8Array(len);
            let i = 0;
            let j = 0;
            while (i < len) {
                u8[i] = parseInt(hex.slice(j, j + 2), 16);
                i += 1;
                j += 2;
            }
            return u8;
        }
    },
    bytesToBigInt: function (buf) {
        let hex = [];
        let u8 = Uint8Array.from(buf);
        u8.forEach(function (i) {
            var h = i.toString(16);
            if (h.length % 2) {
                h = '0' + h;
            }
            hex.push(h);
        });
        return bigInt(hex.join(''), 16);
    }
};
let FormUtil = {
    postJson: function (url, data, success, error) {
        $.ajax({
            url: url,
            crossDomain: false,
            dataType: "json",
            headers: {
                'accept': 'application/json',
                'Content-Type': 'application/json'
            },
            method: "POST",
            scriptCharset: "utf-8",
            processData: false,
            data: JSON.stringify(data),
            success: success,
            error: error,
        });
    }
};
let PubSubUtil = {
    subscribers: {},
    publish: function (event, data) {
        if (!this.subscribers[event]) return;
        this.subscribers[event].forEach(cb => cb(data));
    },
    subscribe(event, callback) {
        if (!this.subscribers[event]) {
            this.subscribers[event] = [];
        }
        this.subscribers[event].push(callback);
    },
    unsubscribe(event, callback) {
        if (this.subscribers[event]) {
            if (callback) {
                this.subscribers[event].filter(cb => cb === callback).clear()
            } else {
                this.subscribers[event].clear()
            }
            if(!this.subscribers[event]){
                this.subscribers[event].remove()
            }
        }
    }
}
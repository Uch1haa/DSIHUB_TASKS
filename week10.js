function spinalCase(str){
    return str.replace(/([a-z]) ([A-Z])/g, '$1_$2').replace(/\s+ |_+/g, '_').toLowerCase();

}
spinalCase('This is Spinal Tap');
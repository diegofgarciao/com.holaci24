

module.exports = (function(){

    var mostrar = function(step, successCallback, errorCallback){
    cordova.exec(successCallback, errorCallback, "holaFuncion", "holaMundo", [step]);};
    
    return {
    callInit:mostrar
    };
    

})();

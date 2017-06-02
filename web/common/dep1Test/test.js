define(['angular', 'censhare'], function (angular, censhare) {
    'use strict';

    var module = censhare.module("galileeTest");

    module.controller('galileeTestController', ['$scope', function ($scope) {
        console.log("Galilee Test Widget", $scope);
    }]);
});
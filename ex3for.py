#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
A = int(raw_input("introducir un numero: "))
B = int(raw_input("introducir el segundo numero: "))

if A<B:
	for PN in range (B,A,-1):
		print PN
if A>B:		
	for PN in range (B,A,+1):
		print PN
elif A==B:
	print "Los numeros son iguales", A, ",", B

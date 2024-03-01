package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public class Class479 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "Lclient!db;")
	static Class18 aClass18_1;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
	public static int anInt5144 = 1956438823;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
	static int anInt5143 = -2128474138;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Lclient!th;")
	Class480 aClass480_4;

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "Lclient!uz;")
	Class518 aClass518_1;

	@OriginalMember(owner = "client!tg", name = "aa", descriptor = "F")
	float aFloat303;

	@OriginalMember(owner = "client!tg", name = "at", descriptor = "F")
	float aFloat304;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "F")
	float aFloat305;

	@OriginalMember(owner = "client!tg", name = "af", descriptor = "F")
	float aFloat306;

	@OriginalMember(owner = "client!tg", name = "ak", descriptor = "F")
	float aFloat307;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
	int anInt5146 = 0;

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
	int anInt5145 = -1284526975;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "J")
	long aLong279 = 0L;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "Z")
	boolean aBoolean799 = false;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "Lclient!mh;")
	final Class320 aClass320_63 = new Class320(-50.0F, -60.0F, -50.0F);

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "Lclient!ew;")
	final Class161 aClass161_53 = new Class161(9);

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "Lclient!ew;")
	final Class161 aClass161_51 = new Class161(8);

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "Lclient!ew;")
	final Class161 aClass161_52 = new Class161(9);

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "Z")
	boolean aBoolean798 = false;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "[I")
	int[] anIntArray470 = new int[] { -1, -1, -1 };

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "[F")
	float[] aFloatArray112 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "Z")
	boolean aBoolean800 = false;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "Lclient!de;")
	final Class21 aClass21_11;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "Lclient!ny;")
	final Class359 aClass359_87;

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "[[Lclient!th;")
	final Class480[][] aClass480ArrayArray1;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "Lclient!th;")
	final Class480 aClass480_3;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "Lclient!th;")
	final Class480 aClass480_2;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "Lclient!th;")
	final Class480 aClass480_5;

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "Lclient!th;")
	final Class480 aClass480_1;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!de;Lclient!ny;II)V", line = 53)
	public Class479(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass21_11 = arg0;
		this.aClass359_87 = arg1;
		this.aClass480ArrayArray1 = new Class480[arg2][arg3];
		if (anInt5144 * -1342987415 != -1) {
			aClass18_1 = this.method28872(anInt5144 * -1342987415);
		}
		Class180.aClass395_1 = null;
		this.aClass480_3 = new Class480();
		this.aClass480_2 = new Class480();
		this.aClass480_5 = new Class480();
		this.aClass480_1 = new Class480();
		this.method28901();
		this.method28904();
		this.method28889();
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(Lclient!om;)V", line = 69)
	public void method28892(@OriginalArg(0) Class370 arg0) {
		@Pc(4) Class480 local4 = this.method28914(arg0);
		if (this.aClass518_1 == null) {
			this.method28879(local4, anInt5143 * -2096930851);
		} else {
			this.aClass480_4.method28959(local4);
			this.aClass480_4.method28939(this, this.aClass518_1);
			this.method28879(this.aClass480_4, this.aClass518_1.method29698());
		}
		this.method28880();
		this.method28882();
		this.method28885();
		this.method28905();
		this.method28886();
		this.method28874();
	}

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "(Lclient!om;I)V", line = 69)
	public void method28896(@OriginalArg(0) Class370 arg0) {
		@Pc(4) Class480 local4 = this.method28914(arg0);
		if (this.aClass518_1 == null) {
			this.method28879(local4, anInt5143 * -2096930851);
		} else {
			this.aClass480_4.method28959(local4);
			this.aClass480_4.method28939(this, this.aClass518_1);
			this.method28879(this.aClass480_4, this.aClass518_1.method29698());
		}
		this.method28880();
		this.method28882();
		this.method28885();
		this.method28905();
		this.method28886();
		this.method28874();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!om;Lclient!uz;II)V", line = 85)
	public void method28869(@OriginalArg(0) Class370 arg0, @OriginalArg(1) Class518 arg1, @OriginalArg(2) int arg2) {
		this.aClass518_1 = arg1;
		@Pc(7) Class480 local7 = this.method28914(arg0);
		if (this.aClass518_1 == null) {
			this.method28879(local7, arg2);
			this.aClass480_4 = null;
			return;
		}
		if (this.aClass480_4 == null) {
			this.aClass480_4 = new Class480();
		}
		this.aClass480_4.method28959(local7);
		this.aClass480_4.method28939(this, this.aClass518_1);
		this.method28879(this.aClass480_4, arg2);
	}

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "(B)Lclient!th;", line = 100)
	public Class480 method28870() {
		return this.aClass480_2;
	}

	@OriginalMember(owner = "client!tg", name = "at", descriptor = "()Lclient!th;", line = 100)
	public Class480 method28894() {
		return this.aClass480_2;
	}

	@OriginalMember(owner = "client!tg", name = "af", descriptor = "()Lclient!th;", line = 100)
	public Class480 method28895() {
		return this.aClass480_2;
	}

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "()Lclient!th;", line = 100)
	public Class480 method28907() {
		return this.aClass480_2;
	}

	@OriginalMember(owner = "client!tg", name = "ak", descriptor = "()Lclient!th;", line = 100)
	public Class480 method28915() {
		return this.aClass480_2;
	}

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "(Lclient!tg;I)V", line = 104)
	public void method28884(@OriginalArg(0) Class479 arg0) {
		this.aClass480_2.method28959(arg0.aClass480_2);
		this.aClass480_5.method28959(arg0.aClass480_5);
		this.aClass480_1.method28959(arg0.aClass480_1);
		this.aLong279 = arg0.aLong279;
		this.anInt5146 = arg0.anInt5146;
		this.anInt5145 = arg0.anInt5145;
	}

	@OriginalMember(owner = "client!tg", name = "aa", descriptor = "(Lclient!tg;)V", line = 104)
	public void method28897(@OriginalArg(0) Class479 arg0) {
		this.aClass480_2.method28959(arg0.aClass480_2);
		this.aClass480_5.method28959(arg0.aClass480_5);
		this.aClass480_1.method28959(arg0.aClass480_1);
		this.aLong279 = arg0.aLong279;
		this.anInt5146 = arg0.anInt5146;
		this.anInt5145 = arg0.anInt5145;
	}

	@OriginalMember(owner = "client!tg", name = "ah", descriptor = "(Lclient!tg;)V", line = 104)
	public void method28898(@OriginalArg(0) Class479 arg0) {
		this.aClass480_2.method28959(arg0.aClass480_2);
		this.aClass480_5.method28959(arg0.aClass480_5);
		this.aClass480_1.method28959(arg0.aClass480_1);
		this.aLong279 = arg0.aLong279;
		this.anInt5146 = arg0.anInt5146;
		this.anInt5145 = arg0.anInt5145;
	}

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)V", line = 113)
	public void method28871() {
		this.aClass161_53.method23224();
		this.aClass161_51.method23224();
		this.aClass161_52.method23224();
	}

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "(IB)Lclient!db;", line = 119)
	Class18 method28872(@OriginalArg(0) int arg0) {
		@Pc(6) Class18 local6 = (Class18) this.aClass161_53.method23219((long) arg0);
		if (local6 == null) {
			local6 = this.aClass21_11.method17248(arg0);
			this.aClass161_53.method23222(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!tg", name = "an", descriptor = "(I)Lclient!db;", line = 119)
	Class18 method28899(@OriginalArg(0) int arg0) {
		@Pc(6) Class18 local6 = (Class18) this.aClass161_53.method23219((long) arg0);
		if (local6 == null) {
			local6 = this.aClass21_11.method17248(arg0);
			this.aClass161_53.method23222(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!tg", name = "aj", descriptor = "(I)Lclient!db;", line = 119)
	Class18 method28900(@OriginalArg(0) int arg0) {
		@Pc(6) Class18 local6 = (Class18) this.aClass161_53.method23219((long) arg0);
		if (local6 == null) {
			local6 = this.aClass21_11.method17248(arg0);
			this.aClass161_53.method23222(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "(IIIII)Lclient!po;", line = 127)
	Class395 method28873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(25) long local25 = ((long) arg1 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		@Pc(31) Class395 local31 = (Class395) this.aClass161_51.method23219(local25);
		if (local31 == null) {
			local31 = Class369.aClass413_1.method27710(arg0, arg1, arg2, arg3, Class375.aClass200_1);
			this.aClass161_51.method23222(local31, local25);
		}
		return local31;
	}

	@OriginalMember(owner = "client!tg", name = "as", descriptor = "(I)Lclient!cf;", line = 137)
	Class16 method28881(@OriginalArg(0) int arg0) {
		@Pc(6) Class16 local6 = (Class16) this.aClass161_52.method23219((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(15) Class15 local15 = Class137.method22937(this.aClass359_87, arg0);
		if (local15 != null && local15.method3433() == 256 && local15.method3440() == 16) {
			@Pc(29) int[] local29 = local15.method3448(false);
			local6 = this.aClass21_11.method17126(local29);
			if (local6 != null) {
				this.aClass161_52.method23222(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "(IB)Lclient!cf;", line = 137)
	Class16 method28923(@OriginalArg(0) int arg0) {
		@Pc(6) Class16 local6 = (Class16) this.aClass161_52.method23219((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(15) Class15 local15 = Class137.method22937(this.aClass359_87, arg0);
		if (local15 != null && local15.method3433() == 256 && local15.method3440() == 16) {
			@Pc(29) int[] local29 = local15.method3448(false);
			local6 = this.aClass21_11.method17126(local29);
			if (local6 != null) {
				this.aClass161_52.method23222(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "(IILclient!th;I)V", line = 156)
	public void method28875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class480 arg2) {
		this.aClass480ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!tg", name = "ai", descriptor = "(IILclient!th;)V", line = 156)
	public void method28902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class480 arg2) {
		this.aClass480ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!tg", name = "aq", descriptor = "(IILclient!th;)V", line = 156)
	public void method28903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class480 arg2) {
		this.aClass480ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V", line = 160)
	public void method28876() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass480ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass480ArrayArray1[local1].length; local8++) {
				this.aClass480ArrayArray1[local1][local8] = this.aClass480_3;
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "av", descriptor = "()V", line = 160)
	public void method28917() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass480ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass480ArrayArray1[local1].length; local8++) {
				this.aClass480ArrayArray1[local1][local8] = this.aClass480_3;
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(III)V", line = 168)
	public void method28867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class480 local6 = this.aClass480ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass320_63.method25893(local6.aClass320_64);
		}
		this.method28882();
	}

	@OriginalMember(owner = "client!tg", name = "ax", descriptor = "(II)V", line = 168)
	public void method28893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class480 local6 = this.aClass480ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass320_63.method25893(local6.aClass320_64);
		}
		this.method28882();
	}

	@OriginalMember(owner = "client!tg", name = "az", descriptor = "(Lclient!om;)Lclient!th;", line = 174)
	Class480 method28906(@OriginalArg(0) Class370 arg0) {
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class318.method25855(client.anInt3039 * 1115111877) || Class108.method21938(client.anInt3039 * 1115111877)) {
			local3 = Class586.anInt5460 * -1129330577 >> 12;
			local5 = Class149.anInt3434 * -324079631 >> 12;
		} else {
			if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray241[0] >> 3;
				local5 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method26943() >> 3 || local5 < 0 || local5 >= arg0.method27062() >> 3) {
				local3 = arg0.method26943() >> 4;
				local5 = arg0.method27062() >> 4;
			}
		}
		@Pc(83) Class480 local83 = this.aClass480ArrayArray1[local3][local5];
		if (local83 == null) {
			local83 = this.aClass480_3;
		}
		return local83;
	}

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "(Lclient!om;I)Lclient!th;", line = 174)
	Class480 method28914(@OriginalArg(0) Class370 arg0) {
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class318.method25855(client.anInt3039 * 1115111877) || Class108.method21938(client.anInt3039 * 1115111877)) {
			local3 = Class586.anInt5460 * -1129330577 >> 12;
			local5 = Class149.anInt3434 * -324079631 >> 12;
		} else {
			if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray241[0] >> 3;
				local5 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method26943() >> 3 || local5 < 0 || local5 >= arg0.method27062() >> 3) {
				local3 = arg0.method26943() >> 4;
				local5 = arg0.method27062() >> 4;
			}
		}
		@Pc(83) Class480 local83 = this.aClass480ArrayArray1[local3][local5];
		if (local83 == null) {
			local83 = this.aClass480_3;
		}
		return local83;
	}

	@OriginalMember(owner = "client!tg", name = "al", descriptor = "(Lclient!th;I)V", line = 197)
	void method28878(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean799) {
			this.aBoolean799 = false;
			arg1 = 0;
		}
		if (this.aClass480_1.method28938(arg0)) {
			return;
		}
		this.aClass480_1.method28959(arg0);
		this.aLong279 = Class176.method23413() * 6605378731801404841L;
		this.anInt5146 = (this.anInt5145 = arg1 * 1284526975) * 1930546813;
		if (this.anInt5146 * -1604998229 == 0) {
			return;
		}
		this.aClass480_5.method28959(this.aClass480_2);
		if (this.aClass480_2.aClass395_3 == null) {
			return;
		}
		if (this.aClass480_2.aClass395_3.method27451()) {
			this.aClass480_2.aClass395_3 = this.aClass480_5.aClass395_3 = this.aClass480_2.aClass395_3.method27452();
		}
		if (this.aClass480_2.aClass395_3 != null && this.aClass480_1.aClass395_3 != this.aClass480_2.aClass395_3) {
			this.aClass480_2.aClass395_3.method27448(this.aClass480_1.aClass395_3);
		}
	}

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "(Lclient!th;IS)V", line = 197)
	void method28879(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean799) {
			this.aBoolean799 = false;
			arg1 = 0;
		}
		if (this.aClass480_1.method28938(arg0)) {
			return;
		}
		this.aClass480_1.method28959(arg0);
		this.aLong279 = Class176.method23413() * 6605378731801404841L;
		this.anInt5146 = (this.anInt5145 = arg1 * 1284526975) * 1930546813;
		if (this.anInt5146 * -1604998229 == 0) {
			return;
		}
		this.aClass480_5.method28959(this.aClass480_2);
		if (this.aClass480_2.aClass395_3 == null) {
			return;
		}
		if (this.aClass480_2.aClass395_3.method27451()) {
			this.aClass480_2.aClass395_3 = this.aClass480_5.aClass395_3 = this.aClass480_2.aClass395_3.method27452();
		}
		if (this.aClass480_2.aClass395_3 != null && this.aClass480_1.aClass395_3 != this.aClass480_2.aClass395_3) {
			this.aClass480_2.aClass395_3.method27448(this.aClass480_1.aClass395_3);
		}
	}

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "(I)V", line = 220)
	void method28880() {
		if (this.anInt5145 * 1901292671 < 0) {
			return;
		}
		@Pc(7) long local7 = Class176.method23413();
		this.anInt5145 = (int) ((long) this.anInt5145 - (local7 - this.aLong279 * -5287127451876258151L) * 1284526975L);
		if (this.anInt5145 * 1901292671 > 0) {
			this.aClass480_2.method28932(this.aClass21_11, this.aClass480_5, this.aClass480_1, (float) (this.anInt5146 * -1604998229 - this.anInt5145 * 1901292671) / (float) (this.anInt5146 * -1604998229));
		} else {
			this.aClass480_2.method28959(this.aClass480_1);
			if (this.aClass480_2.aClass395_3 != null) {
				this.aClass480_2.aClass395_3.method27450();
			}
			this.anInt5145 = -1284526975;
		}
		this.aLong279 = local7 * 6605378731801404841L;
	}

	@OriginalMember(owner = "client!tg", name = "ao", descriptor = "()V", line = 220)
	void method28908() {
		if (this.anInt5145 * 1901292671 < 0) {
			return;
		}
		@Pc(7) long local7 = Class176.method23413();
		this.anInt5145 = (int) ((long) this.anInt5145 - (local7 - this.aLong279 * -5287127451876258151L) * 1284526975L);
		if (this.anInt5145 * 1901292671 > 0) {
			this.aClass480_2.method28932(this.aClass21_11, this.aClass480_5, this.aClass480_1, (float) (this.anInt5146 * -1604998229 - this.anInt5145 * 1901292671) / (float) (this.anInt5146 * -1604998229));
		} else {
			this.aClass480_2.method28959(this.aClass480_1);
			if (this.aClass480_2.aClass395_3 != null) {
				this.aClass480_2.aClass395_3.method27450();
			}
			this.anInt5145 = -1284526975;
		}
		this.aLong279 = local7 * 6605378731801404841L;
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V", line = 236)
	public void method28901() {
		this.aBoolean799 = true;
	}

	@OriginalMember(owner = "client!tg", name = "ap", descriptor = "()V", line = 236)
	public void method28909() {
		this.aBoolean799 = true;
	}

	@OriginalMember(owner = "client!tg", name = "au", descriptor = "()V", line = 236)
	public void method28911() {
		this.aBoolean799 = true;
	}

	@OriginalMember(owner = "client!tg", name = "ab", descriptor = "()V", line = 236)
	public void method28919() {
		this.aBoolean799 = true;
	}

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "(I)V", line = 240)
	void method28882() {
		this.aClass21_11.method17111(((float) Class510.aClass3_Sub45_37.aClass60_Sub1_1.method12641() * 0.1F + 0.7F + client.aClass370_1.method26947()) * this.aClass480_2.aFloat318);
		this.aClass21_11.method17132(this.aClass480_2.anInt5147 * 2001152667, this.aClass480_2.aFloat310, this.aClass480_2.aFloat311, (float) ((int) this.aClass320_63.aFloat259 << 2), (float) ((int) this.aClass320_63.aFloat260 << 2), (float) ((int) this.aClass320_63.aFloat261 << 2));
		this.aClass21_11.method17400(this.aClass480_2.aClass18_2);
	}

	@OriginalMember(owner = "client!tg", name = "ay", descriptor = "()V", line = 240)
	void method28912() {
		this.aClass21_11.method17111(((float) Class510.aClass3_Sub45_37.aClass60_Sub1_1.method12641() * 0.1F + 0.7F + client.aClass370_1.method26947()) * this.aClass480_2.aFloat318);
		this.aClass21_11.method17132(this.aClass480_2.anInt5147 * 2001152667, this.aClass480_2.aFloat310, this.aClass480_2.aFloat311, (float) ((int) this.aClass320_63.aFloat259 << 2), (float) ((int) this.aClass320_63.aFloat260 << 2), (float) ((int) this.aClass320_63.aFloat261 << 2));
		this.aClass21_11.method17400(this.aClass480_2.aClass18_2);
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(FFFIIIIII)V", line = 246)
	public void method28883(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass21_11.method17111(((float) Class510.aClass3_Sub45_37.aClass60_Sub1_1.method12641() * 0.1F + 0.7F + client.aClass370_1.method26947()) * arg0);
		this.aClass21_11.method17132(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass21_11.method17400(this.method28872(arg7));
	}

	@OriginalMember(owner = "client!tg", name = "ag", descriptor = "(FFFIIIII)V", line = 246)
	public void method28913(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass21_11.method17111(((float) Class510.aClass3_Sub45_37.aClass60_Sub1_1.method12641() * 0.1F + 0.7F + client.aClass370_1.method26947()) * arg0);
		this.aClass21_11.method17132(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass21_11.method17400(this.method28872(arg7));
	}

	@OriginalMember(owner = "client!tg", name = "ar", descriptor = "()V", line = 252)
	public void method28877() {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = (this.aClass480_2.anInt5149 * 864549783 + 256 << 2) + local1;
		this.aClass21_11.method17114(this.aClass480_2.anInt5148 * 1583725583, Class510.aClass3_Sub45_37.aClass60_Sub5_1.method12923() == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!tg", name = "am", descriptor = "()V", line = 252)
	public void method28887() {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = (this.aClass480_2.anInt5149 * 864549783 + 256 << 2) + local1;
		this.aClass21_11.method17114(this.aClass480_2.anInt5148 * 1583725583, Class510.aClass3_Sub45_37.aClass60_Sub5_1.method12923() == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "(B)V", line = 252)
	public void method28905() {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = (this.aClass480_2.anInt5149 * 864549783 + 256 << 2) + local1;
		this.aClass21_11.method17114(this.aClass480_2.anInt5148 * 1583725583, Class510.aClass3_Sub45_37.aClass60_Sub5_1.method12923() == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!tg", name = "ae", descriptor = "()V", line = 252)
	public void method28916() {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = (this.aClass480_2.anInt5149 * 864549783 + 256 << 2) + local1;
		this.aClass21_11.method17114(this.aClass480_2.anInt5148 * 1583725583, Class510.aClass3_Sub45_37.aClass60_Sub5_1.method12923() == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!tg", name = "ad", descriptor = "()V", line = 258)
	void method28868() {
		this.aClass21_11.method17112(this.aClass480_2.aFloat313, this.aClass480_2.aFloat312, this.aClass480_2.aFloat308);
	}

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "(I)V", line = 258)
	void method28885() {
		this.aClass21_11.method17112(this.aClass480_2.aFloat313, this.aClass480_2.aFloat312, this.aClass480_2.aFloat308);
	}

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "(B)V", line = 262)
	void method28886() {
		if (!this.aClass21_11.method17217()) {
			return;
		}
		if (this.aBoolean800) {
			this.aClass21_11.method17125(this.aFloat305, this.aFloat304, this.aFloat306, this.aFloat307, this.aFloat303);
		} else {
			this.aClass21_11.method17125(this.aClass480_2.aFloat314, this.aClass480_2.aFloat315, this.aClass480_2.aFloat316, this.aClass480_2.aFloat309, this.aClass480_2.aFloat317);
		}
	}

	@OriginalMember(owner = "client!tg", name = "aw", descriptor = "()V", line = 262)
	void method28910() {
		if (!this.aClass21_11.method17217()) {
			return;
		}
		if (this.aBoolean800) {
			this.aClass21_11.method17125(this.aFloat305, this.aFloat304, this.aFloat306, this.aFloat307, this.aFloat303);
		} else {
			this.aClass21_11.method17125(this.aClass480_2.aFloat314, this.aClass480_2.aFloat315, this.aClass480_2.aFloat316, this.aClass480_2.aFloat309, this.aClass480_2.aFloat317);
		}
	}

	@OriginalMember(owner = "client!tg", name = "ac", descriptor = "()V", line = 262)
	void method28918() {
		if (!this.aClass21_11.method17217()) {
			return;
		}
		if (this.aBoolean800) {
			this.aClass21_11.method17125(this.aFloat305, this.aFloat304, this.aFloat306, this.aFloat307, this.aFloat303);
		} else {
			this.aClass21_11.method17125(this.aClass480_2.aFloat314, this.aClass480_2.aFloat315, this.aClass480_2.aFloat316, this.aClass480_2.aFloat309, this.aClass480_2.aFloat317);
		}
	}

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "(S)V", line = 268)
	void method28889() {
		this.aBoolean800 = false;
		this.aFloat305 = 1.0F;
		this.aFloat304 = 0.0F;
		this.aFloat306 = 1.0F;
		this.aFloat307 = 0.0F;
		this.aFloat303 = 1.0F;
	}

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "(I)V", line = 277)
	void method28874() {
		if (!this.aClass21_11.method17366()) {
			return;
		}
		@Pc(6) Class16 local6 = null;
		@Pc(8) Class16 local8 = null;
		@Pc(10) Class16 local10 = null;
		if (!this.aBoolean798) {
			if (this.aClass480_2.anIntArray471[0] > -1) {
				local6 = this.method28923(this.aClass480_2.anIntArray471[0]);
			}
			if (this.aClass480_2.anIntArray471[1] > -1) {
				local8 = this.method28923(this.aClass480_2.anIntArray471[1]);
			}
			if (this.aClass480_2.anIntArray471[2] > -1) {
				local10 = this.method28923(this.aClass480_2.anIntArray471[2]);
			}
			this.aClass21_11.method17128(local6, this.aClass480_2.aFloatArray113[0], local8, this.aClass480_2.aFloatArray113[1], local10, this.aClass480_2.aFloatArray113[2]);
			return;
		}
		if (this.anIntArray470[0] > -1) {
			local6 = this.method28923(this.anIntArray470[0]);
		}
		if (this.anIntArray470[1] > -1) {
			local8 = this.method28923(this.anIntArray470[1]);
		}
		if (this.anIntArray470[2] > -1) {
			local10 = this.method28923(this.anIntArray470[2]);
		}
		this.aClass21_11.method17128(local6, this.aFloatArray112[0], local8, this.aFloatArray112[1], local10, this.aFloatArray112[2]);
	}

	@OriginalMember(owner = "client!tg", name = "bw", descriptor = "()V", line = 277)
	void method28891() {
		if (!this.aClass21_11.method17366()) {
			return;
		}
		@Pc(6) Class16 local6 = null;
		@Pc(8) Class16 local8 = null;
		@Pc(10) Class16 local10 = null;
		if (!this.aBoolean798) {
			if (this.aClass480_2.anIntArray471[0] > -1) {
				local6 = this.method28923(this.aClass480_2.anIntArray471[0]);
			}
			if (this.aClass480_2.anIntArray471[1] > -1) {
				local8 = this.method28923(this.aClass480_2.anIntArray471[1]);
			}
			if (this.aClass480_2.anIntArray471[2] > -1) {
				local10 = this.method28923(this.aClass480_2.anIntArray471[2]);
			}
			this.aClass21_11.method17128(local6, this.aClass480_2.aFloatArray113[0], local8, this.aClass480_2.aFloatArray113[1], local10, this.aClass480_2.aFloatArray113[2]);
			return;
		}
		if (this.anIntArray470[0] > -1) {
			local6 = this.method28923(this.anIntArray470[0]);
		}
		if (this.anIntArray470[1] > -1) {
			local8 = this.method28923(this.anIntArray470[1]);
		}
		if (this.anIntArray470[2] > -1) {
			local10 = this.method28923(this.anIntArray470[2]);
		}
		this.aClass21_11.method17128(local6, this.aFloatArray112[0], local8, this.aFloatArray112[1], local10, this.aFloatArray112[2]);
	}

	@OriginalMember(owner = "client!tg", name = "bp", descriptor = "()V", line = 277)
	void method28920() {
		if (!this.aClass21_11.method17366()) {
			return;
		}
		@Pc(6) Class16 local6 = null;
		@Pc(8) Class16 local8 = null;
		@Pc(10) Class16 local10 = null;
		if (!this.aBoolean798) {
			if (this.aClass480_2.anIntArray471[0] > -1) {
				local6 = this.method28923(this.aClass480_2.anIntArray471[0]);
			}
			if (this.aClass480_2.anIntArray471[1] > -1) {
				local8 = this.method28923(this.aClass480_2.anIntArray471[1]);
			}
			if (this.aClass480_2.anIntArray471[2] > -1) {
				local10 = this.method28923(this.aClass480_2.anIntArray471[2]);
			}
			this.aClass21_11.method17128(local6, this.aClass480_2.aFloatArray113[0], local8, this.aClass480_2.aFloatArray113[1], local10, this.aClass480_2.aFloatArray113[2]);
			return;
		}
		if (this.anIntArray470[0] > -1) {
			local6 = this.method28923(this.anIntArray470[0]);
		}
		if (this.anIntArray470[1] > -1) {
			local8 = this.method28923(this.anIntArray470[1]);
		}
		if (this.anIntArray470[2] > -1) {
			local10 = this.method28923(this.anIntArray470[2]);
		}
		this.aClass21_11.method17128(local6, this.aFloatArray112[0], local8, this.aFloatArray112[1], local10, this.aFloatArray112[2]);
	}

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "(I)V", line = 296)
	void method28904() {
		this.aBoolean798 = false;
		@Pc(5) int[] local5 = this.anIntArray470;
		@Pc(8) int[] local8 = this.anIntArray470;
		this.anIntArray470[2] = -1;
		local8[1] = -1;
		local5[0] = -1;
		@Pc(24) float[] local24 = this.aFloatArray112;
		@Pc(27) float[] local27 = this.aFloatArray112;
		this.aFloatArray112[2] = 0.0F;
		local27[1] = 0.0F;
		local24[0] = 0.0F;
	}

	@OriginalMember(owner = "client!tg", name = "bd", descriptor = "()V", line = 296)
	void method28921() {
		this.aBoolean798 = false;
		@Pc(5) int[] local5 = this.anIntArray470;
		@Pc(8) int[] local8 = this.anIntArray470;
		this.anIntArray470[2] = -1;
		local8[1] = -1;
		local5[0] = -1;
		@Pc(24) float[] local24 = this.aFloatArray112;
		@Pc(27) float[] local27 = this.aFloatArray112;
		this.aFloatArray112[2] = 0.0F;
		local27[1] = 0.0F;
		local24[0] = 0.0F;
	}

	@OriginalMember(owner = "client!tg", name = "bm", descriptor = "()V", line = 310)
	public void method28888() {
		this.aClass21_11.method17111(((float) Class510.aClass3_Sub45_37.aClass60_Sub1_1.method12641() * 0.1F + 0.7F + client.aClass370_1.method26947()) * 1.1523438F);
		this.aClass21_11.method17132(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass21_11.method17114(13156520, -1, 0);
		this.aClass21_11.method17400(aClass18_1);
	}

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "(I)V", line = 310)
	public void method28890() {
		this.aClass21_11.method17111(((float) Class510.aClass3_Sub45_37.aClass60_Sub1_1.method12641() * 0.1F + 0.7F + client.aClass370_1.method26947()) * 1.1523438F);
		this.aClass21_11.method17132(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass21_11.method17114(13156520, -1, 0);
		this.aClass21_11.method17400(aClass18_1);
	}

	@OriginalMember(owner = "client!tg", name = "bs", descriptor = "()V", line = 310)
	public void method28922() {
		this.aClass21_11.method17111(((float) Class510.aClass3_Sub45_37.aClass60_Sub1_1.method12641() * 0.1F + 0.7F + client.aClass370_1.method26947()) * 1.1523438F);
		this.aClass21_11.method17132(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass21_11.method17114(13156520, -1, 0);
		this.aClass21_11.method17400(aClass18_1);
	}

	@OriginalMember(owner = "client!tg", name = "bf", descriptor = "()V", line = 310)
	public void method28924() {
		this.aClass21_11.method17111(((float) Class510.aClass3_Sub45_37.aClass60_Sub1_1.method12641() * 0.1F + 0.7F + client.aClass370_1.method26947()) * 1.1523438F);
		this.aClass21_11.method17132(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass21_11.method17114(13156520, -1, 0);
		this.aClass21_11.method17400(aClass18_1);
	}

	@OriginalMember(owner = "client!tg", name = "iq", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 5543)
	static final void method28925(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 -= 1248498196;
		arg0.anInt3514 = arg2.anIntArray496[arg2.anInt5319 * 960738381] * 1702990945;
		arg0.anInt3493 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 1] * -1649738339;
		if (arg2.anIntArray496[arg2.anInt5319 * 960738381 + 2] == 1) {
			arg0.anInt3513 = 725735039;
		} else {
			arg0.anInt3513 = 167879224;
		}
		if (arg2.anIntArray496[arg2.anInt5319 * 960738381 + 3] == 1) {
			arg0.aBoolean642 = true;
		} else {
			arg0.aBoolean642 = false;
		}
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class401.method27610(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!tg", name = "uf", descriptor = "(Lclient!vs;I)V", line = 7867)
	static final void method28926(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(28) boolean local28 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] == 1;
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class394.method27446(local13, local28);
	}

	@OriginalMember(owner = "client!tg", name = "avd", descriptor = "(Lclient!vs;S)V", line = 12810)
	static final void method28927(@OriginalArg(0) Class536 arg0) {
		Class203.method24169();
	}
}

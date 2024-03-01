package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yd")
public class Class679 {

	@OriginalMember(owner = "client!yd", name = "e", descriptor = "Lclient!ve;")
	final Class611 aClass611_3;

	@OriginalMember(owner = "client!yd", name = "n", descriptor = "I")
	final int anInt5887;

	@OriginalMember(owner = "client!yd", name = "<init>", descriptor = "(Lclient!ve;I)V", line = 13)
	public Class679(@OriginalArg(0) Class611 arg0, @OriginalArg(1) int arg1) {
		this.aClass611_3 = arg0;
		this.anInt5887 = arg1 * 191282359;
	}

	@OriginalMember(owner = "client!yd", name = "k", descriptor = "(Lclient!alw;I)Lclient!kp;", line = 16)
	public static Class125 method33237(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) Class125 local3 = Class32_Sub4.method16727(arg0);
		@Pc(7) int local7 = arg0.method22419();
		@Pc(11) int local11 = arg0.method22419();
		return new Class125_Sub3(local3.aClass390_7, local3.aClass392_7, local3.anInt2981 * 483768335, local3.anInt2982 * 2099407685, local3.anInt2983 * 1135283731, local3.anInt2980 * -1017655207, local3.anInt2985 * -1946839755, local3.anInt2986 * -1726029297, local3.anInt2984 * 291173831, local7, local11);
	}

	@OriginalMember(owner = "client!yd", name = "e", descriptor = "(I)Lclient!aut;", line = 19)
	public Class132_Sub1_Sub5_Sub1 method33234() {
		@Pc(25) Class93_Sub5 local25 = (Class93_Sub5) client.aClass16_20.method215((long) (this.aClass611_3.anInt5625 * -78984409 << 28 | this.aClass611_3.anInt5624 * -1994307635 << 14 | this.aClass611_3.anInt5623 * 270611681));
		if (local25 == null) {
			return null;
		}
		@Pc(34) Class611 local34 = client.aClass532_1.method30443();
		@Pc(45) int local45 = this.aClass611_3.anInt5623 * 270611681 - local34.anInt5623 * 270611681;
		@Pc(56) int local56 = this.aClass611_3.anInt5624 * -1994307635 - local34.anInt5624 * -1994307635;
		if (local45 >= 0 && local56 >= 0 && local45 < client.aClass532_1.method30444() && local56 < client.aClass532_1.method30474() && client.aClass532_1.method30459() != null) {
			for (@Pc(80) Class93_Sub3 local80 = (Class93_Sub3) local25.aClass22_17.method445(); local80 != null; local80 = (Class93_Sub3) local25.aClass22_17.method415()) {
				if (local80.anInt1405 * -308533965 == this.anInt5887 * -1840455417) {
					return (Class132_Sub1_Sub5_Sub1) client.aClass532_1.method30459().method31465(this.aClass611_3.anInt5625 * -78984409, local45, local56);
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!yd", name = "n", descriptor = "()Lclient!aut;", line = 19)
	public Class132_Sub1_Sub5_Sub1 method33235() {
		@Pc(25) Class93_Sub5 local25 = (Class93_Sub5) client.aClass16_20.method215((long) (this.aClass611_3.anInt5625 * -78984409 << 28 | this.aClass611_3.anInt5624 * -1994307635 << 14 | this.aClass611_3.anInt5623 * 270611681));
		if (local25 == null) {
			return null;
		}
		@Pc(34) Class611 local34 = client.aClass532_1.method30443();
		@Pc(45) int local45 = this.aClass611_3.anInt5623 * 270611681 - local34.anInt5623 * 270611681;
		@Pc(56) int local56 = this.aClass611_3.anInt5624 * -1994307635 - local34.anInt5624 * -1994307635;
		if (local45 >= 0 && local56 >= 0 && local45 < client.aClass532_1.method30444() && local56 < client.aClass532_1.method30474() && client.aClass532_1.method30459() != null) {
			for (@Pc(80) Class93_Sub3 local80 = (Class93_Sub3) local25.aClass22_17.method445(); local80 != null; local80 = (Class93_Sub3) local25.aClass22_17.method415()) {
				if (local80.anInt1405 * -308533965 == this.anInt5887 * -1840455417) {
					return (Class132_Sub1_Sub5_Sub1) client.aClass532_1.method30459().method31465(this.aClass611_3.anInt5625 * -78984409, local45, local56);
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!yd", name = "ep", descriptor = "(II)Z", line = 1776)
	static boolean method33238(@OriginalArg(0) int arg0) {
		return arg0 == 13 || arg0 == 15;
	}

	@OriginalMember(owner = "client!yd", name = "abg", descriptor = "(Lclient!yf;I)V", line = 9851)
	static final void method33236(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(28) boolean local28 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] == 1;
		@Pc(38) int local38 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(43) Class304 local43 = Class557.aClass297_1.method26622(local13);
		if (local43.method26761() == null) {
			local43.method26760(client.anInterface27_1);
		}
		if (!local28) {
			@Pc(144) Class379 local144 = (Class379) Class30.aClass32_Sub16_1.method18261(local38);
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local144.method28080(local43.method26761().method781(local144.aClass108_1.anInt867 * -1284841473));
			return;
		}
		@Pc(59) Class108_Sub1 local59 = (Class108_Sub1) Class21.aClass79_Sub1_Sub1_1.method18261(local38);
		switch(local59.aClass519_6.aClass500_7.anInt5196 * -1217885029) {
			case 2:
				arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local43.method26761().method781(local59.anInt867 * -1284841473);
				break;
			case 4:
				arg0.aLongArray27[(arg0.anInt5894 += -1364417339) * -2000995827 - 1] = local43.method26761().method779(local59.anInt867 * -1284841473);
				break;
			default:
				arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local43.method26761().method775(local59.anInt867 * -1284841473);
		}
	}
}

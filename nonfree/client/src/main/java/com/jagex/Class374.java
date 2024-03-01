package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public class Class374 {

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "Lclient!ox;")
	Class380 aClass380_3;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "Lclient!and;")
	Class3_Sub41_Sub1 aClass3_Sub41_Sub1_3;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!ox;Lclient!and;)V", line = 9)
	public Class374(@OriginalArg(0) Class380 arg0, @OriginalArg(1) Class3_Sub41_Sub1 arg1) {
		this.aClass380_3 = arg0;
		this.aClass3_Sub41_Sub1_3 = arg1;
	}

	@OriginalMember(owner = "client!oq", name = "at", descriptor = "(Lclient!and;B)V", line = 921)
	static void method27227(@OriginalArg(0) Class3_Sub41_Sub1 arg0) {
		arg0.method20254(Class491.aClass359_91.method26749());
		arg0.method20254(Class602.aClass359_112.method26749());
		arg0.method20254(Class73.aClass359_25.method26749());
		arg0.method20254(Class453.aClass359_77.method26749());
		arg0.method20254(Class430.aClass359_74.method26749());
		arg0.method20254(Class55.aClass359_17.method26749());
		arg0.method20254(Class294.aClass359_54.method26749());
		arg0.method20254(Class72.aClass359_23.method26749());
		arg0.method20254(Class403.aClass359_66.method26749());
		arg0.method20254(Class474.aClass359_85.method26749());
		arg0.method20254(Class475.aClass359_86.method26749());
		if (!Class202.aBoolean664) {
			arg0.method20254(Class462.aClass359_82.method26749());
		}
		arg0.method20254(Class448.aClass359_76.method26749());
		arg0.method20254(Class580.aClass359_105.method26749());
		arg0.method20254(Class534.aClass359_97.method26749());
		arg0.method20254(Class13_Sub18.aClass359_3.method26749());
		arg0.method20254(Class27_Sub1.aClass359_4.method26749());
		arg0.method20254(Class400.aClass359_64.method26749());
		arg0.method20254(Class52.aClass359_16.method26749());
		arg0.method20254(Class579.aClass359_102.method26749());
		arg0.method20254(Class403.aClass359_65.method26749());
		arg0.method20254(Class623.aClass359_116.method26749());
		arg0.method20254(Class50_Sub1.aClass359_15.method26749());
		arg0.method20254(Class485.aClass359_90.method26749());
		arg0.method20254(Class276.aClass359_52.method26749());
		arg0.method20254(Class161.aClass359_35.method26749());
		arg0.method20254(Class557.aClass359_98.method26749());
		arg0.method20254(Class127.aClass359_33.method26749());
		arg0.method20254(Class506.method29550());
		arg0.method20254(Class1.method7());
		arg0.method20254(Class329.aClass359_60.method26749());
		arg0.method20254(Class343.aClass359_63.method26749());
		arg0.method20254(Class13_Sub6.aClass359_2.method26749());
		arg0.method20254(0);
		arg0.method20254(0);
		if (!Class202.aBoolean664) {
			arg0.method20254(Class427.aClass359_71.method26749());
		}
	}

	@OriginalMember(owner = "client!oq", name = "ja", descriptor = "(Lclient!vs;B)V", line = 5769)
	static final void method27225(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class199.method24132(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!oq", name = "wg", descriptor = "(Lclient!vs;I)V", line = 8035)
	static final void method27226(@OriginalArg(0) Class536 arg0) {
		Class346.method26516(Class3_Sub45.method13020(), arg0);
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yp")
public class Class606 {

	@OriginalMember(owner = "client!yp", name = "p", descriptor = "Lclient!yp;")
	static final Class606 aClass606_3 = new Class606();

	@OriginalMember(owner = "client!yp", name = "a", descriptor = "Lclient!yp;")
	static final Class606 aClass606_2 = new Class606();

	@OriginalMember(owner = "client!yp", name = "g", descriptor = "Lclient!yp;")
	static final Class606 aClass606_1 = new Class606();

	@OriginalMember(owner = "client!yp", name = "l", descriptor = "Lclient!yp;")
	static final Class606 aClass606_4 = new Class606();

	@OriginalMember(owner = "client!yp", name = "<init>", descriptor = "()V", line = 9)
	Class606() {
	}

	@OriginalMember(owner = "client!yp", name = "p", descriptor = "(ZI)V", line = 56)
	public static void method33538(@OriginalArg(0) boolean arg0) {
		@Pc(4) Class3_Sub20 local4;
		for (local4 = (Class3_Sub20) Class3_Sub20.aClass553_19.method32768(); local4 != null; local4 = (Class3_Sub20) Class3_Sub20.aClass553_19.method32709()) {
			if (local4.aClass366_3 != null) {
				local4.aClass366_3.method26819(150);
				Class510.aClass183_1.method23684(local4.aClass366_3);
				local4.aClass366_3 = null;
			}
			if (local4.aClass366_4 != null) {
				local4.aClass366_4.method26819(150);
				Class510.aClass183_1.method23684(local4.aClass366_4);
				local4.aClass366_4 = null;
			}
			local4.method33656();
		}
		if (!arg0) {
			return;
		}
		for (local4 = (Class3_Sub20) Class3_Sub20.aClass553_18.method32768(); local4 != null; local4 = (Class3_Sub20) Class3_Sub20.aClass553_18.method32709()) {
			if (local4.aClass366_3 != null) {
				local4.aClass366_3.method26819(150);
				Class510.aClass183_1.method23684(local4.aClass366_3);
				local4.aClass366_3 = null;
			}
			local4.method33656();
		}
		for (local4 = (Class3_Sub20) Class3_Sub20.aClass581_9.method33221(); local4 != null; local4 = (Class3_Sub20) Class3_Sub20.aClass581_9.method33231()) {
			if (local4.aClass366_3 != null) {
				local4.aClass366_3.method26819(150);
				Class510.aClass183_1.method23684(local4.aClass366_3);
				local4.aClass366_3 = null;
			}
			local4.method33656();
		}
	}

	@OriginalMember(owner = "client!yp", name = "nl", descriptor = "(Lclient!vs;B)V", line = 6504)
	static final void method33539(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class445.method28334(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!yp", name = "sj", descriptor = "(Lclient!vs;S)V", line = 7441)
	static final void method33541(@OriginalArg(0) Class536 arg0) {
		Class527.method32428(arg0);
	}

	@OriginalMember(owner = "client!yp", name = "arq", descriptor = "(Lclient!vs;B)V", line = 12152)
	static final void method33540(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class613.aBoolean849 ? 1 : 0;
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoz")
public class Class26_Sub1_Sub1_Sub6 extends Class26_Sub1_Sub1 {

	@OriginalMember(owner = "client!aoz", name = "k", descriptor = "Lclient!pv;")
	Class398 aClass398_1;

	@OriginalMember(owner = "client!aoz", name = "<init>", descriptor = "(Lclient!rp;Lclient!pv;IIIII)V", line = 18)
	Class26_Sub1_Sub1_Sub6(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class398 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, arg2, arg3, arg4, arg5, arg6, arg4 >> 9, arg4 >> 9, arg6 >> 9, arg6 >> 9, false, (byte) 0);
		this.aClass398_1 = arg1;
	}

	@OriginalMember(owner = "client!aoz", name = "fh", descriptor = "(Lclient!de;IIB)Z", line = 23)
	@Override
	boolean method21486(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!aoz", name = "fy", descriptor = "(Lclient!de;II)Z", line = 23)
	@Override
	boolean method21493(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!aoz", name = "fv", descriptor = "(Lclient!de;II)Z", line = 23)
	@Override
	boolean method21492(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!aoz", name = "fu", descriptor = "(B)Z", line = 27)
	@Override
	boolean method21465() {
		return false;
	}

	@OriginalMember(owner = "client!aoz", name = "fw", descriptor = "()Z", line = 27)
	@Override
	boolean method21495() {
		return false;
	}

	@OriginalMember(owner = "client!aoz", name = "fe", descriptor = "()Z", line = 27)
	@Override
	boolean method21503() {
		return false;
	}

	@OriginalMember(owner = "client!aoz", name = "bs", descriptor = "(B)Z", line = 31)
	@Override
	boolean method21472() {
		return true;
	}

	@OriginalMember(owner = "client!aoz", name = "cp", descriptor = "()Z", line = 31)
	@Override
	boolean method21501() {
		return true;
	}

	@OriginalMember(owner = "client!aoz", name = "cc", descriptor = "()Z", line = 31)
	@Override
	boolean method21491() {
		return true;
	}

	@OriginalMember(owner = "client!aoz", name = "bm", descriptor = "(I)Z", line = 35)
	@Override
	boolean method21467() {
		return false;
	}

	@OriginalMember(owner = "client!aoz", name = "cx", descriptor = "()Z", line = 35)
	@Override
	boolean method21468() {
		return false;
	}

	@OriginalMember(owner = "client!aoz", name = "ct", descriptor = "()Z", line = 35)
	@Override
	boolean method21484() {
		return false;
	}

	@OriginalMember(owner = "client!aoz", name = "cs", descriptor = "()Z", line = 35)
	@Override
	boolean method21483() {
		return false;
	}

	@OriginalMember(owner = "client!aoz", name = "fg", descriptor = "(Lclient!de;Lclient!ahn;IIIZI)V", line = 38)
	@Override
	void method21511(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!aoz", name = "fc", descriptor = "(Lclient!de;Lclient!ahn;IIIZ)V", line = 38)
	@Override
	void method21510(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!aoz", name = "fo", descriptor = "()V", line = 39)
	@Override
	void method21481() {
	}

	@OriginalMember(owner = "client!aoz", name = "fl", descriptor = "()V", line = 39)
	@Override
	void method21497() {
	}

	@OriginalMember(owner = "client!aoz", name = "fb", descriptor = "(I)V", line = 39)
	@Override
	void method21469() {
	}

	@OriginalMember(owner = "client!aoz", name = "ff", descriptor = "(Lclient!de;)Lclient!ry;", line = 42)
	@Override
	Class446 method21494(@OriginalArg(0) Class21 arg0) {
		if (this.aClass398_1.aClass20_8 == null) {
			return null;
		}
		@Pc(8) Class332 local8 = arg0.method17098();
		@Pc(11) Class332 local11 = this.method21433();
		@Pc(14) Class322 local14 = this.method21431();
		local8.method26235(local11);
		@Pc(38) Class432 local38 = this.aClass438_23.aClass432ArrayArrayArray3[this.aByte101][(int) local14.aClass320_61.aFloat259 >> 9][(int) local14.aClass320_61.aFloat261 >> 9];
		if (local38 != null && local38.aClass26_Sub1_Sub2_1 != null) {
			local8.method26203(0.0F, (float) -local38.aClass26_Sub1_Sub2_1.aShort60, 0.0F);
		}
		this.aClass398_1.aClass20_8.method5352(local8, null, 0);
		return null;
	}

	@OriginalMember(owner = "client!aoz", name = "fj", descriptor = "(Lclient!de;)Lclient!ry;", line = 42)
	@Override
	Class446 method21500(@OriginalArg(0) Class21 arg0) {
		if (this.aClass398_1.aClass20_8 == null) {
			return null;
		}
		@Pc(8) Class332 local8 = arg0.method17098();
		@Pc(11) Class332 local11 = this.method21433();
		@Pc(14) Class322 local14 = this.method21431();
		local8.method26235(local11);
		@Pc(38) Class432 local38 = this.aClass438_23.aClass432ArrayArrayArray3[this.aByte101][(int) local14.aClass320_61.aFloat259 >> 9][(int) local14.aClass320_61.aFloat261 >> 9];
		if (local38 != null && local38.aClass26_Sub1_Sub2_1 != null) {
			local8.method26203(0.0F, (float) -local38.aClass26_Sub1_Sub2_1.aShort60, 0.0F);
		}
		this.aClass398_1.aClass20_8.method5352(local8, null, 0);
		return null;
	}

	@OriginalMember(owner = "client!aoz", name = "fk", descriptor = "(Lclient!de;)Lclient!ry;", line = 42)
	@Override
	Class446 method21499(@OriginalArg(0) Class21 arg0) {
		if (this.aClass398_1.aClass20_8 == null) {
			return null;
		}
		@Pc(8) Class332 local8 = arg0.method17098();
		@Pc(11) Class332 local11 = this.method21433();
		@Pc(14) Class322 local14 = this.method21431();
		local8.method26235(local11);
		@Pc(38) Class432 local38 = this.aClass438_23.aClass432ArrayArrayArray3[this.aByte101][(int) local14.aClass320_61.aFloat259 >> 9][(int) local14.aClass320_61.aFloat261 >> 9];
		if (local38 != null && local38.aClass26_Sub1_Sub2_1 != null) {
			local8.method26203(0.0F, (float) -local38.aClass26_Sub1_Sub2_1.aShort60, 0.0F);
		}
		this.aClass398_1.aClass20_8.method5352(local8, null, 0);
		return null;
	}

	@OriginalMember(owner = "client!aoz", name = "fs", descriptor = "(Lclient!de;B)Lclient!ry;", line = 42)
	@Override
	Class446 method21470(@OriginalArg(0) Class21 arg0) {
		if (this.aClass398_1.aClass20_8 == null) {
			return null;
		}
		@Pc(8) Class332 local8 = arg0.method17098();
		@Pc(11) Class332 local11 = this.method21433();
		@Pc(14) Class322 local14 = this.method21431();
		local8.method26235(local11);
		@Pc(38) Class432 local38 = this.aClass438_23.aClass432ArrayArrayArray3[this.aByte101][(int) local14.aClass320_61.aFloat259 >> 9][(int) local14.aClass320_61.aFloat261 >> 9];
		if (local38 != null && local38.aClass26_Sub1_Sub2_1 != null) {
			local8.method26203(0.0F, (float) -local38.aClass26_Sub1_Sub2_1.aShort60, 0.0F);
		}
		this.aClass398_1.aClass20_8.method5352(local8, null, 0);
		return null;
	}

	@OriginalMember(owner = "client!aoz", name = "fa", descriptor = "(Lclient!de;)Lclient!ry;", line = 42)
	@Override
	Class446 method21488(@OriginalArg(0) Class21 arg0) {
		if (this.aClass398_1.aClass20_8 == null) {
			return null;
		}
		@Pc(8) Class332 local8 = arg0.method17098();
		@Pc(11) Class332 local11 = this.method21433();
		@Pc(14) Class322 local14 = this.method21431();
		local8.method26235(local11);
		@Pc(38) Class432 local38 = this.aClass438_23.aClass432ArrayArrayArray3[this.aByte101][(int) local14.aClass320_61.aFloat259 >> 9][(int) local14.aClass320_61.aFloat261 >> 9];
		if (local38 != null && local38.aClass26_Sub1_Sub2_1 != null) {
			local8.method26203(0.0F, (float) -local38.aClass26_Sub1_Sub2_1.aShort60, 0.0F);
		}
		this.aClass398_1.aClass20_8.method5352(local8, null, 0);
		return null;
	}

	@OriginalMember(owner = "client!aoz", name = "fx", descriptor = "(Lclient!de;I)V", line = 53)
	@Override
	void method21485(@OriginalArg(0) Class21 arg0) {
	}

	@OriginalMember(owner = "client!aoz", name = "fq", descriptor = "(Lclient!de;)V", line = 53)
	@Override
	void method21502(@OriginalArg(0) Class21 arg0) {
	}

	@OriginalMember(owner = "client!aoz", name = "fn", descriptor = "(Lclient!de;I)Lclient!rc;", line = 56)
	@Override
	public Class426 method21474(@OriginalArg(0) Class21 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aoz", name = "fd", descriptor = "(Lclient!de;)Lclient!rc;", line = 56)
	@Override
	public Class426 method21471(@OriginalArg(0) Class21 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aoz", name = "fz", descriptor = "(Lclient!de;)Lclient!rc;", line = 56)
	@Override
	public Class426 method21489(@OriginalArg(0) Class21 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aoz", name = "bd", descriptor = "(I)I", line = 60)
	@Override
	public int method21508() {
		return this.aClass398_1.aClass20_8 == null ? 0 : this.aClass398_1.aClass20_8.method5466();
	}

	@OriginalMember(owner = "client!aoz", name = "cy", descriptor = "()I", line = 60)
	@Override
	public int method21527() {
		return this.aClass398_1.aClass20_8 == null ? 0 : this.aClass398_1.aClass20_8.method5466();
	}

	@OriginalMember(owner = "client!aoz", name = "cb", descriptor = "()I", line = 60)
	@Override
	public int method21487() {
		return this.aClass398_1.aClass20_8 == null ? 0 : this.aClass398_1.aClass20_8.method5466();
	}
}

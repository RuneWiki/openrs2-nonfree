package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!auu")
public class Class132_Sub1_Sub1_Sub6 extends Class132_Sub1_Sub1 {

	@OriginalMember(owner = "client!auu", name = "ae", descriptor = "Lclient!ta;")
	Class567 aClass567_1;

	@OriginalMember(owner = "client!auu", name = "<init>", descriptor = "(Lclient!tx;Lclient!ta;IIIII)V", line = 18)
	Class132_Sub1_Sub1_Sub6(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class567 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, arg2, arg3, arg4, arg5, arg6, arg4 >> 9, arg4 >> 9, arg6 >> 9, arg6 >> 9, false, (byte) 0);
		this.aClass567_1 = arg1;
	}

	@OriginalMember(owner = "client!auu", name = "fk", descriptor = "(Lclient!dh;II)Z", line = 23)
	@Override
	boolean method24290(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "fa", descriptor = "(Lclient!dh;IIB)Z", line = 23)
	@Override
	boolean method24259(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "fp", descriptor = "(I)Z", line = 27)
	@Override
	boolean method24261() {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "fh", descriptor = "()Z", line = 27)
	@Override
	boolean method24272() {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "fr", descriptor = "()Z", line = 27)
	@Override
	boolean method24292() {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "bu", descriptor = "(B)Z", line = 31)
	@Override
	boolean method24262() {
		return true;
	}

	@OriginalMember(owner = "client!auu", name = "cf", descriptor = "()Z", line = 31)
	@Override
	boolean method24299() {
		return true;
	}

	@OriginalMember(owner = "client!auu", name = "co", descriptor = "()Z", line = 31)
	@Override
	boolean method24278() {
		return true;
	}

	@OriginalMember(owner = "client!auu", name = "bw", descriptor = "(S)Z", line = 35)
	@Override
	boolean method24263() {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "cm", descriptor = "()Z", line = 35)
	@Override
	boolean method24280() {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "cr", descriptor = "()Z", line = 35)
	@Override
	boolean method24279() {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "cq", descriptor = "()Z", line = 35)
	@Override
	boolean method24281() {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V", line = 38)
	@Override
	void method24269(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!auu", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 38)
	@Override
	void method24293(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!auu", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 38)
	@Override
	void method24296(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!auu", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 38)
	@Override
	void method24295(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!auu", name = "ff", descriptor = "(B)V", line = 39)
	@Override
	void method24265() {
	}

	@OriginalMember(owner = "client!auu", name = "go", descriptor = "()V", line = 39)
	@Override
	void method24257() {
	}

	@OriginalMember(owner = "client!auu", name = "gk", descriptor = "()V", line = 39)
	@Override
	void method24297() {
	}

	@OriginalMember(owner = "client!auu", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;", line = 42)
	@Override
	Class573 method24271(@OriginalArg(0) Class104 arg0) {
		if (this.aClass567_1.aClass109_8 == null) {
			return null;
		}
		@Pc(9) Class470 local9 = arg0.method20508();
		@Pc(12) Class470 local12 = this.method24226();
		@Pc(15) Class458 local15 = this.method24229();
		local9.method29364(local12);
		@Pc(39) Class572 local39 = this.aClass585_23.aClass572ArrayArrayArray3[this.aByte100][(int) local15.aClass472_61.aFloat317 >> 9][(int) local15.aClass472_61.aFloat319 >> 9];
		if (local39 != null && local39.aClass132_Sub1_Sub4_1 != null) {
			local9.method29387(0.0F, (float) -local39.aClass132_Sub1_Sub4_1.aShort97, 0.0F);
		}
		this.aClass567_1.aClass109_8.method6947(local9, null, 0);
		return null;
	}

	@OriginalMember(owner = "client!auu", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;", line = 42)
	@Override
	Class573 method24266(@OriginalArg(0) Class104 arg0) {
		if (this.aClass567_1.aClass109_8 == null) {
			return null;
		}
		@Pc(9) Class470 local9 = arg0.method20508();
		@Pc(12) Class470 local12 = this.method24226();
		@Pc(15) Class458 local15 = this.method24229();
		local9.method29364(local12);
		@Pc(39) Class572 local39 = this.aClass585_23.aClass572ArrayArrayArray3[this.aByte100][(int) local15.aClass472_61.aFloat317 >> 9][(int) local15.aClass472_61.aFloat319 >> 9];
		if (local39 != null && local39.aClass132_Sub1_Sub4_1 != null) {
			local9.method29387(0.0F, (float) -local39.aClass132_Sub1_Sub4_1.aShort97, 0.0F);
		}
		this.aClass567_1.aClass109_8.method6947(local9, null, 0);
		return null;
	}

	@OriginalMember(owner = "client!auu", name = "fe", descriptor = "(Lclient!dh;)V", line = 53)
	@Override
	void method24303(@OriginalArg(0) Class104 arg0) {
	}

	@OriginalMember(owner = "client!auu", name = "fw", descriptor = "(Lclient!dh;I)V", line = 53)
	@Override
	void method24267(@OriginalArg(0) Class104 arg0) {
	}

	@OriginalMember(owner = "client!auu", name = "fy", descriptor = "(Lclient!dh;)V", line = 53)
	@Override
	void method24294(@OriginalArg(0) Class104 arg0) {
	}

	@OriginalMember(owner = "client!auu", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;", line = 56)
	@Override
	public Class600 method24298(@OriginalArg(0) Class104 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!auu", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;", line = 56)
	@Override
	public Class600 method24283(@OriginalArg(0) Class104 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!auu", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;", line = 56)
	@Override
	public Class600 method24284(@OriginalArg(0) Class104 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!auu", name = "by", descriptor = "(B)I", line = 60)
	@Override
	public int method24289() {
		return this.aClass567_1.aClass109_8 == null ? 0 : this.aClass567_1.aClass109_8.method6882();
	}

	@OriginalMember(owner = "client!auu", name = "ch", descriptor = "()I", line = 60)
	@Override
	public int method24282() {
		return this.aClass567_1.aClass109_8 == null ? 0 : this.aClass567_1.aClass109_8.method6882();
	}
}

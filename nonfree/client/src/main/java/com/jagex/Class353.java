package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
class Class353 implements Interface39 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!nq", name = "this$0", descriptor = "Lclient!oh;")
	final Class366 this$0;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!oh;)V", line = 177)
	Class353(@OriginalArg(0) Class366 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)[B", line = 179)
	@Override
	public byte[] method26599(@OriginalArg(0) int arg0) {
		return this.this$0.anInterface52_1.method29117(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "(IB)[B", line = 179)
	@Override
	public byte[] method26600(@OriginalArg(0) int arg0) {
		return this.this$0.anInterface52_1.method29117(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "(I)[B", line = 179)
	@Override
	public byte[] method26601(@OriginalArg(0) int arg0) {
		return this.this$0.anInterface52_1.method29117(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "(I)[B", line = 179)
	@Override
	public byte[] method26602(@OriginalArg(0) int arg0) {
		return this.this$0.anInterface52_1.method29117(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "ps", descriptor = "(Lclient!vs;I)V", line = 6934)
	static final void method26603(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3507 * -1827200975;
	}

	@OriginalMember(owner = "client!nq", name = "tn", descriptor = "(Lclient!vs;S)V", line = 7529)
	static final void method26604(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(32) Class534 local32 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		Class163.method23297(local32.aClass178_18, local13, local23);
	}

	@OriginalMember(owner = "client!nq", name = "anm", descriptor = "(Lclient!vs;I)V", line = 11523)
	static final void method26605(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub31_1.method13987() == 1 ? 1 : 0;
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahl")
public class Class60_Sub3 extends Class60 {

	@OriginalMember(owner = "client!ahl", name = "s", descriptor = "I")
	public static final int anInt1475 = 0;

	@OriginalMember(owner = "client!ahl", name = "x", descriptor = "I")
	public static final int anInt1476 = 1;

	@OriginalMember(owner = "client!ahl", name = "<init>", descriptor = "(Lclient!aht;)V", line = 11)
	public Class60_Sub3(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahl", name = "<init>", descriptor = "(ILclient!aht;)V", line = 15)
	public Class60_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ahl", name = "v", descriptor = "(B)V", line = 19)
	public void method12812() {
		if (this.anInt2079 * -1373670555 != 1 && this.anInt2079 * -1373670555 != 0) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!ahl", name = "o", descriptor = "()V", line = 19)
	public void method12815() {
		if (this.anInt2079 * -1373670555 != 1 && this.anInt2079 * -1373670555 != 0) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!ahl", name = "p", descriptor = "(I)I", line = 23)
	@Override
	int method14603() {
		return 1;
	}

	@OriginalMember(owner = "client!ahl", name = "h", descriptor = "()I", line = 23)
	@Override
	int method14602() {
		return 1;
	}

	@OriginalMember(owner = "client!ahl", name = "x", descriptor = "()I", line = 23)
	@Override
	int method14607() {
		return 1;
	}

	@OriginalMember(owner = "client!ahl", name = "y", descriptor = "()I", line = 23)
	@Override
	int method14606() {
		return 1;
	}

	@OriginalMember(owner = "client!ahl", name = "u", descriptor = "()I", line = 23)
	@Override
	int method14605() {
		return 1;
	}

	@OriginalMember(owner = "client!ahl", name = "s", descriptor = "()I", line = 23)
	@Override
	int method14604() {
		return 1;
	}

	@OriginalMember(owner = "client!ahl", name = "b", descriptor = "()I", line = 23)
	@Override
	int method14615() {
		return 1;
	}

	@OriginalMember(owner = "client!ahl", name = "t", descriptor = "(I)Z", line = 27)
	public boolean method12811() {
		return true;
	}

	@OriginalMember(owner = "client!ahl", name = "i", descriptor = "()Z", line = 27)
	public boolean method12816() {
		return true;
	}

	@OriginalMember(owner = "client!ahl", name = "f", descriptor = "()Z", line = 27)
	public boolean method12817() {
		return true;
	}

	@OriginalMember(owner = "client!ahl", name = "k", descriptor = "()Z", line = 27)
	public boolean method12818() {
		return true;
	}

	@OriginalMember(owner = "client!ahl", name = "at", descriptor = "()Z", line = 27)
	public boolean method12819() {
		return true;
	}

	@OriginalMember(owner = "client!ahl", name = "z", descriptor = "(I)I", line = 31)
	@Override
	public int method14609(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ahl", name = "a", descriptor = "(IB)I", line = 31)
	@Override
	public int method14599(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ahl", name = "c", descriptor = "(I)I", line = 31)
	@Override
	public int method14608(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ahl", name = "l", descriptor = "(IB)V", line = 35)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ahl", name = "j", descriptor = "(I)V", line = 35)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ahl", name = "n", descriptor = "(I)V", line = 35)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ahl", name = "w", descriptor = "(B)I", line = 39)
	public int method12813() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ahl", name = "af", descriptor = "()I", line = 39)
	public int method12814() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ahl", name = "ir", descriptor = "(Lclient!vs;I)V", line = 5561)
	static final void method12820(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class479.method28925(local11, local14, arg0);
	}
}

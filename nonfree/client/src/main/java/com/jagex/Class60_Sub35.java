package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajp")
public class Class60_Sub35 extends Class60 {

	@OriginalMember(owner = "client!ajp", name = "x", descriptor = "I")
	public static final int anInt2081 = 1;

	@OriginalMember(owner = "client!ajp", name = "s", descriptor = "I")
	public static final int anInt2082 = 0;

	@OriginalMember(owner = "client!ajp", name = "<init>", descriptor = "(Lclient!aht;)V", line = 11)
	public Class60_Sub35(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ajp", name = "<init>", descriptor = "(ILclient!aht;)V", line = 15)
	public Class60_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ajp", name = "v", descriptor = "(I)V", line = 19)
	public void method14619() {
		if (this.anInt2079 * -1373670555 != 1 && this.anInt2079 * -1373670555 != 0) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!ajp", name = "a", descriptor = "(II)Lclient!gr;", line = 22)
	public static Class207 method14625(@OriginalArg(0) int arg0) {
		@Pc(2) Class207[] local2 = Class414.method27752();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class207 local12 = local2[local4];
			if (arg0 == local12.anInt3696 * 1840960801) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ajp", name = "b", descriptor = "()I", line = 23)
	@Override
	int method14615() {
		return 1;
	}

	@OriginalMember(owner = "client!ajp", name = "p", descriptor = "(I)I", line = 23)
	@Override
	int method14603() {
		return 1;
	}

	@OriginalMember(owner = "client!ajp", name = "x", descriptor = "()I", line = 23)
	@Override
	int method14607() {
		return 1;
	}

	@OriginalMember(owner = "client!ajp", name = "u", descriptor = "()I", line = 23)
	@Override
	int method14605() {
		return 1;
	}

	@OriginalMember(owner = "client!ajp", name = "h", descriptor = "()I", line = 23)
	@Override
	int method14602() {
		return 1;
	}

	@OriginalMember(owner = "client!ajp", name = "y", descriptor = "()I", line = 23)
	@Override
	int method14606() {
		return 1;
	}

	@OriginalMember(owner = "client!ajp", name = "s", descriptor = "()I", line = 23)
	@Override
	int method14604() {
		return 1;
	}

	@OriginalMember(owner = "client!ajp", name = "a", descriptor = "(IB)I", line = 27)
	@Override
	int method14599(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ajp", name = "c", descriptor = "(I)I", line = 27)
	@Override
	int method14608(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ajp", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method14609(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ajp", name = "l", descriptor = "(IB)V", line = 31)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ajp", name = "j", descriptor = "(I)V", line = 31)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ajp", name = "n", descriptor = "(I)V", line = 31)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ajp", name = "k", descriptor = "()I", line = 35)
	public int method14618() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ajp", name = "t", descriptor = "(I)I", line = 35)
	public int method14620() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ajp", name = "o", descriptor = "()I", line = 35)
	public int method14621() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ajp", name = "w", descriptor = "()I", line = 35)
	public int method14622() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ajp", name = "f", descriptor = "()I", line = 35)
	public int method14623() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ajp", name = "i", descriptor = "()I", line = 35)
	public int method14624() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ajp", name = "aj", descriptor = "(IB)V", line = 148)
	public static void method14626(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(13, (long) arg0);
		local4.method19145();
	}
}

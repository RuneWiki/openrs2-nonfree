package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apd")
public class Class119_Sub1_Sub1 extends Class119_Sub1 {

	@OriginalMember(owner = "client!apd", name = "o", descriptor = "[B")
	byte[] aByteArray43;

	@OriginalMember(owner = "client!apd", name = "<init>", descriptor = "()V", line = 81)
	Class119_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!apd", name = "m", descriptor = "(III)[B", line = 85)
	byte[] method18423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray43 = new byte[arg0 * arg1 * arg2 * 2];
		this.method21322(arg0, arg1, arg2);
		return this.aByteArray43;
	}

	@OriginalMember(owner = "client!apd", name = "h", descriptor = "(III)[B", line = 85)
	byte[] method18424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray43 = new byte[arg0 * arg1 * arg2 * 2];
		this.method21322(arg0, arg1, arg2);
		return this.aByteArray43;
	}

	@OriginalMember(owner = "client!apd", name = "n", descriptor = "(IB)V", line = 91)
	@Override
	void method21345(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray43[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray43[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!apd", name = "a", descriptor = "(IB)V", line = 91)
	@Override
	void method21344(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray43[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray43[local11] = (byte) (local7 * 3 >> 5);
	}
}

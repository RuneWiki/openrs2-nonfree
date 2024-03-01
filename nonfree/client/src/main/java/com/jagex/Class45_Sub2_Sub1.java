package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akc")
public class Class45_Sub2_Sub1 extends Class45_Sub2 {

	@OriginalMember(owner = "client!akc", name = "r", descriptor = "[B")
	byte[] aByteArray38;

	@OriginalMember(owner = "client!akc", name = "<init>", descriptor = "()V", line = 102)
	Class45_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!akc", name = "ai", descriptor = "(III)[B", line = 106)
	byte[] method15030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray38 = new byte[arg0 * arg1 * arg2 * 2];
		this.method18246(arg0, arg1, arg2);
		return this.aByteArray38;
	}

	@OriginalMember(owner = "client!akc", name = "aj", descriptor = "(III)[B", line = 106)
	byte[] method15031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray38 = new byte[arg0 * arg1 * arg2 * 2];
		this.method18246(arg0, arg1, arg2);
		return this.aByteArray38;
	}

	@OriginalMember(owner = "client!akc", name = "as", descriptor = "(III)[B", line = 106)
	byte[] method15032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray38 = new byte[arg0 * arg1 * arg2 * 2];
		this.method18246(arg0, arg1, arg2);
		return this.aByteArray38;
	}

	@OriginalMember(owner = "client!akc", name = "an", descriptor = "(IB)V", line = 112)
	@Override
	void method18156(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray38[local15] = local12;
		this.aByteArray38[local16] = local12;
	}

	@OriginalMember(owner = "client!akc", name = "aa", descriptor = "(IB)V", line = 112)
	@Override
	void method18157(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray38[local15] = local12;
		this.aByteArray38[local16] = local12;
	}

	@OriginalMember(owner = "client!akc", name = "ah", descriptor = "(IB)V", line = 112)
	@Override
	void method18155(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray38[local15] = local12;
		this.aByteArray38[local16] = local12;
	}
}

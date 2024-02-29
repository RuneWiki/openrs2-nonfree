package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public class Class203 {

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
	static final int anInt3559 = 2;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
	static final int anInt3561 = 1;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	static final int anInt3562 = 2;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "[S")
	static short[] aShortArray96 = new short[500];

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "[S")
	static short[] aShortArray89 = new short[500];

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "[S")
	static short[] aShortArray88 = new short[500];

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "[S")
	static short[] aShortArray90 = new short[500];

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "[S")
	static short[] aShortArray97 = new short[500];

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "[B")
	static byte[] aByteArray60 = new byte[500];

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "Lclient!ajw;")
	Class77_Sub23 aClass77_Sub23_1 = null;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
	int anInt3560 = 0;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "Z")
	boolean aBoolean634 = false;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "Z")
	boolean aBoolean635 = false;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Z")
	boolean aBoolean633 = false;

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "[S")
	short[] aShortArray91;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "[S")
	short[] aShortArray92;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "[S")
	short[] aShortArray93;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "[S")
	short[] aShortArray94;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "[S")
	short[] aShortArray95;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "[B")
	byte[] aByteArray61;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([BLclient!ajw;)V", line = 31)
	Class203(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class77_Sub23 arg1) {
		this.aClass77_Sub23_1 = arg1;
		try {
			@Pc(24) Class77_Sub39 local24 = new Class77_Sub39(arg0);
			@Pc(29) Class77_Sub39 local29 = new Class77_Sub39(arg0);
			@Pc(33) int local33 = local24.method22478();
			local24.anInt3089 += 1520029430;
			@Pc(43) int local43 = local24.method22483();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt3089 = (local24.anInt3089 * 31645619 + local43) * -1387468933;
			@Pc(61) int local61;
			for (local61 = 0; local61 < local43; local61++) {
				@Pc(70) int local70 = this.aClass77_Sub23_1.anIntArray200[local61];
				if (local70 == 0) {
					local47 = local61;
				}
				@Pc(78) int local78 = local24.method22478();
				if (local78 > 0) {
					if (local70 == 0) {
						local49 = local61;
					}
					aShortArray96[local45] = (short) local61;
					@Pc(91) short local91 = 0;
					if (local70 == 3 || local70 == 10) {
						local91 = 128;
					}
					if (local33 >= 2 && local70 == 7) {
						if ((local78 & 0x1) == 0) {
							aShortArray89[local45] = local91;
						} else {
							aShortArray89[local45] = (short) local29.method22535();
							local29.method22535();
						}
						if ((local78 & 0x2) == 0) {
							aShortArray88[local45] = local91;
						} else {
							aShortArray88[local45] = (short) local29.method22535();
							local29.method22535();
						}
						if ((local78 & 0x4) == 0) {
							aShortArray90[local45] = local91;
						} else {
							aShortArray90[local45] = (short) local29.method22535();
							local29.method22535();
						}
					} else {
						if ((local78 & 0x1) == 0) {
							aShortArray89[local45] = local91;
						} else {
							aShortArray89[local45] = (short) local29.method22535();
						}
						if ((local78 & 0x2) == 0) {
							aShortArray88[local45] = local91;
						} else {
							aShortArray88[local45] = (short) local29.method22535();
						}
						if ((local78 & 0x4) == 0) {
							aShortArray90[local45] = local91;
						} else {
							aShortArray90[local45] = (short) local29.method22535();
						}
					}
					aByteArray60[local45] = (byte) (local78 >>> 3 & 0x3);
					if (local70 == 2 || local70 == 9) {
						aShortArray89[local45] = (short) (aShortArray89[local45] << 2 & 0x3FFF);
						aShortArray88[local45] = (short) (aShortArray88[local45] << 2 & 0x3FFF);
						aShortArray90[local45] = (short) (aShortArray90[local45] << 2 & 0x3FFF);
					}
					aShortArray97[local45] = -1;
					if (local70 == 1 || local70 == 2 || local70 == 3) {
						if (local47 > local49) {
							aShortArray97[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local70 == 5) {
						this.aBoolean634 = true;
					} else if (local70 == 7) {
						this.aBoolean635 = true;
					} else if (local70 == 9 || local70 == 10 || local70 == 8) {
						this.aBoolean633 = true;
					}
					local45++;
				}
			}
			if (local29.anInt3089 * 31645619 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt3560 = local45;
			this.aShortArray91 = new short[local45];
			this.aShortArray92 = new short[local45];
			this.aShortArray93 = new short[local45];
			this.aShortArray94 = new short[local45];
			this.aShortArray95 = new short[local45];
			this.aByteArray61 = new byte[local45];
			for (local61 = 0; local61 < local45; local61++) {
				this.aShortArray91[local61] = aShortArray96[local61];
				this.aShortArray92[local61] = aShortArray89[local61];
				this.aShortArray93[local61] = aShortArray88[local61];
				this.aShortArray94[local61] = aShortArray90[local61];
				this.aShortArray95[local61] = aShortArray97[local61];
				this.aByteArray61[local61] = aByteArray60[local61];
			}
		} catch (@Pc(404) Exception local404) {
			this.anInt3560 = 0;
			this.aBoolean634 = false;
			this.aBoolean635 = false;
		}
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public class Class129 {

	@OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
	static final int anInt3319 = 2;

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
	static final int anInt3320 = 1;

	@OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
	static final int anInt3321 = 2;

	@OriginalMember(owner = "client!dl", name = "p", descriptor = "[S")
	static short[] aShortArray79 = new short[500];

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "[S")
	static short[] aShortArray77 = new short[500];

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "[S")
	static short[] aShortArray78 = new short[500];

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "[S")
	static short[] aShortArray85 = new short[500];

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "[S")
	static short[] aShortArray76 = new short[500];

	@OriginalMember(owner = "client!dl", name = "x", descriptor = "[B")
	static byte[] aByteArray59 = new byte[500];

	@OriginalMember(owner = "client!dl", name = "s", descriptor = "Lclient!afy;")
	Class3_Sub14 aClass3_Sub14_1 = null;

	@OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
	int anInt3318 = 0;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "Z")
	boolean aBoolean615 = false;

	@OriginalMember(owner = "client!dl", name = "r", descriptor = "Z")
	boolean aBoolean616 = false;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "Z")
	boolean aBoolean614 = false;

	@OriginalMember(owner = "client!dl", name = "y", descriptor = "[S")
	short[] aShortArray80;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "[S")
	short[] aShortArray84;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "[S")
	short[] aShortArray82;

	@OriginalMember(owner = "client!dl", name = "z", descriptor = "[S")
	short[] aShortArray81;

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "[S")
	short[] aShortArray83;

	@OriginalMember(owner = "client!dl", name = "n", descriptor = "[B")
	byte[] aByteArray60;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "([BLclient!afy;)V", line = 31)
	Class129(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub14 arg1) {
		this.aClass3_Sub14_1 = arg1;
		try {
			@Pc(24) Class3_Sub41 local24 = new Class3_Sub41(arg0);
			@Pc(29) Class3_Sub41 local29 = new Class3_Sub41(arg0);
			@Pc(33) int local33 = local24.method20269();
			local24.anInt2803 += -1837960662;
			@Pc(43) int local43 = local24.method20271();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt2803 = (local24.anInt2803 * 62066237 + local43) * -918980331;
			@Pc(61) int local61;
			for (local61 = 0; local61 < local43; local61++) {
				@Pc(70) int local70 = this.aClass3_Sub14_1.anIntArray180[local61];
				if (local70 == 0) {
					local47 = local61;
				}
				@Pc(78) int local78 = local24.method20269();
				if (local78 > 0) {
					if (local70 == 0) {
						local49 = local61;
					}
					aShortArray79[local45] = (short) local61;
					@Pc(91) short local91 = 0;
					if (local70 == 3 || local70 == 10) {
						local91 = 128;
					}
					if (local33 >= 2 && local70 == 7) {
						if ((local78 & 0x1) == 0) {
							aShortArray77[local45] = local91;
						} else {
							aShortArray77[local45] = (short) local29.method20262();
							local29.method20262();
						}
						if ((local78 & 0x2) == 0) {
							aShortArray78[local45] = local91;
						} else {
							aShortArray78[local45] = (short) local29.method20262();
							local29.method20262();
						}
						if ((local78 & 0x4) == 0) {
							aShortArray85[local45] = local91;
						} else {
							aShortArray85[local45] = (short) local29.method20262();
							local29.method20262();
						}
					} else {
						if ((local78 & 0x1) == 0) {
							aShortArray77[local45] = local91;
						} else {
							aShortArray77[local45] = (short) local29.method20262();
						}
						if ((local78 & 0x2) == 0) {
							aShortArray78[local45] = local91;
						} else {
							aShortArray78[local45] = (short) local29.method20262();
						}
						if ((local78 & 0x4) == 0) {
							aShortArray85[local45] = local91;
						} else {
							aShortArray85[local45] = (short) local29.method20262();
						}
					}
					aByteArray59[local45] = (byte) (local78 >>> 3 & 0x3);
					if (local70 == 2 || local70 == 9) {
						aShortArray77[local45] = (short) (aShortArray77[local45] << 2 & 0x3FFF);
						aShortArray78[local45] = (short) (aShortArray78[local45] << 2 & 0x3FFF);
						aShortArray85[local45] = (short) (aShortArray85[local45] << 2 & 0x3FFF);
					}
					aShortArray76[local45] = -1;
					if (local70 == 1 || local70 == 2 || local70 == 3) {
						if (local47 > local49) {
							aShortArray76[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local70 == 5) {
						this.aBoolean615 = true;
					} else if (local70 == 7) {
						this.aBoolean616 = true;
					} else if (local70 == 9 || local70 == 10 || local70 == 8) {
						this.aBoolean614 = true;
					}
					local45++;
				}
			}
			if (local29.anInt2803 * 62066237 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt3318 = local45;
			this.aShortArray80 = new short[local45];
			this.aShortArray84 = new short[local45];
			this.aShortArray82 = new short[local45];
			this.aShortArray81 = new short[local45];
			this.aShortArray83 = new short[local45];
			this.aByteArray60 = new byte[local45];
			for (local61 = 0; local61 < local45; local61++) {
				this.aShortArray80[local61] = aShortArray79[local61];
				this.aShortArray84[local61] = aShortArray77[local61];
				this.aShortArray82[local61] = aShortArray78[local61];
				this.aShortArray81[local61] = aShortArray85[local61];
				this.aShortArray83[local61] = aShortArray76[local61];
				this.aByteArray60[local61] = aByteArray59[local61];
			}
		} catch (@Pc(404) Exception local404) {
			this.anInt3318 = 0;
			this.aBoolean615 = false;
			this.aBoolean616 = false;
		}
	}
}

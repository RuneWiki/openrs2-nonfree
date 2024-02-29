package com.jagex;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ty")
public class Class567 {

	@OriginalMember(owner = "client!ty", name = "r", descriptor = "S")
	short aShort182;

	@OriginalMember(owner = "client!ty", name = "l", descriptor = "Lclient!ari;")
	public Class104_Sub1_Sub2 aClass104_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ty", name = "v", descriptor = "Lclient!ari;")
	public Class104_Sub1_Sub2 aClass104_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ty", name = "y", descriptor = "Lclient!aro;")
	public Class104_Sub1_Sub3 aClass104_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ty", name = "w", descriptor = "Lclient!aro;")
	public Class104_Sub1_Sub3 aClass104_Sub1_Sub3_2;

	@OriginalMember(owner = "client!ty", name = "q", descriptor = "Lclient!arz;")
	Class104_Sub1_Sub5 aClass104_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ty", name = "d", descriptor = "S")
	short aShort183;

	@OriginalMember(owner = "client!ty", name = "x", descriptor = "Lclient!tp;")
	public Class559 aClass559_3;

	@OriginalMember(owner = "client!ty", name = "c", descriptor = "Lclient!ty;")
	public Class567 aClass567_1;

	@OriginalMember(owner = "client!ty", name = "s", descriptor = "S")
	short aShort184;

	@OriginalMember(owner = "client!ty", name = "t", descriptor = "Lclient!arm;")
	public Class104_Sub1_Sub4 aClass104_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ty", name = "g", descriptor = "S")
	short aShort185;

	@OriginalMember(owner = "client!ty", name = "p", descriptor = "B")
	public byte aByte167;

	@OriginalMember(owner = "client!ty", name = "p", descriptor = "(Ljava/io/File;[BII)V", line = 11)
	static void method31380(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) DataInputStream local10 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local10.readFully(arg1, 0, arg2);
		} catch (@Pc(17) EOFException local17) {
		}
		local10.close();
	}

	@OriginalMember(owner = "client!ty", name = "<init>", descriptor = "(I)V", line = 18)
	public Class567(@OriginalArg(0) int arg0) {
		this.aByte167 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ty", name = "r", descriptor = "(I)I", line = 194)
	public static int method31381() {
		return Class529.aTwitchTV1.GetLoginState();
	}

	@OriginalMember(owner = "client!ty", name = "gb", descriptor = "(I)V", line = 2712)
	public static void method31382() {
		@Pc(6) Class28 local6 = Class145.method15079("2", client.aClass670_4.aString245, true);
		Class56.aClass93_Sub1_1.method6435(local6);
	}

	@OriginalMember(owner = "client!ty", name = "je", descriptor = "(Lclient!gm;IILclient!yf;I)V", line = 6262)
	static final void method31383(@OriginalArg(0) Class277 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class665 arg3) {
		if (arg0.anIntArray396 == null) {
			if (arg2 <= 0) {
				return;
			}
			arg0.aByteArrayArray13 = new byte[11][];
			arg0.aByteArrayArray12 = new byte[11][];
			arg0.anIntArray394 = new int[11];
			arg0.anIntArray395 = new int[11];
			arg0.anIntArray396 = new int[11];
		}
		arg0.anIntArray396[arg1] = arg2;
		if (arg2 > 0) {
			arg0.aBoolean680 = true;
			return;
		}
		arg0.aBoolean680 = false;
		for (@Pc(43) int local43 = 0; local43 < arg0.aByteArrayArray13.length; local43++) {
			if (arg0.aByteArrayArray13[local43] != null || arg0.anIntArray396[local43] > 0) {
				arg0.aBoolean680 = true;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ty", name = "qn", descriptor = "(Lclient!yf;I)V", line = 7472)
	static final void method31384(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3882 * -166726847;
	}

	@OriginalMember(owner = "client!ty", name = "aai", descriptor = "(Lclient!yf;I)V", line = 9299)
	static final void method31385(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass368_3.method28165((String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147]);
	}

	@OriginalMember(owner = "client!ty", name = "avm", descriptor = "(Lclient!yf;B)V", line = 13196)
	static final void method31386(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1.method15460() ? 1 : 0;
	}
}

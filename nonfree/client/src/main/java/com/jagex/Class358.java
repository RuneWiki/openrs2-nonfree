package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public class Class358 {

	@OriginalMember(owner = "client!kc", name = "hb", descriptor = "Lclient!anp;")
	public static Class35_Sub8 aClass35_Sub8_1;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "B")
	public byte aByte149;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	public int anInt4499;

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "Ljava/lang/String;")
	public String aString209;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V", line = 8)
	Class358() {
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "([BIII)Ljava/lang/String;", line = 62)
	static String method27971(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = arg1; local5 < arg2 + arg1; local5 += 3) {
			@Pc(16) int local16 = arg0[local5] & 0xFF;
			local3.append(Class663.aCharArray7[local16 >>> 2]);
			if (local5 < arg2 - 1) {
				@Pc(37) int local37 = arg0[local5 + 1] & 0xFF;
				local3.append(Class663.aCharArray7[(local16 & 0x3) << 4 | local37 >>> 4]);
				if (local5 < arg2 - 2) {
					@Pc(64) int local64 = arg0[local5 + 2] & 0xFF;
					local3.append(Class663.aCharArray7[(local37 & 0xF) << 2 | local64 >>> 6]).append(Class663.aCharArray7[local64 & 0x3F]);
				} else {
					local3.append(Class663.aCharArray7[(local37 & 0xF) << 2]).append('=');
				}
			} else {
				local3.append(Class663.aCharArray7[(local16 & 0x3) << 4]).append('=').append('=');
			}
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!kc", name = "kc", descriptor = "(Lclient!gm;I[B[BLclient!yf;I)V", line = 6326)
	static final void method27972(@OriginalArg(0) Class277 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) Class665 arg4) {
		if (arg0.aByteArrayArray13 == null) {
			if (arg2 == null) {
				return;
			}
			arg0.aByteArrayArray13 = new byte[11][];
			arg0.aByteArrayArray12 = new byte[11][];
			arg0.anIntArray394 = new int[11];
			arg0.anIntArray395 = new int[11];
			arg0.anIntArray396 = new int[11];
		}
		arg0.aByteArrayArray13[arg1] = arg2;
		if (arg2 == null) {
			arg0.aBoolean680 = false;
			for (@Pc(43) int local43 = 0; local43 < arg0.aByteArrayArray13.length; local43++) {
				if (arg0.aByteArrayArray13[local43] != null || arg0.anIntArray396[local43] > 0) {
					arg0.aBoolean680 = true;
					break;
				}
			}
		} else {
			arg0.aBoolean680 = true;
		}
		arg0.aByteArrayArray12[arg1] = arg3;
	}

	@OriginalMember(owner = "client!kc", name = "amx", descriptor = "(Lclient!yf;I)V", line = 11842)
	static final void method27973(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		arg0.anInt5784 -= 926998689;
		Class597.aClass107_Sub1_2.method8815((float) arg0.anIntArray536[arg0.anInt5784 * 2088438307], (float) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1], (float) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2]);
	}

	@OriginalMember(owner = "client!kc", name = "anf", descriptor = "(Lclient!yf;S)V", line = 11892)
	static final void method27974(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		Class307.method27251(local13);
	}
}

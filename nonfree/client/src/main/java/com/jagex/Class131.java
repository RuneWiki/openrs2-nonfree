package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public class Class131 {

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "Lclient!sp;")
	public Class131 aClass131_17;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "Lclient!sp;")
	public Class131 aClass131_18;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "(I)V", line = 8)
	public void method23056() {
		if (this.aClass131_17 != null) {
			this.aClass131_17.aClass131_18 = this.aClass131_18;
			this.aClass131_18.aClass131_17 = this.aClass131_17;
			this.aClass131_18 = null;
			this.aClass131_17 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "v", descriptor = "()V", line = 8)
	public void method23057() {
		if (this.aClass131_17 != null) {
			this.aClass131_17.aClass131_18 = this.aClass131_18;
			this.aClass131_18.aClass131_17 = this.aClass131_17;
			this.aClass131_18 = null;
			this.aClass131_17 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "()V", line = 8)
	public void method23058() {
		if (this.aClass131_17 != null) {
			this.aClass131_17.aClass131_18 = this.aClass131_18;
			this.aClass131_18.aClass131_17 = this.aClass131_17;
			this.aClass131_18 = null;
			this.aClass131_17 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "()V", line = 8)
	public void method23059() {
		if (this.aClass131_17 != null) {
			this.aClass131_17.aClass131_18 = this.aClass131_18;
			this.aClass131_18.aClass131_17 = this.aClass131_17;
			this.aClass131_18 = null;
			this.aClass131_17 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "([BILjava/lang/CharSequence;I)I", line = 21)
	public static int method23060(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) CharSequence arg2) {
		@Pc(2) int local2 = arg2.length();
		@Pc(4) int local4 = arg1;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg2.charAt(local6);
			if (local13 <= '\u007f') {
				arg0[local4++] = (byte) local13;
			} else if (local13 <= '\u07ff') {
				arg0[local4++] = (byte) (local13 >> 6 | 0xC0);
				arg0[local4++] = (byte) (local13 & 0x3F | 0x80);
			} else {
				arg0[local4++] = (byte) (local13 >> 12 | 0xE0);
				arg0[local4++] = (byte) (local13 >> 6 & 0x3F | 0x80);
				arg0[local4++] = (byte) (local13 & 0x3F | 0x80);
			}
		}
		return local4 - arg1;
	}

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "(I)I", line = 481)
	public static int method23061() {
		@Pc(2) Class232 local2 = Class628.aClass232_90;
		synchronized (Class628.aClass232_90) {
			return Class628.aClass232_90.method25855();
		}
	}

	@OriginalMember(owner = "client!sp", name = "nd", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;S)V", line = 7031)
	static final void method23062(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class73.method1040(local13, arg2);
	}

	@OriginalMember(owner = "client!sp", name = "kc", descriptor = "(III)V", line = 10136)
	public static void method23063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_15, client.aClass82_2.aClass16_1);
		local5.aClass77_Sub39_Sub1_2.method22408(arg1);
		local5.aClass77_Sub39_Sub1_2.method22638(arg0);
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!sp", name = "agf", descriptor = "(Lclient!yf;I)V", line = 10452)
	static final void method23064(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = RuntimeException_Sub4.aClass41_2.method688(local12).method22311();
	}
}

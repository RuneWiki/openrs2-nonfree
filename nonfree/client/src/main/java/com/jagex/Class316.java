package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public class Class316 implements Interface75 {

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "Lclient!ib;")
	static final Class316 aClass316_4 = new Class316(0);

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!ib;")
	static final Class316 aClass316_1 = new Class316(1);

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "Lclient!ib;")
	static final Class316 aClass316_2 = new Class316(2);

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "Lclient!ib;")
	static final Class316 aClass316_3 = new Class316(3);

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
	final int anInt4069;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(Lclient!pw;IILclient!aac;I)Lclient!aar;", line = 22)
	public static Class17 method27377(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface1 arg3) {
		@Pc(5) byte[] local5 = arg0.method29725(arg1, arg2);
		return local5 == null ? null : new Class17(local5, arg3);
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(CB)Z", line = 28)
	static final boolean method27378(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Class601.method32040(arg0)) {
			return true;
		} else {
			@Pc(12) char[] local12 = Class70.aCharArray1;
			@Pc(14) int local14;
			@Pc(22) char local22;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (arg0 == local22) {
					return true;
				}
			}
			local12 = Class70.aCharArray2;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V", line = 53)
	Class316(@OriginalArg(0) int arg0) {
		this.anInt4069 = arg0 * 1286625121;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "()I", line = 58)
	@Override
	public int method36479() {
		return this.anInt4069 * 1733332129;
	}

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "()I", line = 58)
	@Override
	public int method36478() {
		return this.anInt4069 * 1733332129;
	}

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "()I", line = 58)
	@Override
	public int method36477() {
		return this.anInt4069 * 1733332129;
	}

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "(Lclient!yf;I)V", line = 66)
	static void method27379(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class295.method27033(local13);
	}

	@OriginalMember(owner = "client!ib", name = "ah", descriptor = "(I)I", line = 519)
	public static int method27380() {
		Class77_Sub26.aTwitchEventLiveStreams1 = null;
		return Class529.aTwitchTV1.RequestLiveStreams(client.aClass670_4.aString246);
	}

	@OriginalMember(owner = "client!ib", name = "qr", descriptor = "(Lclient!yf;B)V", line = 7586)
	static final void method27381(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3927 * 1365669833;
	}

	@OriginalMember(owner = "client!ib", name = "abr", descriptor = "(Lclient!yf;B)V", line = 9383)
	static final void method27382(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class276.aClass93_1 == null ? 0 : 1;
	}

	@OriginalMember(owner = "client!ib", name = "anp", descriptor = "(Lclient!yf;I)V", line = 11916)
	static final void method27383(@OriginalArg(0) Class665 arg0) {
		Class307.method27254(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
	}

	@OriginalMember(owner = "client!ib", name = "aqr", descriptor = "(Lclient!yf;I)V", line = 12403)
	static final void method27384(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_4.method15901();
	}
}

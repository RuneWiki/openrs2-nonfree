package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
final class Class372 implements Interface51 {

	@OriginalMember(owner = "client!l", name = "y", descriptor = "[Lclient!ex;")
	static Class237[] aClass237Array1;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "([BLclient!aar;Z)Ljava/lang/Object;", line = 564)
	@Override
	public Object method28275(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) boolean arg2) {
		return Class284.aClass86_9.method20111(arg1, Class210.method25603(arg0), arg2);
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "([BLclient!aar;Z)Ljava/lang/Object;", line = 564)
	@Override
	public Object method28277(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) boolean arg2) {
		return Class284.aClass86_9.method20111(arg1, Class210.method25603(arg0), arg2);
	}

	@OriginalMember(owner = "client!l", name = "p", descriptor = "([BLclient!aar;ZI)Ljava/lang/Object;", line = 564)
	@Override
	public Object method28276(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) boolean arg2) {
		return Class284.aClass86_9.method20111(arg1, Class210.method25603(arg0), arg2);
	}

	@OriginalMember(owner = "client!l", name = "if", descriptor = "(Lclient!yf;B)V", line = 5970)
	static final void method28278(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		@Pc(32) boolean local32 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1;
		Class294.method27029(local11, local14, arg0, local32 ? Class283.aClass283_2 : Class283.aClass283_3);
	}

	@OriginalMember(owner = "client!l", name = "vj", descriptor = "(Lclient!yf;I)V", line = 8402)
	static final void method28279(@OriginalArg(0) Class665 arg0) {
		@Pc(13) Class77_Sub36 local13 = (Class77_Sub36) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13.anInt1777 * 599803149;
	}

	@OriginalMember(owner = "client!l", name = "asr", descriptor = "(Lclient!yf;I)V", line = 12618)
	static final void method28280(@OriginalArg(0) Class665 arg0) {
		@Pc(2) long local2 = Class280.method26667();
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class538.method30877(local2);
	}
}

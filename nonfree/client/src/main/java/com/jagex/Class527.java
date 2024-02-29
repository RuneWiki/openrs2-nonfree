package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public class Class527 {

	@OriginalMember(owner = "client!sa", name = "vg", descriptor = "Ljava/util/Iterator;")
	public static Iterator anIterator3;

	// $FF: synthetic field
	@OriginalMember(owner = "client!sa", name = "this$0", descriptor = "Lclient!sx;")
	final Class546 this$0;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "(II)Lclient!alh;", line = 22)
	public static Class145_Sub1 method30680(@OriginalArg(0) int arg0) {
		return Class616.aBoolean839 && arg0 >= Class616.anInt5593 * 206492647 && arg0 <= Class616.anInt5594 * -1664594981 ? Class616.aClass145_Sub1Array2[arg0 - Class616.anInt5593 * 206492647] : null;
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!sx;)V", line = 54)
	Class527(@OriginalArg(0) Class546 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(IB)I", line = 66)
	static int method30681(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Class472.method29635(arg0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)I", line = 122)
	static int method30682() {
		return 13;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)I", line = 278)
	public static int method30683() {
		return Class529.aTwitchTV1.GetWebcamState();
	}

	@OriginalMember(owner = "client!sa", name = "go", descriptor = "(Lclient!yf;B)V", line = 5689)
	static final void method30684(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class526.method30677(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!sa", name = "pp", descriptor = "(Lclient!yf;I)V", line = 7384)
	static final void method30685(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class161.method24336(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!sa", name = "ajf", descriptor = "(Lclient!yf;B)V", line = 11031)
	static final void method30686(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (Class706.aBoolean868) {
			@Pc(17) Class7[] local17 = Class295.method27035();
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local17[local12].anInt24 * -1991181227;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local17[local12].anInt25 * -778390023;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}
}

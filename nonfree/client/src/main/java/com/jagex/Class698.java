package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zp")
public class Class698 implements Interface75 {

	@OriginalMember(owner = "client!zp", name = "vw", descriptor = "[I")
	public static int[] anIntArray543;

	@OriginalMember(owner = "client!zp", name = "p", descriptor = "Lclient!zp;")
	public static final Class698 aClass698_7 = new Class698(-2);

	@OriginalMember(owner = "client!zp", name = "c", descriptor = "Lclient!zp;")
	public static final Class698 aClass698_3 = new Class698(-3);

	@OriginalMember(owner = "client!zp", name = "v", descriptor = "Lclient!zp;")
	static final Class698 aClass698_4 = new Class698(2);

	@OriginalMember(owner = "client!zp", name = "l", descriptor = "Lclient!zp;")
	public static final Class698 aClass698_5 = new Class698(3);

	@OriginalMember(owner = "client!zp", name = "y", descriptor = "Lclient!zp;")
	static final Class698 aClass698_6 = new Class698(21);

	@OriginalMember(owner = "client!zp", name = "w", descriptor = "Lclient!zp;")
	static final Class698 aClass698_2 = new Class698(20);

	@OriginalMember(owner = "client!zp", name = "t", descriptor = "I")
	final int anInt5880;

	@OriginalMember(owner = "client!zp", name = "v", descriptor = "()[Lclient!zp;", line = 17)
	public static Class698[] method36474() {
		return new Class698[] { aClass698_6, aClass698_4, aClass698_3, aClass698_7, aClass698_2, aClass698_5 };
	}

	@OriginalMember(owner = "client!zp", name = "<init>", descriptor = "(I)V", line = 20)
	Class698(@OriginalArg(0) int arg0) {
		this.anInt5880 = arg0 * -403066555;
	}

	@OriginalMember(owner = "client!zp", name = "c", descriptor = "()I", line = 25)
	@Override
	public int method36479() {
		return this.anInt5880 * 9255309;
	}

	@OriginalMember(owner = "client!zp", name = "l", descriptor = "()I", line = 25)
	@Override
	public int method36478() {
		return this.anInt5880 * 9255309;
	}

	@OriginalMember(owner = "client!zp", name = "y", descriptor = "()I", line = 25)
	@Override
	public int method36477() {
		return this.anInt5880 * 9255309;
	}

	@OriginalMember(owner = "client!zp", name = "lx", descriptor = "(ILclient!aku;[IZI)Lclient!aku;", line = 11889)
	public static final Class77_Sub38 method36475(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub38 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class77_Sub38 local5 = (Class77_Sub38) client.aClass12_20.method173((long) arg0);
		if (local5 != null) {
			Class77_Sub41.method14838(local5, local5.anInt3113 * 1225863589 != arg1.anInt3113 * 1225863589, arg3);
		}
		client.aClass12_20.method184(arg1, (long) arg0);
		Class667.method33165(arg1.anInt3113 * 1225863589, arg2);
		@Pc(40) Class277 local40 = Class155.method23628(arg0);
		if (local40 != null) {
			Class461.method29531(local40);
		}
		if (client.aClass277_5 != null) {
			Class461.method29531(client.aClass277_5);
			client.aClass277_5 = null;
		}
		if (local40 != null) {
			Class145.method15080(Class35_Sub11.aClass273Array1[local40.anInt3863 * -1278450723 >>> 16], local40, !arg3);
		}
		if (!arg3) {
			Class469.method29595(arg1.anInt3113 * 1225863589, arg2);
		}
		if (!arg3 && -993629849 * client.anInt3459 != -1) {
			Class611.method32232(client.anInt3459 * -993629849, 1);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!zp", name = "ann", descriptor = "(Lclient!yf;B)V", line = 11991)
	static final void method36476(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3382 * -1608886643;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3510 * 1306630125;
	}
}

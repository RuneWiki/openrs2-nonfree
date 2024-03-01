package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public class Class10 implements Interface6 {

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "Lclient!xg;")
	public final Interface58 anInterface58_2;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!zf;)V", line = 12)
	public Class10(@OriginalArg(0) Class70_Sub1 arg0) {
		this(arg0, new Class591(arg0));
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!zf;Lclient!xy;)V", line = 15)
	Class10(@OriginalArg(0) Class70_Sub1 arg0, @OriginalArg(1) Class591 arg1) {
		this.anInterface58_2 = arg1;
	}

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "(Lclient!cy;B)I", line = 20)
	@Override
	public int method32385(@OriginalArg(0) Class11 arg0) {
		return this.anInterface58_2.method33322(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "(Lclient!cy;)I", line = 20)
	@Override
	public int method32388(@OriginalArg(0) Class11 arg0) {
		return this.anInterface58_2.method33322(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "(Lclient!cy;)I", line = 20)
	@Override
	public int method32386(@OriginalArg(0) Class11 arg0) {
		return this.anInterface58_2.method33322(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "(Lclient!cy;)I", line = 20)
	@Override
	public int method32387(@OriginalArg(0) Class11 arg0) {
		return this.anInterface58_2.method33322(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "(Lclient!cy;I)V", line = 24)
	@Override
	public void method32395(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		this.anInterface58_2.method33305(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "(Lclient!cy;II)V", line = 24)
	@Override
	public void method32389(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		this.anInterface58_2.method33305(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!cy;I)J", line = 28)
	@Override
	public long method32393(@OriginalArg(0) Class11 arg0) {
		return this.anInterface58_2.method33307(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Lclient!cy;)J", line = 28)
	@Override
	public long method32396(@OriginalArg(0) Class11 arg0) {
		return this.anInterface58_2.method33307(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(Lclient!cy;J)V", line = 32)
	@Override
	public void method32397(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		this.anInterface58_2.method33308(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "(Lclient!cy;J)V", line = 32)
	@Override
	public void method32399(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		this.anInterface58_2.method33308(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(Lclient!cy;J)V", line = 32)
	@Override
	public void method32401(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		this.anInterface58_2.method33308(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "(Lclient!cy;J)V", line = 32)
	@Override
	public void method32398(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		this.anInterface58_2.method33308(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "(Lclient!yj;I)V", line = 32)
	public static void method715(@OriginalArg(0) Class600 arg0) {
		Class293.method25561(new Class425(arg0));
	}

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 36)
	@Override
	public Object method32400(@OriginalArg(0) Class11 arg0) {
		return this.anInterface58_2.method33311(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 36)
	@Override
	public Object method32403(@OriginalArg(0) Class11 arg0) {
		return this.anInterface58_2.method33311(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 36)
	@Override
	public Object method32402(@OriginalArg(0) Class11 arg0) {
		return this.anInterface58_2.method33311(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "(Lclient!cy;I)Ljava/lang/Object;", line = 36)
	@Override
	public Object method32408(@OriginalArg(0) Class11 arg0) {
		return this.anInterface58_2.method33311(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 36)
	@Override
	public Object method32406(@OriginalArg(0) Class11 arg0) {
		return this.anInterface58_2.method33311(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 36)
	@Override
	public Object method32404(@OriginalArg(0) Class11 arg0) {
		return this.anInterface58_2.method33311(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 36)
	@Override
	public Object method32405(@OriginalArg(0) Class11 arg0) {
		return this.anInterface58_2.method33311(arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "(Lclient!cy;Ljava/lang/Object;I)V", line = 40)
	@Override
	public void method32391(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface58_2.method33310(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "at", descriptor = "(Lclient!cy;Ljava/lang/Object;)V", line = 40)
	@Override
	public void method32409(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface58_2.method33310(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "af", descriptor = "(Lclient!cy;Ljava/lang/Object;)V", line = 40)
	@Override
	public void method32410(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface58_2.method33310(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "ak", descriptor = "(Lclient!cy;Ljava/lang/Object;)V", line = 40)
	@Override
	public void method32390(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface58_2.method33310(arg0.anInt130 * -112096509, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "(Lclient!ky;I)I", line = 44)
	@Override
	public int method32384(@OriginalArg(0) Class290 arg0) {
		return arg0.method25523(this.method32385(arg0.aClass11_1));
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(Lclient!ky;)I", line = 44)
	@Override
	public int method32383(@OriginalArg(0) Class290 arg0) {
		return arg0.method25523(this.method32385(arg0.aClass11_1));
	}

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "(Lclient!ky;II)V", line = 48)
	@Override
	public void method32411(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) throws Exception_Sub5 {
		this.method32389(arg0.aClass11_1, arg0.method25524(this.method32385(arg0.aClass11_1), arg1));
	}

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "(Lclient!ky;I)V", line = 48)
	@Override
	public void method32394(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) throws Exception_Sub5 {
		this.method32389(arg0.aClass11_1, arg0.method25524(this.method32385(arg0.aClass11_1), arg1));
	}

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "(Lclient!ky;I)V", line = 48)
	@Override
	public void method32407(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) throws Exception_Sub5 {
		this.method32389(arg0.aClass11_1, arg0.method25524(this.method32385(arg0.aClass11_1), arg1));
	}

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "(Lclient!ky;I)V", line = 48)
	@Override
	public void method32392(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) throws Exception_Sub5 {
		this.method32389(arg0.aClass11_1, arg0.method25524(this.method32385(arg0.aClass11_1), arg1));
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(IB)V", line = 49)
	public static void method717(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub44 local5 = (Class3_Sub44) Class528.aClass581_39.method33217((long) arg0);
		if (local5 != null) {
			local5.aClass57_Sub1_1.method12231();
			Class149.method23128(local5.anInt1497 * -352602287, local5.aBoolean328);
			local5.method33656();
		}
	}

	@OriginalMember(owner = "client!cb", name = "dt", descriptor = "(IIIZI)V", line = 696)
	public static void method720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) Class3_Sub1_Sub4 local1 = Class58_Sub1.aClass3_Sub1_Sub4_2;
		Class58_Sub1.method12402(arg0);
		Class58_Sub1.aBoolean315 = false;
		if (Class58_Sub1.aClass3_Sub1_Sub4_2 != local1) {
			Class473.method28782();
		}
		Class58_Sub1.anInt1430 = arg1 * -151931519;
		Class58_Sub1.anInt1442 = arg2 * 1679987289;
		Class58_Sub1.aBoolean318 = arg3;
	}

	@OriginalMember(owner = "client!cb", name = "md", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;S)V", line = 6448)
	static final void method716(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray21 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!cb", name = "xe", descriptor = "(Lclient!vs;I)V", line = 8253)
	static final void method719(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		@Pc(27) String local27 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		@Pc(33) Class3_Sub23 local33 = Class269.method25284(Class311.aClass311_59, client.aClass82_1.aClass577_2);
		local33.aClass3_Sub41_Sub1_1.method20251(Class43_Sub2.method8763(local13) + Class43_Sub2.method8763(local27));
		local33.aClass3_Sub41_Sub1_1.method20260(local13);
		local33.aClass3_Sub41_Sub1_1.method20260(local27);
		client.aClass82_1.method21601(local33);
	}

	@OriginalMember(owner = "client!cb", name = "asa", descriptor = "(Lclient!vs;I)V", line = 12362)
	static final void method718(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub27_1.method13858() && Class613.aClass21_13.method17031() ? 1 : 0;
	}

	@OriginalMember(owner = "client!cb", name = "auo", descriptor = "(Lclient!vs;I)V", line = 12487)
	static final void method721(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub23_1.method14599(local12);
	}
}

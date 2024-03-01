package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wx")
public abstract class Class565 {

	@OriginalMember(owner = "client!wx", name = "<init>", descriptor = "()V", line = 7)
	Class565() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!wx", name = "h", descriptor = "([BZ)Ljava/lang/Object;", line = 12)
	public static Object method32905(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0.length > 136) {
			@Pc(11) ByteBuffer local11 = ByteBuffer.allocateDirect(arg0.length);
			local11.position(0);
			local11.put(arg0);
			return local11;
		} else if (arg1) {
			return Arrays.copyOf(arg0, arg0.length);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!wx", name = "l", descriptor = "([BZ)Ljava/lang/Object;", line = 12)
	public static Object method32906(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0.length > 136) {
			@Pc(11) ByteBuffer local11 = ByteBuffer.allocateDirect(arg0.length);
			local11.position(0);
			local11.put(arg0);
			return local11;
		} else if (arg1) {
			return Arrays.copyOf(arg0, arg0.length);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!wx", name = "x", descriptor = "([BZ)Ljava/lang/Object;", line = 12)
	public static Object method32907(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0.length > 136) {
			@Pc(11) ByteBuffer local11 = ByteBuffer.allocateDirect(arg0.length);
			local11.position(0);
			local11.put(arg0);
			return local11;
		} else if (arg1) {
			return Arrays.copyOf(arg0, arg0.length);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!wx", name = "s", descriptor = "(Ljava/lang/Object;Z)[B", line = 25)
	public static byte[] method32909(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(11) byte[] local11 = (byte[]) arg0;
			return arg1 ? Arrays.copyOf(local11, local11.length) : local11;
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(26) ByteBuffer local26 = (ByteBuffer) arg0;
			@Pc(30) byte[] local30 = new byte[local26.capacity()];
			local26.position(0);
			local26.get(local30);
			return local30;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wx", name = "b", descriptor = "(Ljava/lang/Object;II)[B", line = 43)
	public static byte[] method32908(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(10) byte[] local10 = (byte[]) arg0;
			return Arrays.copyOfRange(local10, arg1, arg2 + arg1);
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(23) ByteBuffer local23 = (ByteBuffer) arg0;
			@Pc(26) byte[] local26 = new byte[arg2];
			local23.position(arg1);
			local23.get(local26, 0, arg2);
			return local26;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wx", name = "u", descriptor = "(Ljava/lang/Object;II)[B", line = 43)
	public static byte[] method32910(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(10) byte[] local10 = (byte[]) arg0;
			return Arrays.copyOfRange(local10, arg1, arg2 + arg1);
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(23) ByteBuffer local23 = (ByteBuffer) arg0;
			@Pc(26) byte[] local26 = new byte[arg2];
			local23.position(arg1);
			local23.get(local26, 0, arg2);
			return local26;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wx", name = "y", descriptor = "(Ljava/lang/Object;II)[B", line = 43)
	public static byte[] method32911(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(10) byte[] local10 = (byte[]) arg0;
			return Arrays.copyOfRange(local10, arg1, arg2 + arg1);
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(23) ByteBuffer local23 = (ByteBuffer) arg0;
			@Pc(26) byte[] local26 = new byte[arg2];
			local23.position(arg1);
			local23.get(local26, 0, arg2);
			return local26;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wx", name = "a", descriptor = "(IIIIIILclient!sp;B)V", line = 61)
	static void method32913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class462 arg6) {
		@Pc(1) Class3_Sub7 local1 = null;
		for (@Pc(6) Class3_Sub7 local6 = (Class3_Sub7) Class3_Sub7.aClass553_16.method32768(); local6 != null; local6 = (Class3_Sub7) Class3_Sub7.aClass553_16.method32709()) {
			if (local6.anInt1191 * -53574091 == arg0 && local6.anInt1187 * -1303695121 == arg1 && arg2 == local6.anInt1184 * -2103701847 && arg3 == local6.anInt1183 * 1349018393) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class3_Sub7();
			local1.anInt1191 = arg0 * 1473846301;
			local1.anInt1183 = arg3 * 1240877353;
			local1.anInt1187 = arg1 * 665189903;
			local1.anInt1184 = arg2 * 449344921;
			Class3_Sub7.aClass553_16.method32702(local1);
		}
		local1.anInt1182 = arg4 * -1796345009;
		local1.anInt1189 = arg5 * 1753941885;
		local1.aClass462_1 = arg6;
		local1.aBoolean255 = true;
		local1.aBoolean256 = false;
	}

	@OriginalMember(owner = "client!wx", name = "s", descriptor = "(I)V", line = 254)
	public static void method32912() {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_2, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub9_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub25_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub4_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub3_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub6_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub7_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub2_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub22_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub5_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_2, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub12_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub17_1, Class191.aClass191_2.anInt3679 * -356338717);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub29_1, 0);
		if (Class613.aClass21_13 != null && Class613.aClass21_13.method17166() && Class613.aClass21_13.method17131()) {
			Class613.aClass21_13.method17130();
		}
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub23_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub14_1, 1);
		Class586.method33283();
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub8_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub32_1, 4);
		Class457.method28515();
		client.aClass370_1.method26953().method28901();
		client.aBoolean606 = true;
	}

	@OriginalMember(owner = "client!wx", name = "ady", descriptor = "(Lclient!vs;B)V", line = 9248)
	static final void method32914(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) Class594 local17 = Class44_Sub3.aClass596_1.method33435(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.anInt5466 * 2120045409;
	}
}

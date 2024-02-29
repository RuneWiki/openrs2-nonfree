package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public class Class532 {

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
	int anInt5172;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
	int anInt5173;

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
	int anInt5174;

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
	int anInt5175;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "Ljava/lang/String;")
	String aString227;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "(Lclient!akv;S)Lclient!gw;", line = 10)
	public static Class287 method30741(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		if (local3 == 0) {
			return null;
		}
		local3--;
		arg0.anInt3089 += -1387468933;
		@Pc(19) int local19 = arg0.method22500();
		@Pc(22) Object[] local22 = new Object[local3];
		for (@Pc(24) int local24 = 0; local24 < local3; local24++) {
			@Pc(31) int local31 = arg0.method22478();
			if (local31 == 0) {
				local22[local24] = Class489.method30011(Integer.class).method30209(arg0);
			} else if (local31 == 1) {
				local22[local24] = Class489.method30011(String.class).method30209(arg0);
			} else {
				throw new IllegalStateException("Unrecognised type ID in deserialise: " + local31);
			}
		}
		return new Class287(local19, local22);
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(CI)Z", line = 236)
	public static boolean method30742(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "(Lclient!are;I)V", line = 521)
	static void method30743(@OriginalArg(0) Class77_Sub1_Sub11 arg0) {
		@Pc(1) boolean local1 = false;
		arg0.method24069();
		for (@Pc(9) Class77_Sub1_Sub11 local9 = (Class77_Sub1_Sub11) Class683.aClass691_17.method36335(); local9 != null; local9 = (Class77_Sub1_Sub11) Class683.aClass691_17.method36340()) {
			if (Class290.method26996(arg0.method22225(), local9.method22225())) {
				Class434.method28870(arg0, local9);
				local1 = true;
				break;
			}
		}
		if (!local1) {
			Class683.aClass691_17.method36326(arg0);
		}
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V", line = 705)
	Class532() {
	}

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "(B)Ljava/lang/String;", line = 708)
	public String method30744() {
		return this.aString227;
	}

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "()Ljava/lang/String;", line = 708)
	public String method30745() {
		return this.aString227;
	}

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "()I", line = 712)
	public int method30746() {
		return this.anInt5173 * -1494378647;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)I", line = 712)
	public int method30747() {
		return this.anInt5173 * -1494378647;
	}

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "()I", line = 712)
	public int method30748() {
		return this.anInt5173 * -1494378647;
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "()I", line = 716)
	public int method30749() {
		return this.anInt5174 * -635845003;
	}

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "()I", line = 716)
	public int method30750() {
		return this.anInt5174 * -635845003;
	}

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "(I)I", line = 716)
	public int method30751() {
		return this.anInt5174 * -635845003;
	}

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "(I)I", line = 720)
	public int method30752() {
		return this.anInt5175 * 300455605;
	}

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "()I", line = 720)
	public int method30753() {
		return this.anInt5175 * 300455605;
	}

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "()I", line = 720)
	public int method30754() {
		return this.anInt5175 * 300455605;
	}

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "(B)I", line = 724)
	public int method30755() {
		return this.anInt5172 * -474631565;
	}

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "()I", line = 724)
	public int method30756() {
		return this.anInt5172 * -474631565;
	}

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "()I", line = 724)
	public int method30757() {
		return this.anInt5172 * -474631565;
	}

	@OriginalMember(owner = "client!sf", name = "ez", descriptor = "(IB)Z", line = 1752)
	static boolean method30758(@OriginalArg(0) int arg0) {
		return arg0 == 9 || arg0 == 7;
	}

	@OriginalMember(owner = "client!sf", name = "pf", descriptor = "(Lclient!yf;B)V", line = 7410)
	static final void method30759(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3874 * -881188269;
	}

	@OriginalMember(owner = "client!sf", name = "ahw", descriptor = "(Lclient!yf;B)V", line = 10682)
	static final void method30760(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class88.anInt610 * 204700261 + Class136.anInt1674;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class349.anInt4496 * -1636630007 + Class136.anInt1675;
	}

	@OriginalMember(owner = "client!sf", name = "aie", descriptor = "(Lclient!yf;I)V", line = 10949)
	static final void method30761(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(29) int local29 = local23 >> 14 & 0x3FFF;
		@Pc(33) int local33 = local23 & 0x3FFF;
		@Pc(39) int local39 = Class312.method27304(local13, local29, local33);
		if (local39 < 0) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local39;
		}
	}

	@OriginalMember(owner = "client!sf", name = "axf", descriptor = "(Lclient!yf;I)V", line = 13371)
	static final void method30762(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}

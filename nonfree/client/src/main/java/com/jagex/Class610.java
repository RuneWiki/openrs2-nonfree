package com.jagex;

import java.util.ArrayList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vz")
public class Class610 implements Interface69 {

	@OriginalMember(owner = "client!vz", name = "t", descriptor = "Z")
	boolean aBoolean831;

	@OriginalMember(owner = "client!vz", name = "q", descriptor = "I")
	int anInt5568;

	@OriginalMember(owner = "client!vz", name = "w", descriptor = "[B")
	byte[] aByteArray104;

	@OriginalMember(owner = "client!vz", name = "c", descriptor = "Lclient!va;")
	Class590 aClass590_5 = Class590.aClass590_2;

	@OriginalMember(owner = "client!vz", name = "l", descriptor = "Lclient!pw;")
	Class478 aClass478_133;

	@OriginalMember(owner = "client!vz", name = "v", descriptor = "I")
	int anInt5567;

	@OriginalMember(owner = "client!vz", name = "p", descriptor = "Lclient!lj;")
	Class117 aClass117_5;

	@OriginalMember(owner = "client!vz", name = "y", descriptor = "Lclient!vf;")
	Interface68 anInterface68_2;

	@OriginalMember(owner = "client!vz", name = "x", descriptor = "Lclient!er;")
	Class232 aClass232_86;

	@OriginalMember(owner = "client!vz", name = "d", descriptor = "Z")
	boolean aBoolean832;

	@OriginalMember(owner = "client!vz", name = "p", descriptor = "(FLclient!oo;Lclient!ot;Lclient!oo;Lclient!oo;Lclient!oo;Lclient!oo;FFFFB)V", line = 13)
	public static void method32194(@OriginalArg(0) float arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class452 arg2, @OriginalArg(3) Class447 arg3, @OriginalArg(4) Class447 arg4, @OriginalArg(5) Class447 arg5, @OriginalArg(6) Class447 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10) {
		if (arg3.method29143(arg1)) {
			return;
		}
		@Pc(9) Class447 local9 = Class447.method29120(0.0F, 0.0F, 0.0F);
		@Pc(14) Class447 local14 = Class447.method29124(Class447.method29160(arg3, arg1));
		local14.method29198(arg2);
		@Pc(21) Class447 local21 = Class447.method29160(local14, local9);
		@Pc(24) float local24 = local21.method29170();
		if (arg7 > 0.0F) {
			arg5 = Class447.method29124(arg5);
			arg5.method29183(arg8 * (local24 / arg7));
		}
		if (arg5.aFloat277 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat277) || local24 > arg9 || local24 < arg10) {
			arg1.method29136(arg3);
			arg4.method29137();
			return;
		}
		arg2.method29307();
		@Pc(68) Class447 local68 = Class447.method29120(1.0F, 0.0F, 0.0F);
		@Pc(73) Class447 local73 = Class447.method29120(0.0F, 1.0F, 0.0F);
		@Pc(78) Class447 local78 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local68.method29198(arg2);
		local73.method29198(arg2);
		local78.method29198(arg2);
		@Pc(98) Class447 local98 = Class447.method29120(Class447.method29165(local68, arg4), Class447.method29165(local73, arg4), Class447.method29165(local78, arg4));
		@Pc(101) Class447 local101 = Class447.method29124(local98);
		local101.method29172();
		@Pc(111) Class447 local111 = Class447.method29188(Class447.method29178(local101, local101), Class447.method29194(arg5, 2.0F));
		@Pc(114) Class447 local114 = Class447.method29124(local21);
		local114.method29172();
		@Pc(119) Class447 local119 = Class447.method29124(local98);
		if (local111.aFloat277 > local114.aFloat277) {
			if (local21.aFloat277 < 0.0F) {
				local119.aFloat277 += arg0 * arg5.aFloat277;
				if (local119.aFloat277 > 0.0F) {
					local119.aFloat277 = 0.0F;
				}
			} else {
				local119.aFloat277 -= arg0 * arg5.aFloat277;
				if (local119.aFloat277 < 0.0F) {
					local119.aFloat277 = 0.0F;
				}
			}
		} else if (local101.aFloat277 < arg6.aFloat277) {
			if (local21.aFloat277 < 0.0F) {
				local119.aFloat277 -= arg5.aFloat277 * arg0;
				if (local119.aFloat277 < -arg6.aFloat277) {
					local119.aFloat277 = -arg6.aFloat277;
				}
			} else {
				local119.aFloat277 += arg5.aFloat277 * arg0;
				if (local119.aFloat277 > arg6.aFloat277) {
					local119.aFloat277 = arg6.aFloat277;
				}
			}
		}
		if (local111.aFloat276 > local114.aFloat276) {
			if (local21.aFloat276 < 0.0F) {
				local119.aFloat276 += arg5.aFloat276 * arg0;
				if (local119.aFloat276 > 0.0F) {
					local119.aFloat276 = 0.0F;
				}
			} else {
				local119.aFloat276 -= arg5.aFloat276 * arg0;
				if (local119.aFloat276 < 0.0F) {
					local119.aFloat276 = 0.0F;
				}
			}
		} else if (local101.aFloat276 < arg6.aFloat276) {
			if (local21.aFloat276 < 0.0F) {
				local119.aFloat276 -= arg0 * arg5.aFloat276;
				if (local119.aFloat276 < -arg6.aFloat276) {
					local119.aFloat276 = -arg6.aFloat276;
				}
			} else {
				local119.aFloat276 += arg5.aFloat276 * arg0;
				if (local119.aFloat276 > arg6.aFloat276) {
					local119.aFloat276 = arg6.aFloat276;
				}
			}
		}
		if (local111.aFloat278 > local114.aFloat278) {
			if (local21.aFloat278 < 0.0F) {
				local119.aFloat278 += arg5.aFloat278 * arg0;
				if (local119.aFloat278 > 0.0F) {
					local119.aFloat278 = 0.0F;
				}
			} else {
				local119.aFloat278 -= arg5.aFloat278 * arg0;
				if (local119.aFloat278 < 0.0F) {
					local119.aFloat278 = 0.0F;
				}
			}
		} else if (local101.aFloat278 < arg6.aFloat278) {
			if (local21.aFloat278 < 0.0F) {
				local119.aFloat278 -= arg5.aFloat278 * arg0;
				if (local119.aFloat278 < -arg6.aFloat278) {
					local119.aFloat278 = -arg6.aFloat278;
				}
			} else {
				local119.aFloat278 += arg5.aFloat278 * arg0;
				if (local119.aFloat278 > arg6.aFloat278) {
					local119.aFloat278 = arg6.aFloat278;
				}
			}
		}
		@Pc(421) Class447 local421 = Class447.method29194(local68, local119.aFloat277);
		local421.method29152(local73, local119.aFloat276);
		local421.method29152(local78, local119.aFloat278);
		arg4.method29211(local421, 0.8F);
		arg1.method29146(Class447.method29194(arg4, arg0));
		local101.method29130();
		local119.method29130();
		local114.method29130();
	}

	@OriginalMember(owner = "client!vz", name = "<init>", descriptor = "(Lclient!pw;ILclient!lj;Lclient!vf;Lclient!er;)V", line = 24)
	public Class610(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) Interface68 arg3, @OriginalArg(4) Class232 arg4) {
		this.aClass478_133 = arg0;
		this.anInt5567 = arg1 * -1757603505;
		this.aClass117_5 = arg2;
		this.anInterface68_2 = arg3;
		this.aClass232_86 = arg4;
		this.aBoolean832 = this.aClass232_86 != null;
		this.aClass590_5 = Class590.aClass590_3;
	}

	@OriginalMember(owner = "client!vz", name = "f", descriptor = "()V", line = 35)
	@Override
	public void method32163() {
		if (this.aClass590_5 != Class590.aClass590_3) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass478_133.method29745(this.anInt5567 * -841589329);
		if (local12 == null) {
			return;
		}
		this.aByteArray104 = local12;
		this.method32196();
		this.aClass590_5 = Class590.aClass590_1;
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26109(this, local12.length, this.anInt5567 * -841589329, false);
		}
	}

	@OriginalMember(owner = "client!vz", name = "p", descriptor = "(B)V", line = 35)
	@Override
	public void method32150() {
		if (this.aClass590_5 != Class590.aClass590_3) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass478_133.method29745(this.anInt5567 * -841589329);
		if (local12 == null) {
			return;
		}
		this.aByteArray104 = local12;
		this.method32196();
		this.aClass590_5 = Class590.aClass590_1;
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26109(this, local12.length, this.anInt5567 * -841589329, false);
		}
	}

	@OriginalMember(owner = "client!vz", name = "e", descriptor = "()V", line = 35)
	@Override
	public void method32148() {
		if (this.aClass590_5 != Class590.aClass590_3) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass478_133.method29745(this.anInt5567 * -841589329);
		if (local12 == null) {
			return;
		}
		this.aByteArray104 = local12;
		this.method32196();
		this.aClass590_5 = Class590.aClass590_1;
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26109(this, local12.length, this.anInt5567 * -841589329, false);
		}
	}

	@OriginalMember(owner = "client!vz", name = "a", descriptor = "()Lclient!qs;", line = 49)
	@Override
	public Class496 method32167() {
		@Pc(5) Class496 local5 = new Class496(this.aClass117_5);
		local5.method30090(this);
		return local5;
	}

	@OriginalMember(owner = "client!vz", name = "o", descriptor = "()Lclient!qs;", line = 49)
	@Override
	public Class496 method32164() {
		@Pc(5) Class496 local5 = new Class496(this.aClass117_5);
		local5.method30090(this);
		return local5;
	}

	@OriginalMember(owner = "client!vz", name = "b", descriptor = "()Lclient!qs;", line = 49)
	@Override
	public Class496 method32192() {
		@Pc(5) Class496 local5 = new Class496(this.aClass117_5);
		local5.method30090(this);
		return local5;
	}

	@OriginalMember(owner = "client!vz", name = "n", descriptor = "()Lclient!qs;", line = 49)
	@Override
	public Class496 method32166() {
		@Pc(5) Class496 local5 = new Class496(this.aClass117_5);
		local5.method30090(this);
		return local5;
	}

	@OriginalMember(owner = "client!vz", name = "c", descriptor = "(B)Lclient!qs;", line = 49)
	@Override
	public Class496 method32147() {
		@Pc(5) Class496 local5 = new Class496(this.aClass117_5);
		local5.method30090(this);
		return local5;
	}

	@OriginalMember(owner = "client!vz", name = "q", descriptor = "(Lclient!yf;I)V", line = 53)
	static void method32195(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class151.method23468(Class284.aClass86_9);
	}

	@OriginalMember(owner = "client!vz", name = "m", descriptor = "()Lclient!va;", line = 55)
	@Override
	public Class590 method32161() {
		return this.aClass590_5;
	}

	@OriginalMember(owner = "client!vz", name = "v", descriptor = "(I)Lclient!va;", line = 55)
	@Override
	public Class590 method32180() {
		return this.aClass590_5;
	}

	@OriginalMember(owner = "client!vz", name = "l", descriptor = "(B)Z", line = 59)
	@Override
	public boolean method32149() {
		return false;
	}

	@OriginalMember(owner = "client!vz", name = "h", descriptor = "()Z", line = 59)
	@Override
	public boolean method32169() {
		return false;
	}

	@OriginalMember(owner = "client!vz", name = "aj", descriptor = "()Z", line = 59)
	@Override
	public boolean method32168() {
		return false;
	}

	@OriginalMember(owner = "client!vz", name = "y", descriptor = "(B)V", line = 62)
	void method32196() {
	}

	@OriginalMember(owner = "client!vz", name = "ai", descriptor = "()V", line = 62)
	void method32197() {
	}

	@OriginalMember(owner = "client!vz", name = "w", descriptor = "(IB)[B", line = 65)
	@Override
	public byte[] method32151(@OriginalArg(0) int arg0) {
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26108(this);
		}
		return this.aByteArray104;
	}

	@OriginalMember(owner = "client!vz", name = "ag", descriptor = "(I)[B", line = 65)
	@Override
	public byte[] method32171(@OriginalArg(0) int arg0) {
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26108(this);
		}
		return this.aByteArray104;
	}

	@OriginalMember(owner = "client!vz", name = "al", descriptor = "(I)[B", line = 65)
	@Override
	public byte[] method32172(@OriginalArg(0) int arg0) {
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26108(this);
		}
		return this.aByteArray104;
	}

	@OriginalMember(owner = "client!vz", name = "t", descriptor = "(B)I", line = 72)
	@Override
	public int method32160() {
		return this.aByteArray104 == null ? 0 : this.aByteArray104.length;
	}

	@OriginalMember(owner = "client!vz", name = "ak", descriptor = "()I", line = 72)
	@Override
	public int method32174() {
		return this.aByteArray104 == null ? 0 : this.aByteArray104.length;
	}

	@OriginalMember(owner = "client!vz", name = "ao", descriptor = "()I", line = 72)
	@Override
	public int method32154() {
		return this.aByteArray104 == null ? 0 : this.aByteArray104.length;
	}

	@OriginalMember(owner = "client!vz", name = "au", descriptor = "()I", line = 72)
	@Override
	public int method32175() {
		return this.aByteArray104 == null ? 0 : this.aByteArray104.length;
	}

	@OriginalMember(owner = "client!vz", name = "q", descriptor = "(I)Lclient!qy;", line = 77)
	@Override
	public Class501 method32170() {
		return Class501.aClass501_4;
	}

	@OriginalMember(owner = "client!vz", name = "ax", descriptor = "()Lclient!qy;", line = 77)
	@Override
	public Class501 method32159() {
		return Class501.aClass501_4;
	}

	@OriginalMember(owner = "client!vz", name = "ar", descriptor = "()I", line = 81)
	@Override
	public int method32177() {
		return this.anInt5567 * -841589329;
	}

	@OriginalMember(owner = "client!vz", name = "ad", descriptor = "()I", line = 81)
	@Override
	public int method32178() {
		return this.anInt5567 * -841589329;
	}

	@OriginalMember(owner = "client!vz", name = "ac", descriptor = "()I", line = 81)
	@Override
	public int method32153() {
		return this.anInt5567 * -841589329;
	}

	@OriginalMember(owner = "client!vz", name = "x", descriptor = "(I)I", line = 81)
	@Override
	public int method32165() {
		return this.anInt5567 * -841589329;
	}

	@OriginalMember(owner = "client!vz", name = "az", descriptor = "(Lclient!akv;)V", line = 85)
	@Override
	public void method32190(@OriginalArg(0) Class77_Sub39 arg0) {
		if (this.aClass232_86 == null) {
			return;
		}
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26108(this);
		}
		if (this.aBoolean831) {
			throw new RuntimeException("");
		}
		@Pc(23) Class232 local23 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			@Pc(28) List local28 = this.method32199();
			if (local28 != null) {
				local28.add(arg0);
				this.anInt5568 += arg0.aByteArray53.length * 1028522963;
				this.method32198(local28, this.anInt5568 * 1746291803);
			}
		}
	}

	@OriginalMember(owner = "client!vz", name = "bj", descriptor = "(Lclient!akv;)V", line = 85)
	@Override
	public void method32179(@OriginalArg(0) Class77_Sub39 arg0) {
		if (this.aClass232_86 == null) {
			return;
		}
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26108(this);
		}
		if (this.aBoolean831) {
			throw new RuntimeException("");
		}
		@Pc(23) Class232 local23 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			@Pc(28) List local28 = this.method32199();
			if (local28 != null) {
				local28.add(arg0);
				this.anInt5568 += arg0.aByteArray53.length * 1028522963;
				this.method32198(local28, this.anInt5568 * 1746291803);
			}
		}
	}

	@OriginalMember(owner = "client!vz", name = "d", descriptor = "(Lclient!akv;I)V", line = 85)
	@Override
	public void method32155(@OriginalArg(0) Class77_Sub39 arg0) {
		if (this.aClass232_86 == null) {
			return;
		}
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26108(this);
		}
		if (this.aBoolean831) {
			throw new RuntimeException("");
		}
		@Pc(23) Class232 local23 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			@Pc(28) List local28 = this.method32199();
			if (local28 != null) {
				local28.add(arg0);
				this.anInt5568 += arg0.aByteArray53.length * 1028522963;
				this.method32198(local28, this.anInt5568 * 1746291803);
			}
		}
	}

	@OriginalMember(owner = "client!vz", name = "aw", descriptor = "(Lclient!akv;)V", line = 85)
	@Override
	public void method32189(@OriginalArg(0) Class77_Sub39 arg0) {
		if (this.aClass232_86 == null) {
			return;
		}
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26108(this);
		}
		if (this.aBoolean831) {
			throw new RuntimeException("");
		}
		@Pc(23) Class232 local23 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			@Pc(28) List local28 = this.method32199();
			if (local28 != null) {
				local28.add(arg0);
				this.anInt5568 += arg0.aByteArray53.length * 1028522963;
				this.method32198(local28, this.anInt5568 * 1746291803);
			}
		}
	}

	@OriginalMember(owner = "client!vz", name = "bc", descriptor = "(Lclient!akv;)V", line = 85)
	@Override
	public void method32191(@OriginalArg(0) Class77_Sub39 arg0) {
		if (this.aClass232_86 == null) {
			return;
		}
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26108(this);
		}
		if (this.aBoolean831) {
			throw new RuntimeException("");
		}
		@Pc(23) Class232 local23 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			@Pc(28) List local28 = this.method32199();
			if (local28 != null) {
				local28.add(arg0);
				this.anInt5568 += arg0.aByteArray53.length * 1028522963;
				this.method32198(local28, this.anInt5568 * 1746291803);
			}
		}
	}

	@OriginalMember(owner = "client!vz", name = "bv", descriptor = "(Lclient!akv;)V", line = 85)
	@Override
	public void method32193(@OriginalArg(0) Class77_Sub39 arg0) {
		if (this.aClass232_86 == null) {
			return;
		}
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26108(this);
		}
		if (this.aBoolean831) {
			throw new RuntimeException("");
		}
		@Pc(23) Class232 local23 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			@Pc(28) List local28 = this.method32199();
			if (local28 != null) {
				local28.add(arg0);
				this.anInt5568 += arg0.aByteArray53.length * 1028522963;
				this.method32198(local28, this.anInt5568 * 1746291803);
			}
		}
	}

	@OriginalMember(owner = "client!vz", name = "s", descriptor = "(II)Lclient!akv;", line = 103)
	@Override
	public Class77_Sub39 method32162(@OriginalArg(0) int arg0) {
		if (this.aClass232_86 == null) {
			return null;
		}
		@Pc(7) Class77_Sub39 local7 = null;
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26108(this);
		}
		@Pc(20) Class232 local20 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			@Pc(25) List local25 = this.method32199();
			if (local25.size() > arg0) {
				local7 = (Class77_Sub39) local25.get(arg0);
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!vz", name = "av", descriptor = "(I)Lclient!akv;", line = 103)
	@Override
	public Class77_Sub39 method32187(@OriginalArg(0) int arg0) {
		if (this.aClass232_86 == null) {
			return null;
		}
		@Pc(7) Class77_Sub39 local7 = null;
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26108(this);
		}
		@Pc(20) Class232 local20 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			@Pc(25) List local25 = this.method32199();
			if (local25.size() > arg0) {
				local7 = (Class77_Sub39) local25.get(arg0);
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!vz", name = "at", descriptor = "(I)Z", line = 118)
	@Override
	public boolean method32181(@OriginalArg(0) int arg0) {
		if (this.aClass232_86 == null) {
			return false;
		}
		@Pc(6) boolean local6 = false;
		@Pc(10) Class232 local10 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			@Pc(15) List local15 = this.method32199();
			if (local15 != null && local15.size() > arg0) {
				local6 = local15.get(arg0) != null;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!vz", name = "ae", descriptor = "(I)Z", line = 118)
	@Override
	public boolean method32173(@OriginalArg(0) int arg0) {
		if (this.aClass232_86 == null) {
			return false;
		}
		@Pc(6) boolean local6 = false;
		@Pc(10) Class232 local10 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			@Pc(15) List local15 = this.method32199();
			if (local15 != null && local15.size() > arg0) {
				local6 = local15.get(arg0) != null;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!vz", name = "r", descriptor = "(IB)Z", line = 118)
	@Override
	public boolean method32158(@OriginalArg(0) int arg0) {
		if (this.aClass232_86 == null) {
			return false;
		}
		@Pc(6) boolean local6 = false;
		@Pc(10) Class232 local10 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			@Pc(15) List local15 = this.method32199();
			if (local15 != null && local15.size() > arg0) {
				local6 = local15.get(arg0) != null;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!vz", name = "g", descriptor = "(I)Z", line = 130)
	@Override
	public boolean method32157() {
		return this.aClass232_86 != null && this.aBoolean832;
	}

	@OriginalMember(owner = "client!vz", name = "ah", descriptor = "()Z", line = 130)
	@Override
	public boolean method32183() {
		return this.aClass232_86 != null && this.aBoolean832;
	}

	@OriginalMember(owner = "client!vz", name = "as", descriptor = "()Z", line = 130)
	@Override
	public boolean method32184() {
		return this.aClass232_86 != null && this.aBoolean832;
	}

	@OriginalMember(owner = "client!vz", name = "z", descriptor = "(B)I", line = 134)
	@Override
	public int method32156() {
		if (this.aClass232_86 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Class232 local10 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			@Pc(15) List local15 = this.method32199();
			if (local15 != null) {
				local6 = local15.size();
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!vz", name = "aq", descriptor = "()I", line = 134)
	@Override
	public int method32152() {
		if (this.aClass232_86 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Class232 local10 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			@Pc(15) List local15 = this.method32199();
			if (local15 != null) {
				local6 = local15.size();
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!vz", name = "j", descriptor = "(ZI)V", line = 146)
	@Override
	public void method32182(@OriginalArg(0) boolean arg0) {
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26108(this);
		}
		this.aBoolean831 = arg0;
	}

	@OriginalMember(owner = "client!vz", name = "am", descriptor = "(Z)V", line = 146)
	@Override
	public void method32186(@OriginalArg(0) boolean arg0) {
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26108(this);
		}
		this.aBoolean831 = arg0;
	}

	@OriginalMember(owner = "client!vz", name = "i", descriptor = "(I)Z", line = 153)
	@Override
	public boolean method32176() {
		if (this.aClass232_86 == null) {
			return false;
		}
		@Pc(8) List local8 = this.method32199();
		if (local8 == null || local8.size() <= 0) {
			this.aBoolean831 = false;
		}
		return this.aBoolean831;
	}

	@OriginalMember(owner = "client!vz", name = "ay", descriptor = "()Z", line = 153)
	@Override
	public boolean method32185() {
		if (this.aClass232_86 == null) {
			return false;
		}
		@Pc(8) List local8 = this.method32199();
		if (local8 == null || local8.size() <= 0) {
			this.aBoolean831 = false;
		}
		return this.aBoolean831;
	}

	@OriginalMember(owner = "client!vz", name = "af", descriptor = "()Z", line = 153)
	@Override
	public boolean method32188() {
		if (this.aClass232_86 == null) {
			return false;
		}
		@Pc(8) List local8 = this.method32199();
		if (local8 == null || local8.size() <= 0) {
			this.aBoolean831 = false;
		}
		return this.aBoolean831;
	}

	@OriginalMember(owner = "client!vz", name = "k", descriptor = "(Ljava/util/List;IB)V", line = 160)
	void method32198(@OriginalArg(0) List arg0, @OriginalArg(1) int arg1) {
		if (this.aClass232_86 == null || arg0 == null || arg1 < 0) {
			return;
		}
		@Pc(12) Class232 local12 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			this.aClass232_86.method25838((long) (this.anInt5567 * -841589329));
			if (arg1 <= this.aClass232_86.method25852()) {
				this.aClass232_86.method25845(arg0, (long) (this.anInt5567 * -841589329), arg1);
			} else {
				this.aBoolean832 = false;
				this.aBoolean831 = false;
				this.anInt5568 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vz", name = "u", descriptor = "(I)Ljava/util/List;", line = 175)
	List method32199() {
		if (this.aClass232_86 == null || !this.aBoolean832) {
			return null;
		}
		@Pc(10) List local10 = null;
		@Pc(14) Class232 local14 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			local10 = (List) this.aClass232_86.method25835((long) (this.anInt5567 * -841589329));
			if (local10 == null && this.aBoolean832) {
				local10 = new ArrayList();
				this.aClass232_86.method25845(local10, (long) (this.anInt5567 * -841589329), 0);
			}
			return local10;
		}
	}

	@OriginalMember(owner = "client!vz", name = "an", descriptor = "()Ljava/util/List;", line = 175)
	List method32200() {
		if (this.aClass232_86 == null || !this.aBoolean832) {
			return null;
		}
		@Pc(10) List local10 = null;
		@Pc(14) Class232 local14 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			local10 = (List) this.aClass232_86.method25835((long) (this.anInt5567 * -841589329));
			if (local10 == null && this.aBoolean832) {
				local10 = new ArrayList();
				this.aClass232_86.method25845(local10, (long) (this.anInt5567 * -841589329), 0);
			}
			return local10;
		}
	}

	@OriginalMember(owner = "client!vz", name = "ab", descriptor = "()Ljava/util/List;", line = 175)
	List method32201() {
		if (this.aClass232_86 == null || !this.aBoolean832) {
			return null;
		}
		@Pc(10) List local10 = null;
		@Pc(14) Class232 local14 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			local10 = (List) this.aClass232_86.method25835((long) (this.anInt5567 * -841589329));
			if (local10 == null && this.aBoolean832) {
				local10 = new ArrayList();
				this.aClass232_86.method25845(local10, (long) (this.anInt5567 * -841589329), 0);
			}
			return local10;
		}
	}

	@OriginalMember(owner = "client!vz", name = "ap", descriptor = "()Ljava/util/List;", line = 175)
	List method32202() {
		if (this.aClass232_86 == null || !this.aBoolean832) {
			return null;
		}
		@Pc(10) List local10 = null;
		@Pc(14) Class232 local14 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			local10 = (List) this.aClass232_86.method25835((long) (this.anInt5567 * -841589329));
			if (local10 == null && this.aBoolean832) {
				local10 = new ArrayList();
				this.aClass232_86.method25845(local10, (long) (this.anInt5567 * -841589329), 0);
			}
			return local10;
		}
	}

	@OriginalMember(owner = "client!vz", name = "aa", descriptor = "()Ljava/util/List;", line = 175)
	List method32203() {
		if (this.aClass232_86 == null || !this.aBoolean832) {
			return null;
		}
		@Pc(10) List local10 = null;
		@Pc(14) Class232 local14 = this.aClass232_86;
		synchronized (this.aClass232_86) {
			local10 = (List) this.aClass232_86.method25835((long) (this.anInt5567 * -841589329));
			if (local10 == null && this.aBoolean832) {
				local10 = new ArrayList();
				this.aClass232_86.method25845(local10, (long) (this.anInt5567 * -841589329), 0);
			}
			return local10;
		}
	}

	@OriginalMember(owner = "client!vz", name = "dl", descriptor = "(I)V", line = 811)
	public static void method32204() {
		Class50.method755(true);
	}

	@OriginalMember(owner = "client!vz", name = "az", descriptor = "(Lclient!dx;IIIIII)V", line = 1245)
	static void method32205(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((Class355.aClass83_28 == null || Class579.aClass83_37 == null || Class500.aClass83_30 == null) && Class470.aClass478_125.method29730(Class261.anInt3821 * -746775241) && Class470.aClass478_125.method29730(Class108.anInt1050 * -1368137493) && Class470.aClass478_125.method29730(Class431.anInt4907 * 842411465)) {
			@Pc(34) Class89 local34 = Class210.method25593(Class470.aClass478_125, Class108.anInt1050 * -1368137493, 0);
			Class579.aClass83_37 = arg0.method20076(local34, true);
			local34.method6726();
			Class275.aClass83_25 = arg0.method20076(local34, true);
			Class355.aClass83_28 = arg0.method20076(Class210.method25593(Class470.aClass478_125, Class261.anInt3821 * -746775241, 0), true);
			@Pc(63) Class89 local63 = Class210.method25593(Class470.aClass478_125, Class431.anInt4907 * 842411465, 0);
			Class500.aClass83_30 = arg0.method20076(local63, true);
			local63.method6726();
			Class573.aClass83_35 = arg0.method20076(local63, true);
		}
		if (Class355.aClass83_28 == null || Class579.aClass83_37 == null || Class500.aClass83_30 == null) {
			return;
		}
		@Pc(94) int local94 = (arg3 - Class500.aClass83_30.method18169() * 2) / Class355.aClass83_28.method18169();
		@Pc(96) int local96;
		for (local96 = 0; local96 < local94; local96++) {
			Class355.aClass83_28.method18123(arg1 + Class500.aClass83_30.method18169() + local96 * Class355.aClass83_28.method18169(), arg2 + arg4 - Class355.aClass83_28.method18171());
		}
		local96 = (arg4 - arg5 - Class500.aClass83_30.method18171()) / Class579.aClass83_37.method18171();
		for (@Pc(130) int local130 = 0; local130 < local96; local130++) {
			Class579.aClass83_37.method18123(arg1, arg5 + arg2 + local130 * Class579.aClass83_37.method18171());
			Class275.aClass83_25.method18123(arg3 + arg1 - Class275.aClass83_25.method18169(), arg5 + arg2 + local130 * Class579.aClass83_37.method18171());
		}
		Class500.aClass83_30.method18123(arg1, arg4 + arg2 - Class500.aClass83_30.method18171());
		Class573.aClass83_35.method18123(arg1 + arg3 - Class500.aClass83_30.method18169(), arg2 + arg4 - Class500.aClass83_30.method18171());
	}

	@OriginalMember(owner = "client!vz", name = "ux", descriptor = "(Lclient!yf;I)V", line = 8342)
	static final void method32206(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class96_Sub9.method7216(local13, local23, local33, false);
	}

	@OriginalMember(owner = "client!vz", name = "acp", descriptor = "(Lclient!yf;B)V", line = 9516)
	static final void method32207(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13 | 0x1 << local23;
	}

	@OriginalMember(owner = "client!vz", name = "afs", descriptor = "(Lclient!yf;I)V", line = 10155)
	static final void method32208(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(17) Class77_Sub1_Sub14 local17 = Class96_Sub21.method7763(local13);
		if (local17 != null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local17.anInt3041 * -894992131;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class143_Sub6.method15117(local17.aLong182 * -1208012376043926345L, Class128.aClass667_3.anInt5789 * -473969159);
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local17.anInt3042 * 1988131041;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local17.aString110 == null ? "" : local17.aString110;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local17.aString109 == null ? "" : local17.aString109;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local17.aString111 == null ? "" : local17.aString111;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local17.aString108 == null ? "" : local17.aString108;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local17.anInt3044 * 1232973141;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local17.aString112 == null ? "" : local17.aString112;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local17.aClass416_1 == null ? -1 : local17.aClass416_1.method36479();
			return;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
	}

	@OriginalMember(owner = "client!vz", name = "afz", descriptor = "(Lclient!yf;I)V", line = 10404)
	static final void method32209(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class346.method27845(local13);
	}

	@OriginalMember(owner = "client!vz", name = "akc", descriptor = "(Lclient!yf;B)V", line = 11406)
	static final void method32210(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class11.anInt36 * -891094135 == 2 ? 1 : 0;
	}
}

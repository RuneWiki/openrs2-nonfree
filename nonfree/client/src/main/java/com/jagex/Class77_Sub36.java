package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aks")
public class Class77_Sub36 extends Class77 implements Interface7 {

	@OriginalMember(owner = "client!aks", name = "w", descriptor = "I")
	static int anInt1775;

	@OriginalMember(owner = "client!aks", name = "au", descriptor = "Z")
	public static boolean aBoolean351;

	@OriginalMember(owner = "client!aks", name = "l", descriptor = "[Lclient!aks;")
	static Class77_Sub36[] aClass77_Sub36Array1 = new Class77_Sub36[0];

	@OriginalMember(owner = "client!aks", name = "q", descriptor = "I")
	public int anInt1777;

	@OriginalMember(owner = "client!aks", name = "x", descriptor = "I")
	public int anInt1778;

	@OriginalMember(owner = "client!aks", name = "y", descriptor = "I")
	public int anInt1779;

	@OriginalMember(owner = "client!aks", name = "t", descriptor = "I")
	public int anInt1776;

	@OriginalMember(owner = "client!aks", name = "m", descriptor = "(IIII)Lclient!aks;", line = 17)
	public static Class77_Sub36 method14433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class77_Sub36[] local2 = aClass77_Sub36Array1;
		synchronized (aClass77_Sub36Array1) {
			if (anInt1775 * 2450901 == 0) {
				return new Class77_Sub36(arg0, arg1, arg2, arg3);
			} else {
				aClass77_Sub36Array1[(anInt1775 -= 1809361789) * 2450901].method14440(arg0, arg1, arg2, arg3);
				return aClass77_Sub36Array1[anInt1775 * 2450901];
			}
		}
	}

	@OriginalMember(owner = "client!aks", name = "h", descriptor = "(IIII)Lclient!aks;", line = 17)
	public static Class77_Sub36 method14434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class77_Sub36[] local2 = aClass77_Sub36Array1;
		synchronized (aClass77_Sub36Array1) {
			if (anInt1775 * 2450901 == 0) {
				return new Class77_Sub36(arg0, arg1, arg2, arg3);
			} else {
				aClass77_Sub36Array1[(anInt1775 -= 1809361789) * 2450901].method14440(arg0, arg1, arg2, arg3);
				return aClass77_Sub36Array1[anInt1775 * 2450901];
			}
		}
	}

	@OriginalMember(owner = "client!aks", name = "ag", descriptor = "(Lclient!aks;)Lclient!aks;", line = 27)
	public static Class77_Sub36 method14435(@OriginalArg(0) Class77_Sub36 arg0) {
		@Pc(2) Class77_Sub36[] local2 = aClass77_Sub36Array1;
		synchronized (aClass77_Sub36Array1) {
			if (anInt1775 * 2450901 == 0) {
				return new Class77_Sub36(arg0);
			} else {
				aClass77_Sub36Array1[(anInt1775 -= 1809361789) * 2450901].method14442(arg0);
				return aClass77_Sub36Array1[anInt1775 * 2450901];
			}
		}
	}

	@OriginalMember(owner = "client!aks", name = "ai", descriptor = "(Lclient!aks;)Lclient!aks;", line = 27)
	public static Class77_Sub36 method14436(@OriginalArg(0) Class77_Sub36 arg0) {
		@Pc(2) Class77_Sub36[] local2 = aClass77_Sub36Array1;
		synchronized (aClass77_Sub36Array1) {
			if (anInt1775 * 2450901 == 0) {
				return new Class77_Sub36(arg0);
			} else {
				aClass77_Sub36Array1[(anInt1775 -= 1809361789) * 2450901].method14442(arg0);
				return aClass77_Sub36Array1[anInt1775 * 2450901];
			}
		}
	}

	@OriginalMember(owner = "client!aks", name = "aj", descriptor = "(Lclient!aks;)Lclient!aks;", line = 27)
	public static Class77_Sub36 method14437(@OriginalArg(0) Class77_Sub36 arg0) {
		@Pc(2) Class77_Sub36[] local2 = aClass77_Sub36Array1;
		synchronized (aClass77_Sub36Array1) {
			if (anInt1775 * 2450901 == 0) {
				return new Class77_Sub36(arg0);
			} else {
				aClass77_Sub36Array1[(anInt1775 -= 1809361789) * 2450901].method14442(arg0);
				return aClass77_Sub36Array1[anInt1775 * 2450901];
			}
		}
	}

	@OriginalMember(owner = "client!aks", name = "al", descriptor = "(IZ)Lclient!aks;", line = 37)
	public static Class77_Sub36 method14438(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) Class77_Sub36[] local2 = aClass77_Sub36Array1;
		synchronized (aClass77_Sub36Array1) {
			if (anInt1775 * 2450901 == 0) {
				return new Class77_Sub36(arg0, arg1);
			} else {
				aClass77_Sub36Array1[(anInt1775 -= 1809361789) * 2450901].method14446(arg0, arg1);
				return aClass77_Sub36Array1[anInt1775 * 2450901];
			}
		}
	}

	@OriginalMember(owner = "client!aks", name = "<init>", descriptor = "()V", line = 46)
	public Class77_Sub36() {
		this.anInt1776 = -1166548959;
	}

	@OriginalMember(owner = "client!aks", name = "<init>", descriptor = "(IIII)V", line = 50)
	public Class77_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1776 = arg0 * 1166548959;
		this.anInt1777 = arg1 * -1224142395;
		this.anInt1778 = arg2 * -1544617399;
		this.anInt1779 = arg3 * 646265707;
	}

	@OriginalMember(owner = "client!aks", name = "<init>", descriptor = "(Lclient!aks;)V", line = 57)
	Class77_Sub36(@OriginalArg(0) Class77_Sub36 arg0) {
		this.anInt1776 = arg0.anInt1776;
		this.anInt1777 = arg0.anInt1777;
		this.anInt1778 = arg0.anInt1778;
		this.anInt1779 = arg0.anInt1779;
	}

	@OriginalMember(owner = "client!aks", name = "<init>", descriptor = "(Lclient!akv;)V", line = 64)
	public Class77_Sub36(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method14431(arg0);
	}

	@OriginalMember(owner = "client!aks", name = "<init>", descriptor = "(IZ)V", line = 68)
	Class77_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == -1) {
			this.anInt1776 = -1166548959;
		} else {
			this.anInt1776 = (arg0 >> 28 & 0x3) * 1166548959;
			this.anInt1777 = ((arg0 >> 14 & 0x3FFF) << 9) * -1224142395;
			this.anInt1778 = 0;
			this.anInt1779 = ((arg0 & 0x3FFF) << 9) * 646265707;
			if (arg1) {
				this.anInt1777 += 152159488;
				this.anInt1779 += -2059703552;
			}
		}
	}

	@OriginalMember(owner = "client!aks", name = "ao", descriptor = "(IIII)V", line = 83)
	void method14439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1776 = arg0 * 1166548959;
		this.anInt1777 = arg1 * -1224142395;
		this.anInt1778 = arg2 * -1544617399;
		this.anInt1779 = arg3 * 646265707;
	}

	@OriginalMember(owner = "client!aks", name = "g", descriptor = "(IIIIB)V", line = 83)
	void method14440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1776 = arg0 * 1166548959;
		this.anInt1777 = arg1 * -1224142395;
		this.anInt1778 = arg2 * -1544617399;
		this.anInt1779 = arg3 * 646265707;
	}

	@OriginalMember(owner = "client!aks", name = "ak", descriptor = "(IIII)V", line = 83)
	void method14441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1776 = arg0 * 1166548959;
		this.anInt1777 = arg1 * -1224142395;
		this.anInt1778 = arg2 * -1544617399;
		this.anInt1779 = arg3 * 646265707;
	}

	@OriginalMember(owner = "client!aks", name = "z", descriptor = "(Lclient!aks;B)V", line = 90)
	void method14442(@OriginalArg(0) Class77_Sub36 arg0) {
		this.anInt1776 = arg0.anInt1776;
		this.anInt1777 = arg0.anInt1777;
		this.anInt1778 = arg0.anInt1778;
		this.anInt1779 = arg0.anInt1779;
	}

	@OriginalMember(owner = "client!aks", name = "au", descriptor = "(Lclient!aks;)V", line = 90)
	void method14443(@OriginalArg(0) Class77_Sub36 arg0) {
		this.anInt1776 = arg0.anInt1776;
		this.anInt1777 = arg0.anInt1777;
		this.anInt1778 = arg0.anInt1778;
		this.anInt1779 = arg0.anInt1779;
	}

	@OriginalMember(owner = "client!aks", name = "ax", descriptor = "(Lclient!aks;)V", line = 90)
	void method14444(@OriginalArg(0) Class77_Sub36 arg0) {
		this.anInt1776 = arg0.anInt1776;
		this.anInt1777 = arg0.anInt1777;
		this.anInt1778 = arg0.anInt1778;
		this.anInt1779 = arg0.anInt1779;
	}

	@OriginalMember(owner = "client!aks", name = "ar", descriptor = "(Lclient!aks;)V", line = 90)
	void method14445(@OriginalArg(0) Class77_Sub36 arg0) {
		this.anInt1776 = arg0.anInt1776;
		this.anInt1777 = arg0.anInt1777;
		this.anInt1778 = arg0.anInt1778;
		this.anInt1779 = arg0.anInt1779;
	}

	@OriginalMember(owner = "client!aks", name = "j", descriptor = "(IZS)V", line = 97)
	void method14446(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == -1) {
			this.anInt1776 = -1166548959;
			return;
		}
		this.anInt1776 = (arg0 >> 28 & 0x3) * 1166548959;
		this.anInt1777 = ((arg0 >> 14 & 0x3FFF) << 9) * -1224142395;
		this.anInt1778 = 0;
		this.anInt1779 = ((arg0 & 0x3FFF) << 9) * 646265707;
		if (arg1) {
			this.anInt1777 += 152159488;
			this.anInt1779 += -2059703552;
		}
	}

	@OriginalMember(owner = "client!aks", name = "av", descriptor = "(IZ)V", line = 97)
	void method14447(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == -1) {
			this.anInt1776 = -1166548959;
			return;
		}
		this.anInt1776 = (arg0 >> 28 & 0x3) * 1166548959;
		this.anInt1777 = ((arg0 >> 14 & 0x3FFF) << 9) * -1224142395;
		this.anInt1778 = 0;
		this.anInt1779 = ((arg0 & 0x3FFF) << 9) * 646265707;
		if (arg1) {
			this.anInt1777 += 152159488;
			this.anInt1779 += -2059703552;
		}
	}

	@OriginalMember(owner = "client!aks", name = "ad", descriptor = "(IZ)V", line = 97)
	void method14448(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == -1) {
			this.anInt1776 = -1166548959;
			return;
		}
		this.anInt1776 = (arg0 >> 28 & 0x3) * 1166548959;
		this.anInt1777 = ((arg0 >> 14 & 0x3FFF) << 9) * -1224142395;
		this.anInt1778 = 0;
		this.anInt1779 = ((arg0 & 0x3FFF) << 9) * 646265707;
		if (arg1) {
			this.anInt1777 += 152159488;
			this.anInt1779 += -2059703552;
		}
	}

	@OriginalMember(owner = "client!aks", name = "ac", descriptor = "(IZ)V", line = 97)
	void method14449(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == -1) {
			this.anInt1776 = -1166548959;
			return;
		}
		this.anInt1776 = (arg0 >> 28 & 0x3) * 1166548959;
		this.anInt1777 = ((arg0 >> 14 & 0x3FFF) << 9) * -1224142395;
		this.anInt1778 = 0;
		this.anInt1779 = ((arg0 & 0x3FFF) << 9) * 646265707;
		if (arg1) {
			this.anInt1777 += 152159488;
			this.anInt1779 += -2059703552;
		}
	}

	@OriginalMember(owner = "client!aks", name = "at", descriptor = "(IZ)V", line = 97)
	void method14450(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == -1) {
			this.anInt1776 = -1166548959;
			return;
		}
		this.anInt1776 = (arg0 >> 28 & 0x3) * 1166548959;
		this.anInt1777 = ((arg0 >> 14 & 0x3FFF) << 9) * -1224142395;
		this.anInt1778 = 0;
		this.anInt1779 = ((arg0 & 0x3FFF) << 9) * 646265707;
		if (arg1) {
			this.anInt1777 += 152159488;
			this.anInt1779 += -2059703552;
		}
	}

	@OriginalMember(owner = "client!aks", name = "ae", descriptor = "(IZ)V", line = 97)
	void method14451(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == -1) {
			this.anInt1776 = -1166548959;
			return;
		}
		this.anInt1776 = (arg0 >> 28 & 0x3) * 1166548959;
		this.anInt1777 = ((arg0 >> 14 & 0x3FFF) << 9) * -1224142395;
		this.anInt1778 = 0;
		this.anInt1779 = ((arg0 & 0x3FFF) << 9) * 646265707;
		if (arg1) {
			this.anInt1777 += 152159488;
			this.anInt1779 += -2059703552;
		}
	}

	@OriginalMember(owner = "client!aks", name = "ah", descriptor = "()Lclient!oo;", line = 111)
	public Class447 method14452() {
		return new Class447((float) (this.anInt1777 * 599803149), (float) (this.anInt1778 * -1203728391), (float) (this.anInt1779 * 33298755));
	}

	@OriginalMember(owner = "client!aks", name = "b", descriptor = "(I)Lclient!oo;", line = 111)
	public Class447 method14453() {
		return new Class447((float) (this.anInt1777 * 599803149), (float) (this.anInt1778 * -1203728391), (float) (this.anInt1779 * 33298755));
	}

	@OriginalMember(owner = "client!aks", name = "as", descriptor = "()Lclient!oo;", line = 111)
	public Class447 method14454() {
		return new Class447((float) (this.anInt1777 * 599803149), (float) (this.anInt1778 * -1203728391), (float) (this.anInt1779 * 33298755));
	}

	@OriginalMember(owner = "client!aks", name = "am", descriptor = "(Lclient!akv;)V", line = 115)
	void method14455(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.method22403(this.anInt1776 * 955276319);
		arg0.method22417(this.anInt1777 * 599803149);
		arg0.method22417(this.anInt1778 * -1203728391);
		arg0.method22417(this.anInt1779 * 33298755);
	}

	@OriginalMember(owner = "client!aks", name = "aq", descriptor = "(Lclient!akv;)V", line = 115)
	void method14456(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.method22403(this.anInt1776 * 955276319);
		arg0.method22417(this.anInt1777 * 599803149);
		arg0.method22417(this.anInt1778 * -1203728391);
		arg0.method22417(this.anInt1779 * 33298755);
	}

	@OriginalMember(owner = "client!aks", name = "n", descriptor = "(Lclient!akv;I)V", line = 115)
	void method14457(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.method22403(this.anInt1776 * 955276319);
		arg0.method22417(this.anInt1777 * 599803149);
		arg0.method22417(this.anInt1778 * -1203728391);
		arg0.method22417(this.anInt1779 * 33298755);
	}

	@OriginalMember(owner = "client!aks", name = "toString", descriptor = "()Ljava/lang/String;", line = 127)
	@Override
	public String toString() {
		return "Level: " + this.anInt1776 * 955276319 + " Coord: " + this.anInt1777 * 599803149 + "," + this.anInt1778 * -1203728391 + "," + this.anInt1779 * 33298755 + " Coord Split: " + (this.anInt1777 * 599803149 >> 15) + "," + (this.anInt1779 * 33298755 >> 15) + "," + (this.anInt1777 * 599803149 >> 9 & 0x3F) + "," + (this.anInt1779 * 33298755 >> 9 & 0x3F) + "," + (this.anInt1777 * 599803149 & 0x1FF) + "," + (this.anInt1779 * 33298755 & 0x1FF);
	}

	@OriginalMember(owner = "client!aks", name = "ro", descriptor = "()Ljava/lang/String;", line = 127)
	public String method14458() {
		return "Level: " + this.anInt1776 * 955276319 + " Coord: " + this.anInt1777 * 599803149 + "," + this.anInt1778 * -1203728391 + "," + this.anInt1779 * 33298755 + " Coord Split: " + (this.anInt1777 * 599803149 >> 15) + "," + (this.anInt1779 * 33298755 >> 15) + "," + (this.anInt1777 * 599803149 >> 9 & 0x3F) + "," + (this.anInt1779 * 33298755 >> 9 & 0x3F) + "," + (this.anInt1777 * 599803149 & 0x1FF) + "," + (this.anInt1779 * 33298755 & 0x1FF);
	}

	@OriginalMember(owner = "client!aks", name = "rs", descriptor = "()Ljava/lang/String;", line = 127)
	public String method14459() {
		return "Level: " + this.anInt1776 * 955276319 + " Coord: " + this.anInt1777 * 599803149 + "," + this.anInt1778 * -1203728391 + "," + this.anInt1779 * 33298755 + " Coord Split: " + (this.anInt1777 * 599803149 >> 15) + "," + (this.anInt1779 * 33298755 >> 15) + "," + (this.anInt1777 * 599803149 >> 9 & 0x3F) + "," + (this.anInt1779 * 33298755 >> 9 & 0x3F) + "," + (this.anInt1777 * 599803149 & 0x1FF) + "," + (this.anInt1779 * 33298755 & 0x1FF);
	}

	@OriginalMember(owner = "client!aks", name = "y", descriptor = "()I", line = 131)
	@Override
	public int method14428() {
		return Class527.method30682();
	}

	@OriginalMember(owner = "client!aks", name = "p", descriptor = "(I)I", line = 131)
	@Override
	public int method14427() {
		return Class527.method30682();
	}

	@OriginalMember(owner = "client!aks", name = "l", descriptor = "()I", line = 131)
	@Override
	public int method14426() {
		return Class527.method30682();
	}

	@OriginalMember(owner = "client!aks", name = "c", descriptor = "(Lclient!akv;I)V", line = 135)
	@Override
	public void method14425(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method14457(arg0);
	}

	@OriginalMember(owner = "client!aks", name = "w", descriptor = "(Lclient!akv;)V", line = 135)
	@Override
	public void method14429(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method14457(arg0);
	}

	@OriginalMember(owner = "client!aks", name = "t", descriptor = "(Lclient!akv;)V", line = 135)
	@Override
	public void method14424(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method14457(arg0);
	}

	@OriginalMember(owner = "client!aks", name = "q", descriptor = "(Lclient!akv;)V", line = 135)
	@Override
	public void method14432(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method14457(arg0);
	}

	@OriginalMember(owner = "client!aks", name = "v", descriptor = "(Lclient!akv;I)V", line = 139)
	@Override
	public void method14431(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt1776 = arg0.method22478() * 1166548959;
		this.anInt1777 = arg0.method22500() * -1224142395;
		this.anInt1778 = arg0.method22500() * -1544617399;
		this.anInt1779 = arg0.method22500() * 646265707;
	}

	@OriginalMember(owner = "client!aks", name = "x", descriptor = "(Lclient!akv;)V", line = 139)
	@Override
	public void method14430(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt1776 = arg0.method22478() * 1166548959;
		this.anInt1777 = arg0.method22500() * -1224142395;
		this.anInt1778 = arg0.method22500() * -1544617399;
		this.anInt1779 = arg0.method22500() * 646265707;
	}

	@OriginalMember(owner = "client!aks", name = "wh", descriptor = "(Lclient!yf;I)V", line = 8572)
	static final void method14460(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class634.method32664();
	}
}

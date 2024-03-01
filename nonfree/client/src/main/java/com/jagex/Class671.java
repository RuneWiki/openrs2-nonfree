package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xu")
public class Class671 {

	@OriginalMember(owner = "client!xu", name = "n", descriptor = "Lclient!dz;")
	static Class107 aClass107_1;

	@OriginalMember(owner = "client!xu", name = "m", descriptor = "Lclient!sv;")
	static Class562 aClass562_2;

	@OriginalMember(owner = "client!xu", name = "e", descriptor = "I")
	public static int anInt5859 = 1748294101;

	@OriginalMember(owner = "client!xu", name = "k", descriptor = "I")
	static int anInt5856 = 275040415;

	@OriginalMember(owner = "client!xu", name = "s", descriptor = "Lclient!yj;")
	Class684 aClass684_1;

	@OriginalMember(owner = "client!xu", name = "ah", descriptor = "F")
	float aFloat339;

	@OriginalMember(owner = "client!xu", name = "t", descriptor = "F")
	float aFloat340;

	@OriginalMember(owner = "client!xu", name = "o", descriptor = "Lclient!xv;")
	Class672 aClass672_4;

	@OriginalMember(owner = "client!xu", name = "ae", descriptor = "F")
	float aFloat341;

	@OriginalMember(owner = "client!xu", name = "ag", descriptor = "F")
	float aFloat342;

	@OriginalMember(owner = "client!xu", name = "al", descriptor = "F")
	float aFloat343;

	@OriginalMember(owner = "client!xu", name = "l", descriptor = "I")
	int anInt5857 = 0;

	@OriginalMember(owner = "client!xu", name = "u", descriptor = "I")
	int anInt5858 = -1162824399;

	@OriginalMember(owner = "client!xu", name = "z", descriptor = "J")
	long aLong304 = 0L;

	@OriginalMember(owner = "client!xu", name = "p", descriptor = "Z")
	boolean aBoolean866 = false;

	@OriginalMember(owner = "client!xu", name = "y", descriptor = "Lclient!ox;")
	final Class472 aClass472_64 = new Class472(-50.0F, -60.0F, -50.0F);

	@OriginalMember(owner = "client!xu", name = "q", descriptor = "Lclient!eb;")
	final Class240 aClass240_93 = new Class240(8);

	@OriginalMember(owner = "client!xu", name = "x", descriptor = "Lclient!eb;")
	final Class240 aClass240_94 = new Class240(8);

	@OriginalMember(owner = "client!xu", name = "b", descriptor = "Lclient!eb;")
	final Class240 aClass240_95 = new Class240(8);

	@OriginalMember(owner = "client!xu", name = "a", descriptor = "Z")
	boolean aBoolean867 = false;

	@OriginalMember(owner = "client!xu", name = "g", descriptor = "[I")
	int[] anIntArray514 = new int[] { -1, -1, -1 };

	@OriginalMember(owner = "client!xu", name = "i", descriptor = "[F")
	float[] aFloatArray120 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!xu", name = "j", descriptor = "Z")
	boolean aBoolean868 = false;

	@OriginalMember(owner = "client!xu", name = "f", descriptor = "Lclient!dh;")
	final Class104 aClass104_13;

	@OriginalMember(owner = "client!xu", name = "h", descriptor = "Lclient!py;")
	final Class497 aClass497_140;

	@OriginalMember(owner = "client!xu", name = "w", descriptor = "[[Lclient!xv;")
	final Class672[][] aClass672ArrayArray1;

	@OriginalMember(owner = "client!xu", name = "d", descriptor = "Lclient!xv;")
	final Class672 aClass672_5;

	@OriginalMember(owner = "client!xu", name = "c", descriptor = "Lclient!xv;")
	final Class672 aClass672_1;

	@OriginalMember(owner = "client!xu", name = "r", descriptor = "Lclient!xv;")
	final Class672 aClass672_2;

	@OriginalMember(owner = "client!xu", name = "v", descriptor = "Lclient!xv;")
	final Class672 aClass672_3;

	@OriginalMember(owner = "client!xu", name = "<init>", descriptor = "(Lclient!dh;Lclient!py;II)V", line = 54)
	public Class671(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass104_13 = arg0;
		this.aClass497_140 = arg1;
		this.aClass672ArrayArray1 = new Class672[arg2][arg3];
		if (anInt5859 * 933128323 != -1) {
			aClass107_1 = this.method32969(anInt5859 * 933128323);
		}
		aClass562_2 = null;
		this.aClass672_5 = new Class672();
		this.aClass672_1 = new Class672();
		this.aClass672_2 = new Class672();
		this.aClass672_3 = new Class672();
		this.method33003();
		this.method32986();
		this.method32984();
	}

	@OriginalMember(owner = "client!xu", name = "al", descriptor = "(Lclient!rl;)V", line = 70)
	public void method32962(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33033(arg0);
		if (this.aClass684_1 == null) {
			this.method32991(local4, anInt5856 * -1834375703);
		} else {
			this.aClass672_4.method33067(local4);
			this.aClass672_4.method33047(this, this.aClass684_1);
			this.method32991(this.aClass672_4, this.aClass684_1.method33359());
		}
		this.method32974();
		this.method32992();
		this.method32981();
	}

	@OriginalMember(owner = "client!xu", name = "e", descriptor = "(Lclient!rl;B)V", line = 70)
	public void method32987(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33033(arg0);
		if (this.aClass684_1 == null) {
			this.method32991(local4, anInt5856 * -1834375703);
		} else {
			this.aClass672_4.method33067(local4);
			this.aClass672_4.method33047(this, this.aClass684_1);
			this.method32991(this.aClass672_4, this.aClass684_1.method33359());
		}
		this.method32974();
		this.method32992();
		this.method32981();
	}

	@OriginalMember(owner = "client!xu", name = "ae", descriptor = "(Lclient!rl;)V", line = 70)
	public void method32988(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33033(arg0);
		if (this.aClass684_1 == null) {
			this.method32991(local4, anInt5856 * -1834375703);
		} else {
			this.aClass672_4.method33067(local4);
			this.aClass672_4.method33047(this, this.aClass684_1);
			this.method32991(this.aClass672_4, this.aClass684_1.method33359());
		}
		this.method32974();
		this.method32992();
		this.method32981();
	}

	@OriginalMember(owner = "client!xu", name = "ag", descriptor = "(Lclient!rl;)V", line = 70)
	public void method32989(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33033(arg0);
		if (this.aClass684_1 == null) {
			this.method32991(local4, anInt5856 * -1834375703);
		} else {
			this.aClass672_4.method33067(local4);
			this.aClass672_4.method33047(this, this.aClass684_1);
			this.method32991(this.aClass672_4, this.aClass684_1.method33359());
		}
		this.method32974();
		this.method32992();
		this.method32981();
	}

	@OriginalMember(owner = "client!xu", name = "ah", descriptor = "(Lclient!rl;)V", line = 70)
	public void method32990(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33033(arg0);
		if (this.aClass684_1 == null) {
			this.method32991(local4, anInt5856 * -1834375703);
		} else {
			this.aClass672_4.method33067(local4);
			this.aClass672_4.method33047(this, this.aClass684_1);
			this.method32991(this.aClass672_4, this.aClass684_1.method33359());
		}
		this.method32974();
		this.method32992();
		this.method32981();
	}

	@OriginalMember(owner = "client!xu", name = "n", descriptor = "(Lclient!rl;B)V", line = 83)
	public void method32963(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33033(arg0);
		if (this.aClass684_1 == null) {
			this.method32991(local4, anInt5856 * -1834375703);
		} else {
			this.aClass672_4.method33067(local4);
			this.aClass672_4.method33047(this, this.aClass684_1);
			this.method32991(this.aClass672_4, this.aClass684_1.method33359());
		}
		this.method32974();
		this.method33038();
		this.method33021();
		this.method32985();
	}

	@OriginalMember(owner = "client!xu", name = "ac", descriptor = "(Lclient!rl;)V", line = 83)
	public void method33007(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33033(arg0);
		if (this.aClass684_1 == null) {
			this.method32991(local4, anInt5856 * -1834375703);
		} else {
			this.aClass672_4.method33067(local4);
			this.aClass672_4.method33047(this, this.aClass684_1);
			this.method32991(this.aClass672_4, this.aClass684_1.method33359());
		}
		this.method32974();
		this.method33038();
		this.method33021();
		this.method32985();
	}

	@OriginalMember(owner = "client!xu", name = "y", descriptor = "(Lclient!yf;I)V", line = 92)
	static void method33045(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class272.method26321();
	}

	@OriginalMember(owner = "client!xu", name = "m", descriptor = "(Lclient!rl;Lclient!yj;II)V", line = 97)
	public void method32964(@OriginalArg(0) Class532 arg0, @OriginalArg(1) Class684 arg1, @OriginalArg(2) int arg2) {
		this.aClass684_1 = arg1;
		@Pc(7) Class672 local7 = this.method33033(arg0);
		if (this.aClass684_1 == null) {
			this.method32991(local7, arg2);
			this.aClass672_4 = null;
			return;
		}
		if (this.aClass672_4 == null) {
			this.aClass672_4 = new Class672();
		}
		this.aClass672_4.method33067(local7);
		this.aClass672_4.method33047(this, this.aClass684_1);
		this.method32991(this.aClass672_4, arg2);
	}

	@OriginalMember(owner = "client!xu", name = "ai", descriptor = "(Lclient!rl;Lclient!yj;I)V", line = 97)
	public void method32993(@OriginalArg(0) Class532 arg0, @OriginalArg(1) Class684 arg1, @OriginalArg(2) int arg2) {
		this.aClass684_1 = arg1;
		@Pc(7) Class672 local7 = this.method33033(arg0);
		if (this.aClass684_1 == null) {
			this.method32991(local7, arg2);
			this.aClass672_4 = null;
			return;
		}
		if (this.aClass672_4 == null) {
			this.aClass672_4 = new Class672();
		}
		this.aClass672_4.method33067(local7);
		this.aClass672_4.method33047(this, this.aClass684_1);
		this.method32991(this.aClass672_4, arg2);
	}

	@OriginalMember(owner = "client!xu", name = "aw", descriptor = "(Lclient!rl;Lclient!yj;I)V", line = 97)
	public void method32994(@OriginalArg(0) Class532 arg0, @OriginalArg(1) Class684 arg1, @OriginalArg(2) int arg2) {
		this.aClass684_1 = arg1;
		@Pc(7) Class672 local7 = this.method33033(arg0);
		if (this.aClass684_1 == null) {
			this.method32991(local7, arg2);
			this.aClass672_4 = null;
			return;
		}
		if (this.aClass672_4 == null) {
			this.aClass672_4 = new Class672();
		}
		this.aClass672_4.method33067(local7);
		this.aClass672_4.method33047(this, this.aClass684_1);
		this.method32991(this.aClass672_4, arg2);
	}

	@OriginalMember(owner = "client!xu", name = "k", descriptor = "(I)Lclient!yj;", line = 112)
	public Class684 method32965() {
		return this.aClass684_1;
	}

	@OriginalMember(owner = "client!xu", name = "as", descriptor = "()Lclient!yj;", line = 112)
	public Class684 method32995() {
		return this.aClass684_1;
	}

	@OriginalMember(owner = "client!xu", name = "at", descriptor = "()Lclient!yj;", line = 112)
	public Class684 method32996() {
		return this.aClass684_1;
	}

	@OriginalMember(owner = "client!xu", name = "ad", descriptor = "()Lclient!yj;", line = 112)
	public Class684 method32997() {
		return this.aClass684_1;
	}

	@OriginalMember(owner = "client!xu", name = "f", descriptor = "(I)Lclient!xv;", line = 116)
	public Class672 method32966() {
		return this.aClass672_1;
	}

	@OriginalMember(owner = "client!xu", name = "am", descriptor = "()Lclient!xv;", line = 116)
	public Class672 method32998() {
		return this.aClass672_1;
	}

	@OriginalMember(owner = "client!xu", name = "ar", descriptor = "()Lclient!xv;", line = 116)
	public Class672 method33014() {
		return this.aClass672_1;
	}

	@OriginalMember(owner = "client!xu", name = "au", descriptor = "()Lclient!xv;", line = 116)
	public Class672 method33035() {
		return this.aClass672_1;
	}

	@OriginalMember(owner = "client!xu", name = "w", descriptor = "(Lclient!xu;I)V", line = 120)
	public void method32976(@OriginalArg(0) Class671 arg0) {
		this.aClass672_1.method33067(arg0.aClass672_1);
		this.aClass672_2.method33067(arg0.aClass672_2);
		this.aClass672_3.method33067(arg0.aClass672_3);
		this.aLong304 = arg0.aLong304;
		this.anInt5857 = arg0.anInt5857;
		this.anInt5858 = arg0.anInt5858;
	}

	@OriginalMember(owner = "client!xu", name = "ap", descriptor = "(Lclient!xu;)V", line = 120)
	public void method33034(@OriginalArg(0) Class671 arg0) {
		this.aClass672_1.method33067(arg0.aClass672_1);
		this.aClass672_2.method33067(arg0.aClass672_2);
		this.aClass672_3.method33067(arg0.aClass672_3);
		this.aLong304 = arg0.aLong304;
		this.anInt5857 = arg0.anInt5857;
		this.anInt5858 = arg0.anInt5858;
	}

	@OriginalMember(owner = "client!xu", name = "l", descriptor = "(I)V", line = 129)
	public void method32968() {
		this.aClass240_93.method25833();
		this.aClass240_94.method25833();
		this.aClass240_95.method25833();
	}

	@OriginalMember(owner = "client!xu", name = "aq", descriptor = "()V", line = 129)
	public void method33001() {
		this.aClass240_93.method25833();
		this.aClass240_94.method25833();
		this.aClass240_95.method25833();
	}

	@OriginalMember(owner = "client!xu", name = "ax", descriptor = "()V", line = 129)
	public void method33002() {
		this.aClass240_93.method25833();
		this.aClass240_94.method25833();
		this.aClass240_95.method25833();
	}

	@OriginalMember(owner = "client!xu", name = "u", descriptor = "(II)Lclient!dz;", line = 135)
	Class107 method32969(@OriginalArg(0) int arg0) {
		@Pc(6) Class107 local6 = (Class107) this.aClass240_93.method25839((long) arg0);
		if (local6 == null) {
			local6 = this.aClass104_13.method20528(arg0);
			this.aClass240_93.method25830(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!xu", name = "av", descriptor = "(I)Lclient!dz;", line = 135)
	Class107 method32973(@OriginalArg(0) int arg0) {
		@Pc(6) Class107 local6 = (Class107) this.aClass240_93.method25839((long) arg0);
		if (local6 == null) {
			local6 = this.aClass104_13.method20528(arg0);
			this.aClass240_93.method25830(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!xu", name = "ao", descriptor = "(I)Lclient!dz;", line = 135)
	Class107 method33004(@OriginalArg(0) int arg0) {
		@Pc(6) Class107 local6 = (Class107) this.aClass240_93.method25839((long) arg0);
		if (local6 == null) {
			local6 = this.aClass104_13.method20528(arg0);
			this.aClass240_93.method25830(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!xu", name = "z", descriptor = "(IIIII)Lclient!sv;", line = 143)
	Class562 method32970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(25) long local25 = ((long) arg1 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		@Pc(31) Class562 local31 = (Class562) this.aClass240_94.method25839(local25);
		if (local31 == null) {
			local31 = Class220.method25542(arg0, arg1, arg2, arg3, Class123.aClass32_Sub11_2, Class51.aClass32_Sub9_1);
			this.aClass240_94.method25830(local31, local25);
		}
		return local31;
	}

	@OriginalMember(owner = "client!xu", name = "p", descriptor = "(IB)Lclient!cj;", line = 153)
	Class102 method32971(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = (Class102) this.aClass240_95.method25839((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(16) Class105 local16 = Class203.method24650(this.aClass497_140, arg0);
		if (local16 != null && local16.method7206() == 256 && local16.method7198() == 16) {
			@Pc(30) int[] local30 = local16.method7171(false);
			local6 = this.aClass104_13.method20536(local30);
			if (local6 != null) {
				this.aClass240_95.method25830(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!xu", name = "ay", descriptor = "(I)Lclient!cj;", line = 153)
	Class102 method33006(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = (Class102) this.aClass240_95.method25839((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(16) Class105 local16 = Class203.method24650(this.aClass497_140, arg0);
		if (local16 != null && local16.method7206() == 256 && local16.method7198() == 16) {
			@Pc(30) int[] local30 = local16.method7171(false);
			local6 = this.aClass104_13.method20536(local30);
			if (local6 != null) {
				this.aClass240_95.method25830(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!xu", name = "aj", descriptor = "(I)Lclient!cj;", line = 153)
	Class102 method33015(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = (Class102) this.aClass240_95.method25839((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(16) Class105 local16 = Class203.method24650(this.aClass497_140, arg0);
		if (local16 != null && local16.method7206() == 256 && local16.method7198() == 16) {
			@Pc(30) int[] local30 = local16.method7171(false);
			local6 = this.aClass104_13.method20536(local30);
			if (local6 != null) {
				this.aClass240_95.method25830(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!xu", name = "ab", descriptor = "(IILclient!xv;)V", line = 172)
	public void method32978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class672 arg2) {
		this.aClass672ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!xu", name = "d", descriptor = "(IILclient!xv;I)V", line = 172)
	public void method32983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class672 arg2) {
		this.aClass672ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!xu", name = "az", descriptor = "(IILclient!xv;)V", line = 172)
	public void method33008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class672 arg2) {
		this.aClass672ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!xu", name = "aa", descriptor = "(IILclient!xv;)V", line = 172)
	public void method33009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class672 arg2) {
		this.aClass672ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!xu", name = "c", descriptor = "(B)V", line = 176)
	public void method32982() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass672ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass672ArrayArray1[local1].length; local8++) {
				this.aClass672ArrayArray1[local1][local8] = this.aClass672_5;
			}
		}
	}

	@OriginalMember(owner = "client!xu", name = "af", descriptor = "()V", line = 176)
	public void method33010() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass672ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass672ArrayArray1[local1].length; local8++) {
				this.aClass672ArrayArray1[local1][local8] = this.aClass672_5;
			}
		}
	}

	@OriginalMember(owner = "client!xu", name = "ak", descriptor = "()V", line = 176)
	public void method33011() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass672ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass672ArrayArray1[local1].length; local8++) {
				this.aClass672ArrayArray1[local1][local8] = this.aClass672_5;
			}
		}
	}

	@OriginalMember(owner = "client!xu", name = "an", descriptor = "()V", line = 176)
	public void method33012() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass672ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass672ArrayArray1[local1].length; local8++) {
				this.aClass672ArrayArray1[local1][local8] = this.aClass672_5;
			}
		}
	}

	@OriginalMember(owner = "client!xu", name = "r", descriptor = "(III)V", line = 184)
	public void method32975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class672 local6 = this.aClass672ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass472_64.method29538(local6.aClass472_65);
		}
		this.method32992();
	}

	@OriginalMember(owner = "client!xu", name = "bf", descriptor = "(II)V", line = 184)
	public void method33013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class672 local6 = this.aClass672ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass472_64.method29538(local6.aClass472_65);
		}
		this.method32992();
	}

	@OriginalMember(owner = "client!xu", name = "bl", descriptor = "(II)V", line = 184)
	public void method33016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class672 local6 = this.aClass672ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass472_64.method29538(local6.aClass472_65);
		}
		this.method32992();
	}

	@OriginalMember(owner = "client!xu", name = "bk", descriptor = "(II)V", line = 184)
	public void method33041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class672 local6 = this.aClass672ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass472_64.method29538(local6.aClass472_65);
		}
		this.method32992();
	}

	@OriginalMember(owner = "client!xu", name = "bh", descriptor = "(Lclient!rl;)Lclient!xv;", line = 190)
	Class672 method33000(@OriginalArg(0) Class532 arg0) {
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method15(client.anInt3435 * -849002901) || Class56.method18034(client.anInt3435 * -849002901)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3884 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30444() >> 3 || local5 < 0 || local5 >= arg0.method30474() >> 3) {
				local3 = arg0.method30444() >> 4;
				local5 = arg0.method30474() >> 4;
			}
		}
		@Pc(83) Class672 local83 = this.aClass672ArrayArray1[local3][local5];
		if (local83 == null) {
			local83 = this.aClass672_5;
		}
		return local83;
	}

	@OriginalMember(owner = "client!xu", name = "bx", descriptor = "(Lclient!rl;)Lclient!xv;", line = 190)
	Class672 method33017(@OriginalArg(0) Class532 arg0) {
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method15(client.anInt3435 * -849002901) || Class56.method18034(client.anInt3435 * -849002901)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3884 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30444() >> 3 || local5 < 0 || local5 >= arg0.method30474() >> 3) {
				local3 = arg0.method30444() >> 4;
				local5 = arg0.method30474() >> 4;
			}
		}
		@Pc(83) Class672 local83 = this.aClass672ArrayArray1[local3][local5];
		if (local83 == null) {
			local83 = this.aClass672_5;
		}
		return local83;
	}

	@OriginalMember(owner = "client!xu", name = "bd", descriptor = "(Lclient!rl;)Lclient!xv;", line = 190)
	Class672 method33018(@OriginalArg(0) Class532 arg0) {
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method15(client.anInt3435 * -849002901) || Class56.method18034(client.anInt3435 * -849002901)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3884 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30444() >> 3 || local5 < 0 || local5 >= arg0.method30474() >> 3) {
				local3 = arg0.method30444() >> 4;
				local5 = arg0.method30474() >> 4;
			}
		}
		@Pc(83) Class672 local83 = this.aClass672ArrayArray1[local3][local5];
		if (local83 == null) {
			local83 = this.aClass672_5;
		}
		return local83;
	}

	@OriginalMember(owner = "client!xu", name = "bc", descriptor = "(Lclient!rl;)Lclient!xv;", line = 190)
	Class672 method33019(@OriginalArg(0) Class532 arg0) {
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method15(client.anInt3435 * -849002901) || Class56.method18034(client.anInt3435 * -849002901)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3884 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30444() >> 3 || local5 < 0 || local5 >= arg0.method30474() >> 3) {
				local3 = arg0.method30444() >> 4;
				local5 = arg0.method30474() >> 4;
			}
		}
		@Pc(83) Class672 local83 = this.aClass672ArrayArray1[local3][local5];
		if (local83 == null) {
			local83 = this.aClass672_5;
		}
		return local83;
	}

	@OriginalMember(owner = "client!xu", name = "bi", descriptor = "(Lclient!rl;)Lclient!xv;", line = 190)
	Class672 method33020(@OriginalArg(0) Class532 arg0) {
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method15(client.anInt3435 * -849002901) || Class56.method18034(client.anInt3435 * -849002901)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3884 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30444() >> 3 || local5 < 0 || local5 >= arg0.method30474() >> 3) {
				local3 = arg0.method30444() >> 4;
				local5 = arg0.method30474() >> 4;
			}
		}
		@Pc(83) Class672 local83 = this.aClass672ArrayArray1[local3][local5];
		if (local83 == null) {
			local83 = this.aClass672_5;
		}
		return local83;
	}

	@OriginalMember(owner = "client!xu", name = "v", descriptor = "(Lclient!rl;I)Lclient!xv;", line = 190)
	Class672 method33033(@OriginalArg(0) Class532 arg0) {
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method15(client.anInt3435 * -849002901) || Class56.method18034(client.anInt3435 * -849002901)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3884 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30444() >> 3 || local5 < 0 || local5 >= arg0.method30474() >> 3) {
				local3 = arg0.method30444() >> 4;
				local5 = arg0.method30474() >> 4;
			}
		}
		@Pc(83) Class672 local83 = this.aClass672ArrayArray1[local3][local5];
		if (local83 == null) {
			local83 = this.aClass672_5;
		}
		return local83;
	}

	@OriginalMember(owner = "client!xu", name = "o", descriptor = "(Lclient!xv;II)V", line = 213)
	void method32991(@OriginalArg(0) Class672 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean866) {
			this.aBoolean866 = false;
			arg1 = 0;
		}
		if (this.aClass672_3.method33055(arg0)) {
			return;
		}
		this.aClass672_3.method33067(arg0);
		this.aLong304 = Class305.method26796() * 3202058925841662635L;
		this.anInt5857 = (this.anInt5858 = arg1 * 1162824399) * 1573029247;
		if (this.anInt5857 * -4832943 == 0) {
			return;
		}
		this.aClass672_2.method33067(this.aClass672_1);
		if (this.aClass672_1.aClass562_3 == null) {
			return;
		}
		if (this.aClass672_1.aClass562_3.method31176()) {
			this.aClass672_1.aClass562_3 = this.aClass672_2.aClass562_3 = this.aClass672_1.aClass562_3.method31158();
		}
		if (this.aClass672_1.aClass562_3 != null && this.aClass672_3.aClass562_3 != this.aClass672_1.aClass562_3) {
			this.aClass672_1.aClass562_3.method31178(this.aClass672_3.aClass562_3);
		}
	}

	@OriginalMember(owner = "client!xu", name = "bt", descriptor = "(Lclient!xv;I)V", line = 213)
	void method33022(@OriginalArg(0) Class672 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean866) {
			this.aBoolean866 = false;
			arg1 = 0;
		}
		if (this.aClass672_3.method33055(arg0)) {
			return;
		}
		this.aClass672_3.method33067(arg0);
		this.aLong304 = Class305.method26796() * 3202058925841662635L;
		this.anInt5857 = (this.anInt5858 = arg1 * 1162824399) * 1573029247;
		if (this.anInt5857 * -4832943 == 0) {
			return;
		}
		this.aClass672_2.method33067(this.aClass672_1);
		if (this.aClass672_1.aClass562_3 == null) {
			return;
		}
		if (this.aClass672_1.aClass562_3.method31176()) {
			this.aClass672_1.aClass562_3 = this.aClass672_2.aClass562_3 = this.aClass672_1.aClass562_3.method31158();
		}
		if (this.aClass672_1.aClass562_3 != null && this.aClass672_3.aClass562_3 != this.aClass672_1.aClass562_3) {
			this.aClass672_1.aClass562_3.method31178(this.aClass672_3.aClass562_3);
		}
	}

	@OriginalMember(owner = "client!xu", name = "bn", descriptor = "(Lclient!xv;I)V", line = 213)
	void method33024(@OriginalArg(0) Class672 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean866) {
			this.aBoolean866 = false;
			arg1 = 0;
		}
		if (this.aClass672_3.method33055(arg0)) {
			return;
		}
		this.aClass672_3.method33067(arg0);
		this.aLong304 = Class305.method26796() * 3202058925841662635L;
		this.anInt5857 = (this.anInt5858 = arg1 * 1162824399) * 1573029247;
		if (this.anInt5857 * -4832943 == 0) {
			return;
		}
		this.aClass672_2.method33067(this.aClass672_1);
		if (this.aClass672_1.aClass562_3 == null) {
			return;
		}
		if (this.aClass672_1.aClass562_3.method31176()) {
			this.aClass672_1.aClass562_3 = this.aClass672_2.aClass562_3 = this.aClass672_1.aClass562_3.method31158();
		}
		if (this.aClass672_1.aClass562_3 != null && this.aClass672_3.aClass562_3 != this.aClass672_1.aClass562_3) {
			this.aClass672_1.aClass562_3.method31178(this.aClass672_3.aClass562_3);
		}
	}

	@OriginalMember(owner = "client!xu", name = "s", descriptor = "(I)V", line = 236)
	void method32974() {
		if (this.anInt5858 * 2008775727 < 0) {
			return;
		}
		@Pc(7) long local7 = Class305.method26796();
		this.anInt5858 = (int) ((long) this.anInt5858 - (local7 - this.aLong304 * 5957186404395821059L) * 1162824399L);
		if (this.anInt5858 * 2008775727 > 0) {
			this.aClass672_1.method33078(this.aClass104_13, this.aClass672_2, this.aClass672_3, (float) (this.anInt5857 * -4832943 - this.anInt5858 * 2008775727) / (float) (this.anInt5857 * -4832943));
		} else {
			this.aClass672_1.method33067(this.aClass672_3);
			if (this.aClass672_1.aClass562_3 != null) {
				this.aClass672_1.aClass562_3.method31174();
			}
			this.anInt5858 = -1162824399;
		}
		this.aLong304 = local7 * 3202058925841662635L;
	}

	@OriginalMember(owner = "client!xu", name = "bq", descriptor = "()V", line = 236)
	void method33023() {
		if (this.anInt5858 * 2008775727 < 0) {
			return;
		}
		@Pc(7) long local7 = Class305.method26796();
		this.anInt5858 = (int) ((long) this.anInt5858 - (local7 - this.aLong304 * 5957186404395821059L) * 1162824399L);
		if (this.anInt5858 * 2008775727 > 0) {
			this.aClass672_1.method33078(this.aClass104_13, this.aClass672_2, this.aClass672_3, (float) (this.anInt5857 * -4832943 - this.anInt5858 * 2008775727) / (float) (this.anInt5857 * -4832943));
		} else {
			this.aClass672_1.method33067(this.aClass672_3);
			if (this.aClass672_1.aClass562_3 != null) {
				this.aClass672_1.aClass562_3.method31174();
			}
			this.anInt5858 = -1162824399;
		}
		this.aLong304 = local7 * 3202058925841662635L;
	}

	@OriginalMember(owner = "client!xu", name = "y", descriptor = "(I)V", line = 252)
	public void method33003() {
		this.aBoolean866 = true;
	}

	@OriginalMember(owner = "client!xu", name = "bm", descriptor = "()V", line = 256)
	void method32979() {
		this.aClass104_13.method20521(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15502() * 0.1F + 0.7F + client.aClass532_1.method30448()) * this.aClass672_1.aFloat349);
		this.aClass104_13.method20522(this.aClass672_1.anInt5862 * 1540075243, this.aClass672_1.aFloat344, this.aClass672_1.aFloat346, (float) ((int) this.aClass472_64.aFloat317 << 2), (float) ((int) this.aClass472_64.aFloat318 << 2), (float) ((int) this.aClass472_64.aFloat319 << 2));
		this.aClass104_13.method20815(this.aClass672_1.aClass107_2);
	}

	@OriginalMember(owner = "client!xu", name = "q", descriptor = "(I)V", line = 256)
	void method32992() {
		this.aClass104_13.method20521(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15502() * 0.1F + 0.7F + client.aClass532_1.method30448()) * this.aClass672_1.aFloat349);
		this.aClass104_13.method20522(this.aClass672_1.anInt5862 * 1540075243, this.aClass672_1.aFloat344, this.aClass672_1.aFloat346, (float) ((int) this.aClass472_64.aFloat317 << 2), (float) ((int) this.aClass472_64.aFloat318 << 2), (float) ((int) this.aClass472_64.aFloat319 << 2));
		this.aClass104_13.method20815(this.aClass672_1.aClass107_2);
	}

	@OriginalMember(owner = "client!xu", name = "bb", descriptor = "()V", line = 256)
	void method33025() {
		this.aClass104_13.method20521(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15502() * 0.1F + 0.7F + client.aClass532_1.method30448()) * this.aClass672_1.aFloat349);
		this.aClass104_13.method20522(this.aClass672_1.anInt5862 * 1540075243, this.aClass672_1.aFloat344, this.aClass672_1.aFloat346, (float) ((int) this.aClass472_64.aFloat317 << 2), (float) ((int) this.aClass472_64.aFloat318 << 2), (float) ((int) this.aClass472_64.aFloat319 << 2));
		this.aClass104_13.method20815(this.aClass672_1.aClass107_2);
	}

	@OriginalMember(owner = "client!xu", name = "x", descriptor = "(FFFIIIIII)V", line = 262)
	public void method32980(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass104_13.method20521(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15502() * 0.1F + 0.7F + client.aClass532_1.method30448()) * arg0);
		this.aClass104_13.method20522(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass104_13.method20815(this.method32969(arg7));
	}

	@OriginalMember(owner = "client!xu", name = "be", descriptor = "(FFFIIIII)V", line = 262)
	public void method33026(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass104_13.method20521(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15502() * 0.1F + 0.7F + client.aClass532_1.method30448()) * arg0);
		this.aClass104_13.method20522(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass104_13.method20815(this.method32969(arg7));
	}

	@OriginalMember(owner = "client!xu", name = "b", descriptor = "(I)V", line = 268)
	public void method32981() {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = (this.aClass672_1.anInt5861 * -2139322713 + 256 << 2) + local1;
		this.aClass104_13.method20871(this.aClass672_1.anInt5860 * -2016142599, Class51.aClass93_Sub36_1.aClass166_Sub2_1.method15376() == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!xu", name = "by", descriptor = "()V", line = 268)
	public void method33027() {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = (this.aClass672_1.anInt5861 * -2139322713 + 256 << 2) + local1;
		this.aClass104_13.method20871(this.aClass672_1.anInt5860 * -2016142599, Class51.aClass93_Sub36_1.aClass166_Sub2_1.method15376() == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!xu", name = "bw", descriptor = "()V", line = 274)
	void method32961() {
		this.aClass104_13.method20542(this.aClass672_1.aFloat352, this.aClass672_1.aFloat345, this.aClass672_1.aFloat348);
	}

	@OriginalMember(owner = "client!xu", name = "bu", descriptor = "()V", line = 274)
	void method33028() {
		this.aClass104_13.method20542(this.aClass672_1.aFloat352, this.aClass672_1.aFloat345, this.aClass672_1.aFloat348);
	}

	@OriginalMember(owner = "client!xu", name = "bz", descriptor = "()V", line = 274)
	void method33029() {
		this.aClass104_13.method20542(this.aClass672_1.aFloat352, this.aClass672_1.aFloat345, this.aClass672_1.aFloat348);
	}

	@OriginalMember(owner = "client!xu", name = "bo", descriptor = "()V", line = 274)
	void method33030() {
		this.aClass104_13.method20542(this.aClass672_1.aFloat352, this.aClass672_1.aFloat345, this.aClass672_1.aFloat348);
	}

	@OriginalMember(owner = "client!xu", name = "h", descriptor = "(I)V", line = 274)
	void method33038() {
		this.aClass104_13.method20542(this.aClass672_1.aFloat352, this.aClass672_1.aFloat345, this.aClass672_1.aFloat348);
	}

	@OriginalMember(owner = "client!xu", name = "a", descriptor = "(I)V", line = 278)
	void method33021() {
		if (!this.aClass104_13.method20451()) {
			return;
		}
		if (this.aBoolean868) {
			this.aClass104_13.method20535(this.aFloat340, this.aFloat341, this.aFloat342, this.aFloat339, this.aFloat343);
		} else {
			this.aClass104_13.method20535(this.aClass672_1.aFloat351, this.aClass672_1.aFloat347, this.aClass672_1.aFloat353, this.aClass672_1.aFloat354, this.aClass672_1.aFloat350);
		}
	}

	@OriginalMember(owner = "client!xu", name = "br", descriptor = "()V", line = 278)
	void method33031() {
		if (!this.aClass104_13.method20451()) {
			return;
		}
		if (this.aBoolean868) {
			this.aClass104_13.method20535(this.aFloat340, this.aFloat341, this.aFloat342, this.aFloat339, this.aFloat343);
		} else {
			this.aClass104_13.method20535(this.aClass672_1.aFloat351, this.aClass672_1.aFloat347, this.aClass672_1.aFloat353, this.aClass672_1.aFloat354, this.aClass672_1.aFloat350);
		}
	}

	@OriginalMember(owner = "client!xu", name = "bv", descriptor = "()V", line = 278)
	void method33032() {
		if (!this.aClass104_13.method20451()) {
			return;
		}
		if (this.aBoolean868) {
			this.aClass104_13.method20535(this.aFloat340, this.aFloat341, this.aFloat342, this.aFloat339, this.aFloat343);
		} else {
			this.aClass104_13.method20535(this.aClass672_1.aFloat351, this.aClass672_1.aFloat347, this.aClass672_1.aFloat353, this.aClass672_1.aFloat354, this.aClass672_1.aFloat350);
		}
	}

	@OriginalMember(owner = "client!xu", name = "bg", descriptor = "()V", line = 284)
	void method32972() {
		this.aBoolean868 = false;
		this.aFloat340 = 1.0F;
		this.aFloat341 = 0.0F;
		this.aFloat342 = 1.0F;
		this.aFloat339 = 0.0F;
		this.aFloat343 = 1.0F;
	}

	@OriginalMember(owner = "client!xu", name = "g", descriptor = "(B)V", line = 284)
	void method32984() {
		this.aBoolean868 = false;
		this.aFloat340 = 1.0F;
		this.aFloat341 = 0.0F;
		this.aFloat342 = 1.0F;
		this.aFloat339 = 0.0F;
		this.aFloat343 = 1.0F;
	}

	@OriginalMember(owner = "client!xu", name = "ba", descriptor = "()V", line = 284)
	void method33005() {
		this.aBoolean868 = false;
		this.aFloat340 = 1.0F;
		this.aFloat341 = 0.0F;
		this.aFloat342 = 1.0F;
		this.aFloat339 = 0.0F;
		this.aFloat343 = 1.0F;
	}

	@OriginalMember(owner = "client!xu", name = "bp", descriptor = "()V", line = 284)
	void method33036() {
		this.aBoolean868 = false;
		this.aFloat340 = 1.0F;
		this.aFloat341 = 0.0F;
		this.aFloat342 = 1.0F;
		this.aFloat339 = 0.0F;
		this.aFloat343 = 1.0F;
	}

	@OriginalMember(owner = "client!xu", name = "bs", descriptor = "()V", line = 293)
	void method32977() {
		if (!this.aClass104_13.method20537()) {
			return;
		}
		@Pc(6) Class102 local6 = null;
		@Pc(8) Class102 local8 = null;
		@Pc(10) Class102 local10 = null;
		if (!this.aBoolean867) {
			if (this.aClass672_1.anIntArray515[0] > -1) {
				local6 = this.method32971(this.aClass672_1.anIntArray515[0]);
			}
			if (this.aClass672_1.anIntArray515[1] > -1) {
				local8 = this.method32971(this.aClass672_1.anIntArray515[1]);
			}
			if (this.aClass672_1.anIntArray515[2] > -1) {
				local10 = this.method32971(this.aClass672_1.anIntArray515[2]);
			}
			this.aClass104_13.method20538(local6, this.aClass672_1.aFloatArray121[0], local8, this.aClass672_1.aFloatArray121[1], local10, this.aClass672_1.aFloatArray121[2]);
			return;
		}
		if (this.anIntArray514[0] > -1) {
			local6 = this.method32971(this.anIntArray514[0]);
		}
		if (this.anIntArray514[1] > -1) {
			local8 = this.method32971(this.anIntArray514[1]);
		}
		if (this.anIntArray514[2] > -1) {
			local10 = this.method32971(this.anIntArray514[2]);
		}
		this.aClass104_13.method20538(local6, this.aFloatArray120[0], local8, this.aFloatArray120[1], local10, this.aFloatArray120[2]);
	}

	@OriginalMember(owner = "client!xu", name = "i", descriptor = "(B)V", line = 293)
	void method32985() {
		if (!this.aClass104_13.method20537()) {
			return;
		}
		@Pc(6) Class102 local6 = null;
		@Pc(8) Class102 local8 = null;
		@Pc(10) Class102 local10 = null;
		if (!this.aBoolean867) {
			if (this.aClass672_1.anIntArray515[0] > -1) {
				local6 = this.method32971(this.aClass672_1.anIntArray515[0]);
			}
			if (this.aClass672_1.anIntArray515[1] > -1) {
				local8 = this.method32971(this.aClass672_1.anIntArray515[1]);
			}
			if (this.aClass672_1.anIntArray515[2] > -1) {
				local10 = this.method32971(this.aClass672_1.anIntArray515[2]);
			}
			this.aClass104_13.method20538(local6, this.aClass672_1.aFloatArray121[0], local8, this.aClass672_1.aFloatArray121[1], local10, this.aClass672_1.aFloatArray121[2]);
			return;
		}
		if (this.anIntArray514[0] > -1) {
			local6 = this.method32971(this.anIntArray514[0]);
		}
		if (this.anIntArray514[1] > -1) {
			local8 = this.method32971(this.anIntArray514[1]);
		}
		if (this.anIntArray514[2] > -1) {
			local10 = this.method32971(this.anIntArray514[2]);
		}
		this.aClass104_13.method20538(local6, this.aFloatArray120[0], local8, this.aFloatArray120[1], local10, this.aFloatArray120[2]);
	}

	@OriginalMember(owner = "client!xu", name = "bj", descriptor = "()V", line = 293)
	void method33037() {
		if (!this.aClass104_13.method20537()) {
			return;
		}
		@Pc(6) Class102 local6 = null;
		@Pc(8) Class102 local8 = null;
		@Pc(10) Class102 local10 = null;
		if (!this.aBoolean867) {
			if (this.aClass672_1.anIntArray515[0] > -1) {
				local6 = this.method32971(this.aClass672_1.anIntArray515[0]);
			}
			if (this.aClass672_1.anIntArray515[1] > -1) {
				local8 = this.method32971(this.aClass672_1.anIntArray515[1]);
			}
			if (this.aClass672_1.anIntArray515[2] > -1) {
				local10 = this.method32971(this.aClass672_1.anIntArray515[2]);
			}
			this.aClass104_13.method20538(local6, this.aClass672_1.aFloatArray121[0], local8, this.aClass672_1.aFloatArray121[1], local10, this.aClass672_1.aFloatArray121[2]);
			return;
		}
		if (this.anIntArray514[0] > -1) {
			local6 = this.method32971(this.anIntArray514[0]);
		}
		if (this.anIntArray514[1] > -1) {
			local8 = this.method32971(this.anIntArray514[1]);
		}
		if (this.anIntArray514[2] > -1) {
			local10 = this.method32971(this.anIntArray514[2]);
		}
		this.aClass104_13.method20538(local6, this.aFloatArray120[0], local8, this.aFloatArray120[1], local10, this.aFloatArray120[2]);
	}

	@OriginalMember(owner = "client!xu", name = "j", descriptor = "(I)V", line = 312)
	void method32986() {
		this.aBoolean867 = false;
		@Pc(5) int[] local5 = this.anIntArray514;
		@Pc(8) int[] local8 = this.anIntArray514;
		this.anIntArray514[2] = -1;
		local8[1] = -1;
		local5[0] = -1;
		@Pc(24) float[] local24 = this.aFloatArray120;
		@Pc(27) float[] local27 = this.aFloatArray120;
		this.aFloatArray120[2] = 0.0F;
		local27[1] = 0.0F;
		local24[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xu", name = "cl", descriptor = "()V", line = 312)
	void method33039() {
		this.aBoolean867 = false;
		@Pc(5) int[] local5 = this.anIntArray514;
		@Pc(8) int[] local8 = this.anIntArray514;
		this.anIntArray514[2] = -1;
		local8[1] = -1;
		local5[0] = -1;
		@Pc(24) float[] local24 = this.aFloatArray120;
		@Pc(27) float[] local27 = this.aFloatArray120;
		this.aFloatArray120[2] = 0.0F;
		local27[1] = 0.0F;
		local24[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xu", name = "cg", descriptor = "()V", line = 312)
	void method33040() {
		this.aBoolean867 = false;
		@Pc(5) int[] local5 = this.anIntArray514;
		@Pc(8) int[] local8 = this.anIntArray514;
		this.anIntArray514[2] = -1;
		local8[1] = -1;
		local5[0] = -1;
		@Pc(24) float[] local24 = this.aFloatArray120;
		@Pc(27) float[] local27 = this.aFloatArray120;
		this.aFloatArray120[2] = 0.0F;
		local27[1] = 0.0F;
		local24[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xu", name = "t", descriptor = "(I)V", line = 326)
	public void method32967() {
		this.aClass104_13.method20521(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15502() * 0.1F + 0.7F + client.aClass532_1.method30448()) * 1.1523438F);
		this.aClass104_13.method20522(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass104_13.method20871(13156520, -1, 0);
		this.aClass104_13.method20815(aClass107_1);
	}

	@OriginalMember(owner = "client!xu", name = "ce", descriptor = "()V", line = 326)
	public void method32999() {
		this.aClass104_13.method20521(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15502() * 0.1F + 0.7F + client.aClass532_1.method30448()) * 1.1523438F);
		this.aClass104_13.method20522(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass104_13.method20871(13156520, -1, 0);
		this.aClass104_13.method20815(aClass107_1);
	}

	@OriginalMember(owner = "client!xu", name = "cu", descriptor = "()V", line = 326)
	public void method33042() {
		this.aClass104_13.method20521(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15502() * 0.1F + 0.7F + client.aClass532_1.method30448()) * 1.1523438F);
		this.aClass104_13.method20522(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass104_13.method20871(13156520, -1, 0);
		this.aClass104_13.method20815(aClass107_1);
	}

	@OriginalMember(owner = "client!xu", name = "nl", descriptor = "(Lclient!yf;I)V", line = 7412)
	static final void method33043(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class379.method28105(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!xu", name = "adf", descriptor = "(Lclient!yf;I)V", line = 10152)
	static final void method33044(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass531ArrayArray1[local23][local13].anInt5235 * 108162093;
	}
}

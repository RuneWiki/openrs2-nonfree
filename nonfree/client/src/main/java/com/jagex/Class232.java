package com.jagex;

import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class232 {

	@OriginalMember(owner = "client!er", name = "c", descriptor = "I")
	int anInt3763;

	@OriginalMember(owner = "client!er", name = "v", descriptor = "Lclient!aak;")
	Class12 aClass12_25;

	@OriginalMember(owner = "client!er", name = "l", descriptor = "Lclient!zi;")
	Class691 aClass691_13;

	@OriginalMember(owner = "client!er", name = "p", descriptor = "I")
	int anInt3764;

	@OriginalMember(owner = "client!er", name = "y", descriptor = "Lclient!ef;")
	Interface23 anInterface23_1;

	@OriginalMember(owner = "client!er", name = "p", descriptor = "(B)[Lclient!hw;", line = 14)
	static Class311[] method25832() {
		return new Class311[] { Class311.aClass311_3, Class311.aClass311_4, Class311.aClass311_2 };
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(I)V", line = 15)
	public Class232(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!er", name = "p", descriptor = "(Lclient!ef;B)V", line = 19)
	public void method25833(@OriginalArg(0) Interface23 arg0) {
		this.anInterface23_1 = arg0;
	}

	@OriginalMember(owner = "client!er", name = "j", descriptor = "(Lclient!ef;)V", line = 19)
	public void method25834(@OriginalArg(0) Interface23 arg0) {
		this.anInterface23_1 = arg0;
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(II)V", line = 22)
	public Class232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass691_13 = new Class691();
		this.anInt3764 = arg0 * 226016051;
		this.anInt3763 = arg0 * 1390883121;
		@Pc(18) int local18;
		for (local18 = 1; local18 + local18 < arg0 && local18 < arg1; local18 += local18) {
		}
		this.aClass12_25 = new Class12(local18);
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(J)Ljava/lang/Object;", line = 31)
	public Object method25835(@OriginalArg(0) long arg0) {
		@Pc(5) Class77_Sub1_Sub10 local5 = (Class77_Sub1_Sub10) this.aClass12_25.method173(arg0);
		if (local5 == null) {
			return null;
		}
		@Pc(13) Object local13 = local5.method23608();
		if (local13 == null) {
			local5.method24063();
			local5.method24069();
			this.anInt3763 += local5.anInt3181 * -1132131515;
			return null;
		}
		if (local5.method23609()) {
			@Pc(46) Class77_Sub1_Sub10_Sub1 local46 = new Class77_Sub1_Sub10_Sub1(local13, local5.anInt3181 * -367028651);
			this.aClass12_25.method184(local46, local5.aLong229 * 8258869577519436579L);
			this.aClass691_13.method36326(local46);
			local46.aLong230 = 0L;
			local5.method24063();
			local5.method24069();
		} else {
			this.aClass691_13.method36326(local5);
			local5.aLong230 = 0L;
		}
		return local13;
	}

	@OriginalMember(owner = "client!er", name = "i", descriptor = "(J)Ljava/lang/Object;", line = 31)
	public Object method25836(@OriginalArg(0) long arg0) {
		@Pc(5) Class77_Sub1_Sub10 local5 = (Class77_Sub1_Sub10) this.aClass12_25.method173(arg0);
		if (local5 == null) {
			return null;
		}
		@Pc(13) Object local13 = local5.method23608();
		if (local13 == null) {
			local5.method24063();
			local5.method24069();
			this.anInt3763 += local5.anInt3181 * -1132131515;
			return null;
		}
		if (local5.method23609()) {
			@Pc(46) Class77_Sub1_Sub10_Sub1 local46 = new Class77_Sub1_Sub10_Sub1(local13, local5.anInt3181 * -367028651);
			this.aClass12_25.method184(local46, local5.aLong229 * 8258869577519436579L);
			this.aClass691_13.method36326(local46);
			local46.aLong230 = 0L;
			local5.method24063();
			local5.method24069();
		} else {
			this.aClass691_13.method36326(local5);
			local5.aLong230 = 0L;
		}
		return local13;
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(JIZI)Ljava/lang/String;", line = 40)
	public static String method25837(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class397.method28437(arg0);
			local5 = Class61.aCalendar1;
		} else {
			Class694.method36377(arg0);
			local5 = Class61.aCalendar2;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(18) int local18 = local5.get(2);
		@Pc(22) int local22 = local5.get(1);
		@Pc(26) int local26 = local5.get(11);
		@Pc(30) int local30 = local5.get(12);
		return arg1 == 3 ? Class466.method29558(arg0, arg1, arg2) : Integer.toString(local14 / 10) + local14 % 10 + "-" + Class61.aStringArrayArray1[arg1][local18] + "-" + local22 + " " + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
	}

	@OriginalMember(owner = "client!er", name = "v", descriptor = "(J)V", line = 56)
	public void method25838(@OriginalArg(0) long arg0) {
		@Pc(5) Class77_Sub1_Sub10 local5 = (Class77_Sub1_Sub10) this.aClass12_25.method173(arg0);
		this.method25839(local5);
	}

	@OriginalMember(owner = "client!er", name = "l", descriptor = "(Lclient!ard;I)V", line = 61)
	void method25839(@OriginalArg(0) Class77_Sub1_Sub10 arg0) {
		if (arg0 != null) {
			arg0.method24063();
			arg0.method24069();
			this.anInt3763 += arg0.anInt3181 * -1132131515;
		}
	}

	@OriginalMember(owner = "client!er", name = "k", descriptor = "(Lclient!ard;)V", line = 61)
	void method25840(@OriginalArg(0) Class77_Sub1_Sub10 arg0) {
		if (arg0 != null) {
			arg0.method24063();
			arg0.method24069();
			this.anInt3763 += arg0.anInt3181 * -1132131515;
		}
	}

	@OriginalMember(owner = "client!er", name = "u", descriptor = "(Lclient!ard;)V", line = 61)
	void method25841(@OriginalArg(0) Class77_Sub1_Sub10 arg0) {
		if (arg0 != null) {
			arg0.method24063();
			arg0.method24069();
			this.anInt3763 += arg0.anInt3181 * -1132131515;
		}
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(Lclient!ard;)V", line = 61)
	void method25842(@OriginalArg(0) Class77_Sub1_Sub10 arg0) {
		if (arg0 != null) {
			arg0.method24063();
			arg0.method24069();
			this.anInt3763 += arg0.anInt3181 * -1132131515;
		}
	}

	@OriginalMember(owner = "client!er", name = "f", descriptor = "(Ljava/lang/Object;J)V", line = 69)
	public void method25843(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method25845(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!er", name = "y", descriptor = "(Ljava/lang/Object;J)V", line = 69)
	public void method25844(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method25845(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!er", name = "w", descriptor = "(Ljava/lang/Object;JII)V", line = 73)
	public void method25845(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt3764 * 1475721211) {
			throw new IllegalStateException();
		}
		this.method25838(arg1);
		this.anInt3763 -= arg2 * 1390883121;
		while (this.anInt3763 * -1219459119 < 0) {
			@Pc(31) Class77_Sub1_Sub10 local31 = (Class77_Sub1_Sub10) this.aClass691_13.method36331();
			if (local31 == null) {
				throw new RuntimeException("");
			}
			if (!local31.method23609()) {
			}
			this.method25839(local31);
			if (this.anInterface23_1 != null) {
				this.anInterface23_1.method25707(local31.method23608());
			}
		}
		@Pc(64) Class77_Sub1_Sub10_Sub1 local64 = new Class77_Sub1_Sub10_Sub1(arg0, arg2);
		this.aClass12_25.method184(local64, arg1);
		this.aClass691_13.method36326(local64);
		local64.aLong230 = 0L;
	}

	@OriginalMember(owner = "client!er", name = "o", descriptor = "(Ljava/lang/Object;JI)V", line = 73)
	public void method25846(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt3764 * 1475721211) {
			throw new IllegalStateException();
		}
		this.method25838(arg1);
		this.anInt3763 -= arg2 * 1390883121;
		while (this.anInt3763 * -1219459119 < 0) {
			@Pc(31) Class77_Sub1_Sub10 local31 = (Class77_Sub1_Sub10) this.aClass691_13.method36331();
			if (local31 == null) {
				throw new RuntimeException("");
			}
			if (!local31.method23609()) {
			}
			this.method25839(local31);
			if (this.anInterface23_1 != null) {
				this.anInterface23_1.method25707(local31.method23608());
			}
		}
		@Pc(64) Class77_Sub1_Sub10_Sub1 local64 = new Class77_Sub1_Sub10_Sub1(arg0, arg2);
		this.aClass12_25.method184(local64, arg1);
		this.aClass691_13.method36326(local64);
		local64.aLong230 = 0L;
	}

	@OriginalMember(owner = "client!er", name = "t", descriptor = "(IB)V", line = 94)
	public void method25847(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class77_Sub1_Sub10 local5 = (Class77_Sub1_Sub10) this.aClass691_13.method36335(); local5 != null; local5 = (Class77_Sub1_Sub10) this.aClass691_13.method36340()) {
			if (local5.method23609()) {
				if (local5.method23608() == null) {
					local5.method24063();
					local5.method24069();
					this.anInt3763 += local5.anInt3181 * -1132131515;
				}
			} else if ((local5.aLong230 += 84410810002887935L) * -753566336061658369L > (long) arg0) {
				@Pc(55) Class77_Sub1_Sub10_Sub2 local55 = new Class77_Sub1_Sub10_Sub2(local5.method23608(), local5.anInt3181 * -367028651);
				this.aClass12_25.method184(local55, local5.aLong229 * 8258869577519436579L);
				Class434.method28870(local55, local5);
				local5.method24063();
				local5.method24069();
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V", line = 94)
	public void method25848(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class77_Sub1_Sub10 local5 = (Class77_Sub1_Sub10) this.aClass691_13.method36335(); local5 != null; local5 = (Class77_Sub1_Sub10) this.aClass691_13.method36340()) {
			if (local5.method23609()) {
				if (local5.method23608() == null) {
					local5.method24063();
					local5.method24069();
					this.anInt3763 += local5.anInt3181 * -1132131515;
				}
			} else if ((local5.aLong230 += 84410810002887935L) * -753566336061658369L > (long) arg0) {
				@Pc(55) Class77_Sub1_Sub10_Sub2 local55 = new Class77_Sub1_Sub10_Sub2(local5.method23608(), local5.anInt3181 * -367028651);
				this.aClass12_25.method184(local55, local5.aLong229 * 8258869577519436579L);
				Class434.method28870(local55, local5);
				local5.method24063();
				local5.method24069();
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "n", descriptor = "(I)V", line = 94)
	public void method25849(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class77_Sub1_Sub10 local5 = (Class77_Sub1_Sub10) this.aClass691_13.method36335(); local5 != null; local5 = (Class77_Sub1_Sub10) this.aClass691_13.method36340()) {
			if (local5.method23609()) {
				if (local5.method23608() == null) {
					local5.method24063();
					local5.method24069();
					this.anInt3763 += local5.anInt3181 * -1132131515;
				}
			} else if ((local5.aLong230 += 84410810002887935L) * -753566336061658369L > (long) arg0) {
				@Pc(55) Class77_Sub1_Sub10_Sub2 local55 = new Class77_Sub1_Sub10_Sub2(local5.method23608(), local5.anInt3181 * -367028651);
				this.aClass12_25.method184(local55, local5.aLong229 * 8258869577519436579L);
				Class434.method28870(local55, local5);
				local5.method24063();
				local5.method24069();
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "q", descriptor = "(I)V", line = 116)
	public void method25850() {
		this.aClass691_13.method36321();
		this.aClass12_25.method188();
		this.anInt3763 = this.anInt3764 * 1203520011;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "()I", line = 122)
	public int method25851() {
		return this.anInt3764 * 1475721211;
	}

	@OriginalMember(owner = "client!er", name = "x", descriptor = "(I)I", line = 122)
	public int method25852() {
		return this.anInt3764 * 1475721211;
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(I)I", line = 126)
	public int method25853() {
		return this.anInt3763 * -1219459119;
	}

	@OriginalMember(owner = "client!er", name = "m", descriptor = "()I", line = 130)
	public int method25854() {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class77_Sub1_Sub10 local7 = (Class77_Sub1_Sub10) this.aClass691_13.method36335(); local7 != null; local7 = (Class77_Sub1_Sub10) this.aClass691_13.method36340()) {
			if (!local7.method23609()) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!er", name = "s", descriptor = "(I)I", line = 130)
	public int method25855() {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class77_Sub1_Sub10 local7 = (Class77_Sub1_Sub10) this.aClass691_13.method36335(); local7 != null; local7 = (Class77_Sub1_Sub10) this.aClass691_13.method36340()) {
			if (!local7.method23609()) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!er", name = "aj", descriptor = "()V", line = 138)
	public void method25856() {
		for (@Pc(5) Class77_Sub1_Sub10 local5 = (Class77_Sub1_Sub10) this.aClass691_13.method36335(); local5 != null; local5 = (Class77_Sub1_Sub10) this.aClass691_13.method36340()) {
			if (local5.method23609()) {
				local5.method24063();
				local5.method24069();
				this.anInt3763 += local5.anInt3181 * -1132131515;
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "r", descriptor = "(B)V", line = 138)
	public void method25857() {
		for (@Pc(5) Class77_Sub1_Sub10 local5 = (Class77_Sub1_Sub10) this.aClass691_13.method36335(); local5 != null; local5 = (Class77_Sub1_Sub10) this.aClass691_13.method36340()) {
			if (local5.method23609()) {
				local5.method24063();
				local5.method24069();
				this.anInt3763 += local5.anInt3181 * -1132131515;
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "h", descriptor = "()V", line = 138)
	public void method25858() {
		for (@Pc(5) Class77_Sub1_Sub10 local5 = (Class77_Sub1_Sub10) this.aClass691_13.method36335(); local5 != null; local5 = (Class77_Sub1_Sub10) this.aClass691_13.method36340()) {
			if (local5.method23609()) {
				local5.method24063();
				local5.method24069();
				this.anInt3763 += local5.anInt3181 * -1132131515;
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "ai", descriptor = "()V", line = 138)
	public void method25859() {
		for (@Pc(5) Class77_Sub1_Sub10 local5 = (Class77_Sub1_Sub10) this.aClass691_13.method36335(); local5 != null; local5 = (Class77_Sub1_Sub10) this.aClass691_13.method36340()) {
			if (local5.method23609()) {
				local5.method24063();
				local5.method24069();
				this.anInt3763 += local5.anInt3181 * -1132131515;
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "ag", descriptor = "()V", line = 138)
	public void method25860() {
		for (@Pc(5) Class77_Sub1_Sub10 local5 = (Class77_Sub1_Sub10) this.aClass691_13.method36335(); local5 != null; local5 = (Class77_Sub1_Sub10) this.aClass691_13.method36340()) {
			if (local5.method23609()) {
				local5.method24063();
				local5.method24069();
				this.anInt3763 += local5.anInt3181 * -1132131515;
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 148)
	public Object method25861() {
		@Pc(5) Class77_Sub1_Sub10 local5 = (Class77_Sub1_Sub10) this.aClass12_25.method190();
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23608();
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class77_Sub1_Sub10 local16 = local5;
			local5 = (Class77_Sub1_Sub10) this.aClass12_25.method192();
			local16.method24063();
			local16.method24069();
			this.anInt3763 += local16.anInt3181 * -1132131515;
		}
		return null;
	}

	@OriginalMember(owner = "client!er", name = "al", descriptor = "()Ljava/lang/Object;", line = 148)
	public Object method25862() {
		@Pc(5) Class77_Sub1_Sub10 local5 = (Class77_Sub1_Sub10) this.aClass12_25.method190();
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23608();
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class77_Sub1_Sub10 local16 = local5;
			local5 = (Class77_Sub1_Sub10) this.aClass12_25.method192();
			local16.method24063();
			local16.method24069();
			this.anInt3763 += local16.anInt3181 * -1132131515;
		}
		return null;
	}

	@OriginalMember(owner = "client!er", name = "z", descriptor = "(B)Ljava/lang/Object;", line = 164)
	public Object method25863() {
		@Pc(5) Class77_Sub1_Sub10 local5 = (Class77_Sub1_Sub10) this.aClass12_25.method192();
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23608();
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class77_Sub1_Sub10 local17 = local5;
			local5 = (Class77_Sub1_Sub10) this.aClass12_25.method192();
			local17.method24063();
			local17.method24069();
			this.anInt3763 += local17.anInt3181 * -1132131515;
		}
		return null;
	}

	@OriginalMember(owner = "client!er", name = "ao", descriptor = "()Ljava/lang/Object;", line = 164)
	public Object method25864() {
		@Pc(5) Class77_Sub1_Sub10 local5 = (Class77_Sub1_Sub10) this.aClass12_25.method192();
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23608();
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class77_Sub1_Sub10 local17 = local5;
			local5 = (Class77_Sub1_Sub10) this.aClass12_25.method192();
			local17.method24063();
			local17.method24069();
			this.anInt3763 += local17.anInt3181 * -1132131515;
		}
		return null;
	}

	@OriginalMember(owner = "client!er", name = "ak", descriptor = "()Ljava/lang/Object;", line = 164)
	public Object method25865() {
		@Pc(5) Class77_Sub1_Sub10 local5 = (Class77_Sub1_Sub10) this.aClass12_25.method192();
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23608();
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class77_Sub1_Sub10 local17 = local5;
			local5 = (Class77_Sub1_Sub10) this.aClass12_25.method192();
			local17.method24063();
			local17.method24069();
			this.anInt3763 += local17.anInt3181 * -1132131515;
		}
		return null;
	}

	@OriginalMember(owner = "client!er", name = "dx", descriptor = "(Lclient!yf;B)V", line = 5169)
	static final void method25866(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class233.method25870(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!er", name = "apf", descriptor = "(Lclient!yf;I)V", line = 12180)
	static final void method25867(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (local12 == -1) {
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2, Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_1.method15438());
		} else {
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2, local12);
		}
		Class127_Sub5.method13161();
	}

	@OriginalMember(owner = "client!er", name = "avl", descriptor = "(Lclient!yf;B)V", line = 13192)
	static final void method25868(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub26_1.method15874() ? 1 : 0;
	}
}

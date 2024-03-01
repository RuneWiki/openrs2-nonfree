package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class240 {

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!en;")
	Interface22 anInterface22_1;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!aap;")
	Class18 aClass18_13;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
	int anInt3827;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	int anInt3826;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Lclient!aan;")
	Class16 aClass16_23;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V", line = 15)
	public Class240(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "(Lclient!en;)V", line = 19)
	public void method25838(@OriginalArg(0) Interface22 arg0) {
		this.anInterface22_1 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "(Lclient!en;)V", line = 19)
	public void method25841(@OriginalArg(0) Interface22 arg0) {
		this.anInterface22_1 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(Lclient!en;B)V", line = 19)
	public void method25852(@OriginalArg(0) Interface22 arg0) {
		this.anInterface22_1 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(II)V", line = 22)
	public Class240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass18_13 = new Class18();
		this.anInt3827 = arg0 * -2043568369;
		this.anInt3826 = arg0 * -1787761409;
		@Pc(18) int local18;
		for (local18 = 1; local18 + local18 < arg0 && local18 < arg1; local18 += local18) {
		}
		this.aClass16_23 = new Class16(local18);
	}

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "(J)Ljava/lang/Object;", line = 31)
	public Object method25839(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method215(arg0);
		if (local5 == null) {
			return null;
		}
		@Pc(14) Object local14 = local5.method23543();
		if (local14 == null) {
			local5.method23969();
			local5.method23976();
			this.anInt3826 += local5.anInt3214 * 703212397;
			return null;
		}
		if (local5.method23544()) {
			@Pc(46) Class93_Sub1_Sub12_Sub1 local46 = new Class93_Sub1_Sub12_Sub1(local14, local5.anInt3214 * 461171603);
			this.aClass16_23.method221(local46, local5.aLong232 * -3750704643647536275L);
			this.aClass18_13.method268(local46);
			local46.aLong233 = 0L;
			local5.method23969();
			local5.method23976();
		} else {
			this.aClass18_13.method268(local5);
			local5.aLong233 = 0L;
		}
		return local14;
	}

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "(J)Ljava/lang/Object;", line = 31)
	public Object method25842(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method215(arg0);
		if (local5 == null) {
			return null;
		}
		@Pc(14) Object local14 = local5.method23543();
		if (local14 == null) {
			local5.method23969();
			local5.method23976();
			this.anInt3826 += local5.anInt3214 * 703212397;
			return null;
		}
		if (local5.method23544()) {
			@Pc(46) Class93_Sub1_Sub12_Sub1 local46 = new Class93_Sub1_Sub12_Sub1(local14, local5.anInt3214 * 461171603);
			this.aClass16_23.method221(local46, local5.aLong232 * -3750704643647536275L);
			this.aClass18_13.method268(local46);
			local46.aLong233 = 0L;
			local5.method23969();
			local5.method23976();
		} else {
			this.aClass18_13.method268(local5);
			local5.aLong233 = 0L;
		}
		return local14;
	}

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "(J)V", line = 56)
	public void method25828(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method215(arg0);
		this.method25827(local5);
	}

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "(J)V", line = 56)
	public void method25843(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method215(arg0);
		this.method25827(local5);
	}

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "(J)V", line = 56)
	public void method25866(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method215(arg0);
		this.method25827(local5);
	}

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "(Lclient!asa;I)V", line = 61)
	void method25827(@OriginalArg(0) Class93_Sub1_Sub12 arg0) {
		if (arg0 != null) {
			arg0.method23969();
			arg0.method23976();
			this.anInt3826 += arg0.anInt3214 * 703212397;
		}
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(Lclient!asa;)V", line = 61)
	void method25829(@OriginalArg(0) Class93_Sub1_Sub12 arg0) {
		if (arg0 != null) {
			arg0.method23969();
			arg0.method23976();
			this.anInt3826 += arg0.anInt3214 * 703212397;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!asa;)V", line = 61)
	void method25840(@OriginalArg(0) Class93_Sub1_Sub12 arg0) {
		if (arg0 != null) {
			arg0.method23969();
			arg0.method23976();
			this.anInt3826 += arg0.anInt3214 * 703212397;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Lclient!asa;)V", line = 61)
	void method25845(@OriginalArg(0) Class93_Sub1_Sub12 arg0) {
		if (arg0 != null) {
			arg0.method23969();
			arg0.method23976();
			this.anInt3826 += arg0.anInt3214 * 703212397;
		}
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(Ljava/lang/Object;J)V", line = 69)
	public void method25830(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method25831(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(Ljava/lang/Object;J)V", line = 69)
	public void method25848(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method25831(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "(Ljava/lang/Object;JII)V", line = 73)
	public void method25831(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt3827 * -1057263633) {
			throw new IllegalStateException();
		}
		this.method25866(arg1);
		this.anInt3826 -= arg2 * -1787761409;
		while (this.anInt3826 * -98168065 < 0) {
			@Pc(31) Class93_Sub1_Sub12 local31 = (Class93_Sub1_Sub12) this.aClass18_13.method244();
			if (local31 == null) {
				throw new RuntimeException("");
			}
			if (!local31.method23544()) {
			}
			this.method25827(local31);
			if (this.anInterface22_1 != null) {
				this.anInterface22_1.method26331(local31.method23543());
			}
		}
		@Pc(64) Class93_Sub1_Sub12_Sub1 local64 = new Class93_Sub1_Sub12_Sub1(arg0, arg2);
		this.aClass16_23.method221(local64, arg1);
		this.aClass18_13.method268(local64);
		local64.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "(Ljava/lang/Object;JI)V", line = 73)
	public void method25849(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt3827 * -1057263633) {
			throw new IllegalStateException();
		}
		this.method25866(arg1);
		this.anInt3826 -= arg2 * -1787761409;
		while (this.anInt3826 * -98168065 < 0) {
			@Pc(31) Class93_Sub1_Sub12 local31 = (Class93_Sub1_Sub12) this.aClass18_13.method244();
			if (local31 == null) {
				throw new RuntimeException("");
			}
			if (!local31.method23544()) {
			}
			this.method25827(local31);
			if (this.anInterface22_1 != null) {
				this.anInterface22_1.method26331(local31.method23543());
			}
		}
		@Pc(64) Class93_Sub1_Sub12_Sub1 local64 = new Class93_Sub1_Sub12_Sub1(arg0, arg2);
		this.aClass16_23.method221(local64, arg1);
		this.aClass18_13.method268(local64);
		local64.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "(Ljava/lang/Object;JI)V", line = 73)
	public void method25850(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt3827 * -1057263633) {
			throw new IllegalStateException();
		}
		this.method25866(arg1);
		this.anInt3826 -= arg2 * -1787761409;
		while (this.anInt3826 * -98168065 < 0) {
			@Pc(31) Class93_Sub1_Sub12 local31 = (Class93_Sub1_Sub12) this.aClass18_13.method244();
			if (local31 == null) {
				throw new RuntimeException("");
			}
			if (!local31.method23544()) {
			}
			this.method25827(local31);
			if (this.anInterface22_1 != null) {
				this.anInterface22_1.method26331(local31.method23543());
			}
		}
		@Pc(64) Class93_Sub1_Sub12_Sub1 local64 = new Class93_Sub1_Sub12_Sub1(arg0, arg2);
		this.aClass16_23.method221(local64, arg1);
		this.aClass18_13.method268(local64);
		local64.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "(IB)V", line = 94)
	public void method25832(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method246(); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method253()) {
			if (local5.method23544()) {
				if (local5.method23543() == null) {
					local5.method23969();
					local5.method23976();
					this.anInt3826 += local5.anInt3214 * 703212397;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(55) Class93_Sub1_Sub12_Sub2 local55 = new Class93_Sub1_Sub12_Sub2(local5.method23543(), local5.anInt3214 * 461171603);
				this.aClass16_23.method221(local55, local5.aLong232 * -3750704643647536275L);
				Class658.method32790(local55, local5);
				local5.method23969();
				local5.method23976();
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "ag", descriptor = "(I)V", line = 94)
	public void method25853(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method246(); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method253()) {
			if (local5.method23544()) {
				if (local5.method23543() == null) {
					local5.method23969();
					local5.method23976();
					this.anInt3826 += local5.anInt3214 * 703212397;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(55) Class93_Sub1_Sub12_Sub2 local55 = new Class93_Sub1_Sub12_Sub2(local5.method23543(), local5.anInt3214 * 461171603);
				this.aClass16_23.method221(local55, local5.aLong232 * -3750704643647536275L);
				Class658.method32790(local55, local5);
				local5.method23969();
				local5.method23976();
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "(I)V", line = 94)
	public void method25857(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method246(); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method253()) {
			if (local5.method23544()) {
				if (local5.method23543() == null) {
					local5.method23969();
					local5.method23976();
					this.anInt3826 += local5.anInt3214 * 703212397;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(55) Class93_Sub1_Sub12_Sub2 local55 = new Class93_Sub1_Sub12_Sub2(local5.method23543(), local5.anInt3214 * 461171603);
				this.aClass16_23.method221(local55, local5.aLong232 * -3750704643647536275L);
				Class658.method32790(local55, local5);
				local5.method23969();
				local5.method23976();
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "ae", descriptor = "(I)V", line = 94)
	public void method25867(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method246(); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method253()) {
			if (local5.method23544()) {
				if (local5.method23543() == null) {
					local5.method23969();
					local5.method23976();
					this.anInt3826 += local5.anInt3214 * 703212397;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(55) Class93_Sub1_Sub12_Sub2 local55 = new Class93_Sub1_Sub12_Sub2(local5.method23543(), local5.anInt3214 * 461171603);
				this.aClass16_23.method221(local55, local5.aLong232 * -3750704643647536275L);
				Class658.method32790(local55, local5);
				local5.method23969();
				local5.method23976();
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "(B)V", line = 116)
	public void method25833() {
		this.aClass18_13.method245();
		this.aClass16_23.method219();
		this.anInt3826 = this.anInt3827 * 422892305;
	}

	@OriginalMember(owner = "client!eb", name = "ah", descriptor = "()V", line = 116)
	public void method25854() {
		this.aClass18_13.method245();
		this.aClass16_23.method219();
		this.anInt3826 = this.anInt3827 * 422892305;
	}

	@OriginalMember(owner = "client!eb", name = "al", descriptor = "()V", line = 116)
	public void method25855() {
		this.aClass18_13.method245();
		this.aClass16_23.method219();
		this.anInt3826 = this.anInt3827 * 422892305;
	}

	@OriginalMember(owner = "client!eb", name = "ac", descriptor = "()V", line = 116)
	public void method25856() {
		this.aClass18_13.method245();
		this.aClass16_23.method219();
		this.anInt3826 = this.anInt3827 * 422892305;
	}

	@OriginalMember(owner = "client!eb", name = "ai", descriptor = "()I", line = 122)
	public int method25826() {
		return this.anInt3827 * -1057263633;
	}

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "(I)I", line = 122)
	public int method25834() {
		return this.anInt3827 * -1057263633;
	}

	@OriginalMember(owner = "client!eb", name = "aw", descriptor = "()I", line = 122)
	public int method25858() {
		return this.anInt3827 * -1057263633;
	}

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "(B)I", line = 126)
	public int method25835() {
		return this.anInt3826 * -98168065;
	}

	@OriginalMember(owner = "client!eb", name = "as", descriptor = "()I", line = 126)
	public int method25844() {
		return this.anInt3826 * -98168065;
	}

	@OriginalMember(owner = "client!eb", name = "at", descriptor = "()I", line = 126)
	public int method25860() {
		return this.anInt3826 * -98168065;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I", line = 130)
	public int method25836() {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class93_Sub1_Sub12 local7 = (Class93_Sub1_Sub12) this.aClass18_13.method246(); local7 != null; local7 = (Class93_Sub1_Sub12) this.aClass18_13.method253()) {
			if (!local7.method23544()) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!eb", name = "am", descriptor = "()I", line = 130)
	public int method25847() {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class93_Sub1_Sub12 local7 = (Class93_Sub1_Sub12) this.aClass18_13.method246(); local7 != null; local7 = (Class93_Sub1_Sub12) this.aClass18_13.method253()) {
			if (!local7.method23544()) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!eb", name = "ad", descriptor = "()I", line = 130)
	public int method25861() {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class93_Sub1_Sub12 local7 = (Class93_Sub1_Sub12) this.aClass18_13.method246(); local7 != null; local7 = (Class93_Sub1_Sub12) this.aClass18_13.method253()) {
			if (!local7.method23544()) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V", line = 138)
	public void method25837() {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method246(); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method253()) {
			if (local5.method23544()) {
				local5.method23969();
				local5.method23976();
				this.anInt3826 += local5.anInt3214 * 703212397;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "au", descriptor = "()V", line = 138)
	public void method25863() {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method246(); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method253()) {
			if (local5.method23544()) {
				local5.method23969();
				local5.method23976();
				this.anInt3826 += local5.anInt3214 * 703212397;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "ar", descriptor = "()V", line = 138)
	public void method25864() {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method246(); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method253()) {
			if (local5.method23544()) {
				local5.method23969();
				local5.method23976();
				this.anInt3826 += local5.anInt3214 * 703212397;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "ap", descriptor = "()V", line = 138)
	public void method25865() {
		for (@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass18_13.method246(); local5 != null; local5 = (Class93_Sub1_Sub12) this.aClass18_13.method253()) {
			if (local5.method23544()) {
				local5.method23969();
				local5.method23976();
				this.anInt3826 += local5.anInt3214 * 703212397;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "ax", descriptor = "()Ljava/lang/Object;", line = 148)
	public Object method25851() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method220();
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23543();
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class93_Sub1_Sub12 local16 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222();
			local16.method23969();
			local16.method23976();
			this.anInt3826 += local16.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "(I)Ljava/lang/Object;", line = 148)
	public Object method25859() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method220();
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23543();
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class93_Sub1_Sub12 local16 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222();
			local16.method23969();
			local16.method23976();
			this.anInt3826 += local16.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "aq", descriptor = "()Ljava/lang/Object;", line = 148)
	public Object method25862() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method220();
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23543();
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class93_Sub1_Sub12 local16 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222();
			local16.method23969();
			local16.method23976();
			this.anInt3826 += local16.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "(I)Ljava/lang/Object;", line = 164)
	public Object method25846() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222();
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23543();
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class93_Sub1_Sub12 local17 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222();
			local17.method23969();
			local17.method23976();
			this.anInt3826 += local17.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "av", descriptor = "()Ljava/lang/Object;", line = 164)
	public Object method25868() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222();
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23543();
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class93_Sub1_Sub12 local17 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222();
			local17.method23969();
			local17.method23976();
			this.anInt3826 += local17.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "ao", descriptor = "()Ljava/lang/Object;", line = 164)
	public Object method25869() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222();
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23543();
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class93_Sub1_Sub12 local17 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222();
			local17.method23969();
			local17.method23976();
			this.anInt3826 += local17.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "aj", descriptor = "()Ljava/lang/Object;", line = 164)
	public Object method25870() {
		@Pc(5) Class93_Sub1_Sub12 local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222();
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method23543();
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class93_Sub1_Sub12 local17 = local5;
			local5 = (Class93_Sub1_Sub12) this.aClass16_23.method222();
			local17.method23969();
			local17.method23976();
			this.anInt3826 += local17.anInt3214 * 703212397;
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "(Lclient!hq;Lclient!hf;S)V", line = 449)
	static void method25871(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class312 arg1) {
		if (arg1 == null) {
			return;
		}
		@Pc(77) int local77;
		if (arg1.anInt3970 * 532402067 == -1) {
			@Pc(123) Class312[] local123 = arg0.method27236();
			for (local77 = 0; local77 < local123.length && arg1 != local123[local77]; local77++) {
			}
			if (local77 >= local123.length) {
				return;
			}
			Class713.method36842(local123, local77 + 1, local123, local77, local123.length - local77 - 1);
			local123[local123.length - 1] = arg1;
			return;
		}
		@Pc(15) Class312 local15 = arg0.method27228(arg1.anInt3985 * 897022795);
		if (local15 == null) {
			return;
		}
		if (local15.aClass312Array2 == local15.aClass312Array1) {
			local15.aClass312Array1 = new Class312[local15.aClass312Array2.length];
			local15.aClass312Array1[local15.aClass312Array1.length - 1] = arg1;
			Class713.method36842(local15.aClass312Array2, 0, local15.aClass312Array1, 0, arg1.anInt3970 * 532402067);
			Class713.method36842(local15.aClass312Array2, arg1.anInt3970 * 532402067 + 1, local15.aClass312Array1, arg1.anInt3970 * 532402067, local15.aClass312Array2.length - arg1.anInt3970 * 532402067 - 1);
			return;
		}
		local77 = 0;
		@Pc(80) Class312[] local80 = local15.aClass312Array1;
		while (local77 < local80.length && local80[local77] != arg1) {
			local77++;
		}
		if (local77 >= local80.length) {
			return;
		}
		Class713.method36842(local80, local77 + 1, local80, local77, local80.length - local77 - 1);
		local80[local15.aClass312Array1.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!eb", name = "wi", descriptor = "(Lclient!yf;I)V", line = 9098)
	static final void method25874(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class624.aClass120_1.method8654(local12);
	}

	@OriginalMember(owner = "client!eb", name = "aaw", descriptor = "(Lclient!yf;I)V", line = 9770)
	static final void method25873(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (Class93_Sub1_Sub2.aClass170Array1 == null || local12 >= Class623.anInt5682 * 1581594575 || !Class93_Sub1_Sub2.aClass170Array1[local12].aString91.equalsIgnoreCase(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aString82)) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
		}
	}

	@OriginalMember(owner = "client!eb", name = "abp", descriptor = "(Lclient!yf;I)V", line = 9908)
	static final void method25872(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = Class557.aClass297_1.method26622(local12).method26745();
	}
}

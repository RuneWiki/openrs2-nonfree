package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public class Class466 {

	@OriginalMember(owner = "client!st", name = "l", descriptor = "Lclient!wc;")
	Class546 aClass546_17 = new Class546();

	@OriginalMember(owner = "client!st", name = "p", descriptor = "I")
	int anInt5074;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "I")
	int anInt5075;

	@OriginalMember(owner = "client!st", name = "g", descriptor = "Lclient!xn;")
	Class581 aClass581_35;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(I)V", line = 12)
	public Class466(@OriginalArg(0) int arg0) {
		this.anInt5074 = arg0;
		this.anInt5075 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass581_35 = new Class581(local14);
	}

	@OriginalMember(owner = "client!st", name = "p", descriptor = "(Lclient!sa;)Ljava/lang/Object;", line = 21)
	public final Object method28667(@OriginalArg(0) Interface49 arg0) {
		@Pc(2) long local2 = arg0.method33645();
		for (@Pc(8) Class3_Sub1_Sub15 local8 = (Class3_Sub1_Sub15) this.aClass581_35.method33217(local2); local8 != null; local8 = (Class3_Sub1_Sub15) this.aClass581_35.method33218()) {
			if (local8.anInterface49_3.method33647(arg0)) {
				@Pc(19) Object local19 = local8.method21242();
				if (local19 != null) {
					if (local8.method21241()) {
						@Pc(46) Class3_Sub1_Sub15_Sub1 local46 = new Class3_Sub1_Sub15_Sub1(arg0, local19, local8.anInt2870);
						this.aClass581_35.method33241(local46, local8.aLong296 * -1930649055099428229L);
						this.aClass546_17.method32621(local46);
						local46.aLong297 = 0L;
						local8.method33656();
						local8.method33669();
					} else {
						this.aClass546_17.method32621(local8);
						local8.aLong297 = 0L;
					}
					return local19;
				}
				local8.method33656();
				local8.method33669();
				this.anInt5075 += local8.anInt2870;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!sa;)V", line = 49)
	final void method28648(@OriginalArg(0) Interface49 arg0) {
		@Pc(2) long local2 = arg0.method33645();
		for (@Pc(8) Class3_Sub1_Sub15 local8 = (Class3_Sub1_Sub15) this.aClass581_35.method33217(local2); local8 != null; local8 = (Class3_Sub1_Sub15) this.aClass581_35.method33218()) {
			if (local8.anInterface49_3.method33647(arg0)) {
				this.method28649(local8);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(Lclient!sa;)V", line = 49)
	final void method28656(@OriginalArg(0) Interface49 arg0) {
		@Pc(2) long local2 = arg0.method33645();
		for (@Pc(8) Class3_Sub1_Sub15 local8 = (Class3_Sub1_Sub15) this.aClass581_35.method33217(local2); local8 != null; local8 = (Class3_Sub1_Sub15) this.aClass581_35.method33218()) {
			if (local8.anInterface49_3.method33647(arg0)) {
				this.method28649(local8);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "j", descriptor = "(Lclient!amu;)V", line = 58)
	final void method28647(@OriginalArg(0) Class3_Sub1_Sub15 arg0) {
		if (arg0 != null) {
			arg0.method33656();
			arg0.method33669();
			this.anInt5075 += arg0.anInt2870;
		}
	}

	@OriginalMember(owner = "client!st", name = "g", descriptor = "(Lclient!amu;)V", line = 58)
	final void method28649(@OriginalArg(0) Class3_Sub1_Sub15 arg0) {
		if (arg0 != null) {
			arg0.method33656();
			arg0.method33669();
			this.anInt5075 += arg0.anInt2870;
		}
	}

	@OriginalMember(owner = "client!st", name = "z", descriptor = "(Lclient!amu;)V", line = 58)
	final void method28657(@OriginalArg(0) Class3_Sub1_Sub15 arg0) {
		if (arg0 != null) {
			arg0.method33656();
			arg0.method33669();
			this.anInt5075 += arg0.anInt2870;
		}
	}

	@OriginalMember(owner = "client!st", name = "n", descriptor = "(Lclient!amu;)V", line = 58)
	final void method28672(@OriginalArg(0) Class3_Sub1_Sub15 arg0) {
		if (arg0 != null) {
			arg0.method33656();
			arg0.method33669();
			this.anInt5075 += arg0.anInt2870;
		}
	}

	@OriginalMember(owner = "client!st", name = "l", descriptor = "(Ljava/lang/Object;Lclient!sa;)V", line = 66)
	public final void method28650(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface49 arg1) {
		this.method28646(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!st", name = "q", descriptor = "(Ljava/lang/Object;Lclient!sa;)V", line = 66)
	public final void method28651(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface49 arg1) {
		this.method28646(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!st", name = "e", descriptor = "(Ljava/lang/Object;Lclient!sa;)V", line = 66)
	public final void method28660(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface49 arg1) {
		this.method28646(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!st", name = "r", descriptor = "(Ljava/lang/Object;Lclient!sa;)V", line = 66)
	public final void method28661(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface49 arg1) {
		this.method28646(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!st", name = "d", descriptor = "(Ljava/lang/Object;Lclient!sa;)V", line = 66)
	public final void method28662(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface49 arg1) {
		this.method28646(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!st", name = "h", descriptor = "(Ljava/lang/Object;Lclient!sa;I)V", line = 70)
	final void method28646(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface49 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5074) {
			throw new IllegalStateException();
		}
		this.method28648(arg1);
		this.anInt5075 -= arg2;
		while (this.anInt5075 < 0) {
			@Pc(25) Class3_Sub1_Sub15 local25 = (Class3_Sub1_Sub15) this.aClass546_17.method32622();
			this.method28649(local25);
		}
		@Pc(36) Class3_Sub1_Sub15_Sub1 local36 = new Class3_Sub1_Sub15_Sub1(arg1, arg0, arg2);
		this.aClass581_35.method33241(local36, arg1.method33645());
		this.aClass546_17.method32621(local36);
		local36.aLong297 = 0L;
	}

	@OriginalMember(owner = "client!st", name = "x", descriptor = "(I)V", line = 84)
	public final void method28664(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub1_Sub15 local5 = (Class3_Sub1_Sub15) this.aClass546_17.method32623(); local5 != null; local5 = (Class3_Sub1_Sub15) this.aClass546_17.method32645()) {
			if (local5.method21241()) {
				if (local5.method21242() == null) {
					local5.method33656();
					local5.method33669();
					this.anInt5075 += local5.anInt2870;
				}
			} else if ((local5.aLong297 += -2199417693621122125L) * -2884094411549009029L > (long) arg0) {
				@Pc(50) Class3_Sub1_Sub15_Sub2 local50 = new Class3_Sub1_Sub15_Sub2(local5.anInterface49_3, local5.method21242(), local5.anInt2870);
				this.aClass581_35.method33241(local50, local5.aLong296 * -1930649055099428229L);
				Class533.method32507(local50, local5);
				local5.method33656();
				local5.method33669();
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "m", descriptor = "(I)V", line = 84)
	public final void method28668(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub1_Sub15 local5 = (Class3_Sub1_Sub15) this.aClass546_17.method32623(); local5 != null; local5 = (Class3_Sub1_Sub15) this.aClass546_17.method32645()) {
			if (local5.method21241()) {
				if (local5.method21242() == null) {
					local5.method33656();
					local5.method33669();
					this.anInt5075 += local5.anInt2870;
				}
			} else if ((local5.aLong297 += -2199417693621122125L) * -2884094411549009029L > (long) arg0) {
				@Pc(50) Class3_Sub1_Sub15_Sub2 local50 = new Class3_Sub1_Sub15_Sub2(local5.anInterface49_3, local5.method21242(), local5.anInt2870);
				this.aClass581_35.method33241(local50, local5.aLong296 * -1930649055099428229L);
				Class533.method32507(local50, local5);
				local5.method33656();
				local5.method33669();
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "s", descriptor = "()V", line = 106)
	public final void method28652() {
		this.aClass546_17.method32620();
		this.aClass581_35.method33222();
		this.anInt5075 = this.anInt5074;
	}

	@OriginalMember(owner = "client!st", name = "v", descriptor = "()V", line = 106)
	public final void method28665() {
		this.aClass546_17.method32620();
		this.aClass581_35.method33222();
		this.anInt5075 = this.anInt5074;
	}

	@OriginalMember(owner = "client!st", name = "t", descriptor = "()V", line = 106)
	public final void method28666() {
		this.aClass546_17.method32620();
		this.aClass581_35.method33222();
		this.anInt5075 = this.anInt5074;
	}

	@OriginalMember(owner = "client!st", name = "u", descriptor = "()I", line = 112)
	public final int method28653() {
		return this.anInt5074;
	}

	@OriginalMember(owner = "client!st", name = "w", descriptor = "()I", line = 112)
	public final int method28655() {
		return this.anInt5074;
	}

	@OriginalMember(owner = "client!st", name = "y", descriptor = "()I", line = 116)
	public final int method28654() {
		return this.anInt5075;
	}

	@OriginalMember(owner = "client!st", name = "i", descriptor = "()I", line = 116)
	public final int method28658() {
		return this.anInt5075;
	}

	@OriginalMember(owner = "client!st", name = "o", descriptor = "()I", line = 116)
	public final int method28663() {
		return this.anInt5075;
	}

	@OriginalMember(owner = "client!st", name = "f", descriptor = "()I", line = 116)
	public final int method28670() {
		return this.anInt5075;
	}

	@OriginalMember(owner = "client!st", name = "at", descriptor = "()V", line = 120)
	public final void method28659() {
		for (@Pc(5) Class3_Sub1_Sub15 local5 = (Class3_Sub1_Sub15) this.aClass546_17.method32623(); local5 != null; local5 = (Class3_Sub1_Sub15) this.aClass546_17.method32645()) {
			if (local5.method21241()) {
				local5.method33656();
				local5.method33669();
				this.anInt5075 += local5.anInt2870;
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "()V", line = 120)
	public final void method28669() {
		for (@Pc(5) Class3_Sub1_Sub15 local5 = (Class3_Sub1_Sub15) this.aClass546_17.method32623(); local5 != null; local5 = (Class3_Sub1_Sub15) this.aClass546_17.method32645()) {
			if (local5.method21241()) {
				local5.method33656();
				local5.method33669();
				this.anInt5075 += local5.anInt2870;
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "k", descriptor = "()V", line = 120)
	public final void method28671() {
		for (@Pc(5) Class3_Sub1_Sub15 local5 = (Class3_Sub1_Sub15) this.aClass546_17.method32623(); local5 != null; local5 = (Class3_Sub1_Sub15) this.aClass546_17.method32645()) {
			if (local5.method21241()) {
				local5.method33656();
				local5.method33669();
				this.anInt5075 += local5.anInt2870;
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "af", descriptor = "()V", line = 120)
	public final void method28673() {
		for (@Pc(5) Class3_Sub1_Sub15 local5 = (Class3_Sub1_Sub15) this.aClass546_17.method32623(); local5 != null; local5 = (Class3_Sub1_Sub15) this.aClass546_17.method32645()) {
			if (local5.method21241()) {
				local5.method33656();
				local5.method33669();
				this.anInt5075 += local5.anInt2870;
			}
		}
	}
}

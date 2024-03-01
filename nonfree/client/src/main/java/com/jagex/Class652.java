package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wz")
public class Class652 {

	@OriginalMember(owner = "client!wz", name = "k", descriptor = "Lclient!aap;")
	Class18 aClass18_18 = new Class18();

	@OriginalMember(owner = "client!wz", name = "e", descriptor = "I")
	int anInt5804;

	@OriginalMember(owner = "client!wz", name = "n", descriptor = "I")
	int anInt5803;

	@OriginalMember(owner = "client!wz", name = "m", descriptor = "Lclient!aan;")
	Class16 aClass16_37;

	@OriginalMember(owner = "client!wz", name = "<init>", descriptor = "(I)V", line = 12)
	public Class652(@OriginalArg(0) int arg0) {
		this.anInt5804 = arg0;
		this.anInt5803 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass16_37 = new Class16(local14);
	}

	@OriginalMember(owner = "client!wz", name = "e", descriptor = "(Lclient!wk;)Ljava/lang/Object;", line = 21)
	public final Object method32676(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method811();
		for (@Pc(8) Class93_Sub1_Sub19 local8 = (Class93_Sub1_Sub19) this.aClass16_37.method215(local2); local8 != null; local8 = (Class93_Sub1_Sub19) this.aClass16_37.method216()) {
			if (local8.anInterface69_3.method808(arg0)) {
				@Pc(19) Object local19 = local8.method23962();
				if (local19 != null) {
					if (local8.method23963()) {
						@Pc(46) Class93_Sub1_Sub19_Sub1 local46 = new Class93_Sub1_Sub19_Sub1(arg0, local19, local8.anInt3270);
						this.aClass16_37.method221(local46, local8.aLong232 * -3750704643647536275L);
						this.aClass18_18.method268(local46);
						local46.aLong233 = 0L;
						local8.method23969();
						local8.method23976();
					} else {
						this.aClass18_18.method268(local8);
						local8.aLong233 = 0L;
					}
					return local19;
				}
				local8.method23969();
				local8.method23976();
				this.anInt5803 += local8.anInt3270;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wz", name = "z", descriptor = "(Lclient!wk;)Ljava/lang/Object;", line = 21)
	public final Object method32677(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method811();
		for (@Pc(8) Class93_Sub1_Sub19 local8 = (Class93_Sub1_Sub19) this.aClass16_37.method215(local2); local8 != null; local8 = (Class93_Sub1_Sub19) this.aClass16_37.method216()) {
			if (local8.anInterface69_3.method808(arg0)) {
				@Pc(19) Object local19 = local8.method23962();
				if (local19 != null) {
					if (local8.method23963()) {
						@Pc(46) Class93_Sub1_Sub19_Sub1 local46 = new Class93_Sub1_Sub19_Sub1(arg0, local19, local8.anInt3270);
						this.aClass16_37.method221(local46, local8.aLong232 * -3750704643647536275L);
						this.aClass18_18.method268(local46);
						local46.aLong233 = 0L;
						local8.method23969();
						local8.method23976();
					} else {
						this.aClass18_18.method268(local8);
						local8.aLong233 = 0L;
					}
					return local19;
				}
				local8.method23969();
				local8.method23976();
				this.anInt5803 += local8.anInt3270;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wz", name = "n", descriptor = "(Lclient!wk;)V", line = 49)
	final void method32680(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method811();
		for (@Pc(8) Class93_Sub1_Sub19 local8 = (Class93_Sub1_Sub19) this.aClass16_37.method215(local2); local8 != null; local8 = (Class93_Sub1_Sub19) this.aClass16_37.method216()) {
			if (local8.anInterface69_3.method808(arg0)) {
				this.method32678(local8);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "p", descriptor = "(Lclient!wk;)V", line = 49)
	final void method32685(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method811();
		for (@Pc(8) Class93_Sub1_Sub19 local8 = (Class93_Sub1_Sub19) this.aClass16_37.method215(local2); local8 != null; local8 = (Class93_Sub1_Sub19) this.aClass16_37.method216()) {
			if (local8.anInterface69_3.method808(arg0)) {
				this.method32678(local8);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "d", descriptor = "(Lclient!wk;)V", line = 49)
	final void method32695(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method811();
		for (@Pc(8) Class93_Sub1_Sub19 local8 = (Class93_Sub1_Sub19) this.aClass16_37.method215(local2); local8 != null; local8 = (Class93_Sub1_Sub19) this.aClass16_37.method216()) {
			if (local8.anInterface69_3.method808(arg0)) {
				this.method32678(local8);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "m", descriptor = "(Lclient!asr;)V", line = 58)
	final void method32678(@OriginalArg(0) Class93_Sub1_Sub19 arg0) {
		if (arg0 != null) {
			arg0.method23969();
			arg0.method23976();
			this.anInt5803 += arg0.anInt3270;
		}
	}

	@OriginalMember(owner = "client!wz", name = "c", descriptor = "(Lclient!asr;)V", line = 58)
	final void method32692(@OriginalArg(0) Class93_Sub1_Sub19 arg0) {
		if (arg0 != null) {
			arg0.method23969();
			arg0.method23976();
			this.anInt5803 += arg0.anInt3270;
		}
	}

	@OriginalMember(owner = "client!wz", name = "r", descriptor = "(Lclient!asr;)V", line = 58)
	final void method32693(@OriginalArg(0) Class93_Sub1_Sub19 arg0) {
		if (arg0 != null) {
			arg0.method23969();
			arg0.method23976();
			this.anInt5803 += arg0.anInt3270;
		}
	}

	@OriginalMember(owner = "client!wz", name = "k", descriptor = "(Ljava/lang/Object;Lclient!wk;)V", line = 66)
	public final void method32684(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1) {
		this.method32686(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!wz", name = "v", descriptor = "(Ljava/lang/Object;Lclient!wk;)V", line = 66)
	public final void method32688(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1) {
		this.method32686(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!wz", name = "o", descriptor = "(Ljava/lang/Object;Lclient!wk;)V", line = 66)
	public final void method32689(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1) {
		this.method32686(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!wz", name = "f", descriptor = "(Ljava/lang/Object;Lclient!wk;I)V", line = 70)
	final void method32686(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5804) {
			throw new IllegalStateException();
		}
		this.method32680(arg1);
		this.anInt5803 -= arg2;
		while (this.anInt5803 < 0) {
			@Pc(25) Class93_Sub1_Sub19 local25 = (Class93_Sub1_Sub19) this.aClass18_18.method244();
			this.method32678(local25);
		}
		@Pc(36) Class93_Sub1_Sub19_Sub1 local36 = new Class93_Sub1_Sub19_Sub1(arg1, arg0, arg2);
		this.aClass16_37.method221(local36, arg1.method811());
		this.aClass18_18.method268(local36);
		local36.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!wz", name = "q", descriptor = "(Ljava/lang/Object;Lclient!wk;I)V", line = 70)
	final void method32687(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5804) {
			throw new IllegalStateException();
		}
		this.method32680(arg1);
		this.anInt5803 -= arg2;
		while (this.anInt5803 < 0) {
			@Pc(25) Class93_Sub1_Sub19 local25 = (Class93_Sub1_Sub19) this.aClass18_18.method244();
			this.method32678(local25);
		}
		@Pc(36) Class93_Sub1_Sub19_Sub1 local36 = new Class93_Sub1_Sub19_Sub1(arg1, arg0, arg2);
		this.aClass16_37.method221(local36, arg1.method811());
		this.aClass18_18.method268(local36);
		local36.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!wz", name = "s", descriptor = "(Ljava/lang/Object;Lclient!wk;I)V", line = 70)
	final void method32690(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5804) {
			throw new IllegalStateException();
		}
		this.method32680(arg1);
		this.anInt5803 -= arg2;
		while (this.anInt5803 < 0) {
			@Pc(25) Class93_Sub1_Sub19 local25 = (Class93_Sub1_Sub19) this.aClass18_18.method244();
			this.method32678(local25);
		}
		@Pc(36) Class93_Sub1_Sub19_Sub1 local36 = new Class93_Sub1_Sub19_Sub1(arg1, arg0, arg2);
		this.aClass16_37.method221(local36, arg1.method811());
		this.aClass18_18.method268(local36);
		local36.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!wz", name = "y", descriptor = "(Ljava/lang/Object;Lclient!wk;I)V", line = 70)
	final void method32697(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5804) {
			throw new IllegalStateException();
		}
		this.method32680(arg1);
		this.anInt5803 -= arg2;
		while (this.anInt5803 < 0) {
			@Pc(25) Class93_Sub1_Sub19 local25 = (Class93_Sub1_Sub19) this.aClass18_18.method244();
			this.method32678(local25);
		}
		@Pc(36) Class93_Sub1_Sub19_Sub1 local36 = new Class93_Sub1_Sub19_Sub1(arg1, arg0, arg2);
		this.aClass16_37.method221(local36, arg1.method811());
		this.aClass18_18.method268(local36);
		local36.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!wz", name = "x", descriptor = "(I)V", line = 84)
	public final void method32675(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method246(); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method253()) {
			if (local5.method23963()) {
				if (local5.method23962() == null) {
					local5.method23969();
					local5.method23976();
					this.anInt5803 += local5.anInt3270;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(50) Class93_Sub1_Sub19_Sub2 local50 = new Class93_Sub1_Sub19_Sub2(local5.anInterface69_3, local5.method23962(), local5.anInt3270);
				this.aClass16_37.method221(local50, local5.aLong232 * -3750704643647536275L);
				Class658.method32790(local50, local5);
				local5.method23969();
				local5.method23976();
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "w", descriptor = "(I)V", line = 84)
	public final void method32681(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method246(); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method253()) {
			if (local5.method23963()) {
				if (local5.method23962() == null) {
					local5.method23969();
					local5.method23976();
					this.anInt5803 += local5.anInt3270;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(50) Class93_Sub1_Sub19_Sub2 local50 = new Class93_Sub1_Sub19_Sub2(local5.anInterface69_3, local5.method23962(), local5.anInt3270);
				this.aClass16_37.method221(local50, local5.aLong232 * -3750704643647536275L);
				Class658.method32790(local50, local5);
				local5.method23969();
				local5.method23976();
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "l", descriptor = "()V", line = 106)
	public final void method32682() {
		this.aClass18_18.method245();
		this.aClass16_37.method219();
		this.anInt5803 = this.anInt5804;
	}

	@OriginalMember(owner = "client!wz", name = "h", descriptor = "()V", line = 106)
	public final void method32691() {
		this.aClass18_18.method245();
		this.aClass16_37.method219();
		this.anInt5803 = this.anInt5804;
	}

	@OriginalMember(owner = "client!wz", name = "b", descriptor = "()V", line = 106)
	public final void method32694() {
		this.aClass18_18.method245();
		this.aClass16_37.method219();
		this.anInt5803 = this.anInt5804;
	}

	@OriginalMember(owner = "client!wz", name = "a", descriptor = "()V", line = 106)
	public final void method32696() {
		this.aClass18_18.method245();
		this.aClass16_37.method219();
		this.anInt5803 = this.anInt5804;
	}

	@OriginalMember(owner = "client!wz", name = "g", descriptor = "()V", line = 112)
	public final void method32679() {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method246(); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method253()) {
			if (local5.method23963()) {
				local5.method23969();
				local5.method23976();
				this.anInt5803 += local5.anInt3270;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "u", descriptor = "()V", line = 112)
	public final void method32683() {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method246(); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method253()) {
			if (local5.method23963()) {
				local5.method23969();
				local5.method23976();
				this.anInt5803 += local5.anInt3270;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "i", descriptor = "()V", line = 112)
	public final void method32698() {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method246(); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method253()) {
			if (local5.method23963()) {
				local5.method23969();
				local5.method23976();
				this.anInt5803 += local5.anInt3270;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "j", descriptor = "()V", line = 112)
	public final void method32699() {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method246(); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method253()) {
			if (local5.method23963()) {
				local5.method23969();
				local5.method23976();
				this.anInt5803 += local5.anInt3270;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "t", descriptor = "()V", line = 112)
	public final void method32700() {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method246(); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method253()) {
			if (local5.method23963()) {
				local5.method23969();
				local5.method23976();
				this.anInt5803 += local5.anInt3270;
			}
		}
	}
}

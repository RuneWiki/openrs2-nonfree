package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public class Class607 {

	@OriginalMember(owner = "client!vw", name = "l", descriptor = "Lclient!zi;")
	Class691 aClass691_16 = new Class691();

	@OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
	int anInt5565;

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
	int anInt5566;

	@OriginalMember(owner = "client!vw", name = "v", descriptor = "Lclient!aak;")
	Class12 aClass12_35;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(I)V", line = 12)
	public Class607(@OriginalArg(0) int arg0) {
		this.anInt5565 = arg0;
		this.anInt5566 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass12_35 = new Class12(local14);
	}

	@OriginalMember(owner = "client!vw", name = "p", descriptor = "(Lclient!vs;)Ljava/lang/Object;", line = 21)
	public final Object method32080(@OriginalArg(0) Interface70 arg0) {
		@Pc(2) long local2 = arg0.method165();
		for (@Pc(8) Class77_Sub1_Sub15 local8 = (Class77_Sub1_Sub15) this.aClass12_35.method173(local2); local8 != null; local8 = (Class77_Sub1_Sub15) this.aClass12_35.method176()) {
			if (local8.anInterface70_3.method164(arg0)) {
				@Pc(19) Object local19 = local8.method24072();
				if (local19 != null) {
					if (local8.method24079()) {
						@Pc(46) Class77_Sub1_Sub15_Sub2 local46 = new Class77_Sub1_Sub15_Sub2(arg0, local19, local8.anInt3218);
						this.aClass12_35.method184(local46, local8.aLong229 * 8258869577519436579L);
						this.aClass691_16.method36326(local46);
						local46.aLong230 = 0L;
						local8.method24063();
						local8.method24069();
					} else {
						this.aClass691_16.method36326(local8);
						local8.aLong230 = 0L;
					}
					return local19;
				}
				local8.method24063();
				local8.method24069();
				this.anInt5566 += local8.anInt3218;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vw", name = "x", descriptor = "(Lclient!vs;)Ljava/lang/Object;", line = 21)
	public final Object method32081(@OriginalArg(0) Interface70 arg0) {
		@Pc(2) long local2 = arg0.method165();
		for (@Pc(8) Class77_Sub1_Sub15 local8 = (Class77_Sub1_Sub15) this.aClass12_35.method173(local2); local8 != null; local8 = (Class77_Sub1_Sub15) this.aClass12_35.method176()) {
			if (local8.anInterface70_3.method164(arg0)) {
				@Pc(19) Object local19 = local8.method24072();
				if (local19 != null) {
					if (local8.method24079()) {
						@Pc(46) Class77_Sub1_Sub15_Sub2 local46 = new Class77_Sub1_Sub15_Sub2(arg0, local19, local8.anInt3218);
						this.aClass12_35.method184(local46, local8.aLong229 * 8258869577519436579L);
						this.aClass691_16.method36326(local46);
						local46.aLong230 = 0L;
						local8.method24063();
						local8.method24069();
					} else {
						this.aClass691_16.method36326(local8);
						local8.aLong230 = 0L;
					}
					return local19;
				}
				local8.method24063();
				local8.method24069();
				this.anInt5566 += local8.anInt3218;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "(Lclient!vs;)V", line = 49)
	final void method32082(@OriginalArg(0) Interface70 arg0) {
		@Pc(2) long local2 = arg0.method165();
		for (@Pc(8) Class77_Sub1_Sub15 local8 = (Class77_Sub1_Sub15) this.aClass12_35.method173(local2); local8 != null; local8 = (Class77_Sub1_Sub15) this.aClass12_35.method176()) {
			if (local8.anInterface70_3.method164(arg0)) {
				this.method32086(local8);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "(Lclient!vs;)V", line = 49)
	final void method32083(@OriginalArg(0) Interface70 arg0) {
		@Pc(2) long local2 = arg0.method165();
		for (@Pc(8) Class77_Sub1_Sub15 local8 = (Class77_Sub1_Sub15) this.aClass12_35.method173(local2); local8 != null; local8 = (Class77_Sub1_Sub15) this.aClass12_35.method176()) {
			if (local8.anInterface70_3.method164(arg0)) {
				this.method32086(local8);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "s", descriptor = "(Lclient!arn;)V", line = 58)
	final void method32084(@OriginalArg(0) Class77_Sub1_Sub15 arg0) {
		if (arg0 != null) {
			arg0.method24063();
			arg0.method24069();
			this.anInt5566 += arg0.anInt3218;
		}
	}

	@OriginalMember(owner = "client!vw", name = "r", descriptor = "(Lclient!arn;)V", line = 58)
	final void method32085(@OriginalArg(0) Class77_Sub1_Sub15 arg0) {
		if (arg0 != null) {
			arg0.method24063();
			arg0.method24069();
			this.anInt5566 += arg0.anInt3218;
		}
	}

	@OriginalMember(owner = "client!vw", name = "v", descriptor = "(Lclient!arn;)V", line = 58)
	final void method32086(@OriginalArg(0) Class77_Sub1_Sub15 arg0) {
		if (arg0 != null) {
			arg0.method24063();
			arg0.method24069();
			this.anInt5566 += arg0.anInt3218;
		}
	}

	@OriginalMember(owner = "client!vw", name = "l", descriptor = "(Ljava/lang/Object;Lclient!vs;)V", line = 66)
	public final void method32087(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface70 arg1) {
		this.method32090(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "(Ljava/lang/Object;Lclient!vs;)V", line = 66)
	public final void method32088(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface70 arg1) {
		this.method32090(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!vw", name = "z", descriptor = "(Ljava/lang/Object;Lclient!vs;)V", line = 66)
	public final void method32089(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface70 arg1) {
		this.method32090(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!vw", name = "y", descriptor = "(Ljava/lang/Object;Lclient!vs;I)V", line = 70)
	final void method32090(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface70 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5565) {
			throw new IllegalStateException();
		}
		this.method32082(arg1);
		this.anInt5566 -= arg2;
		while (this.anInt5566 < 0) {
			@Pc(25) Class77_Sub1_Sub15 local25 = (Class77_Sub1_Sub15) this.aClass691_16.method36331();
			this.method32086(local25);
		}
		@Pc(36) Class77_Sub1_Sub15_Sub2 local36 = new Class77_Sub1_Sub15_Sub2(arg1, arg0, arg2);
		this.aClass12_35.method184(local36, arg1.method165());
		this.aClass691_16.method36326(local36);
		local36.aLong230 = 0L;
	}

	@OriginalMember(owner = "client!vw", name = "j", descriptor = "(Ljava/lang/Object;Lclient!vs;I)V", line = 70)
	final void method32091(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface70 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5565) {
			throw new IllegalStateException();
		}
		this.method32082(arg1);
		this.anInt5566 -= arg2;
		while (this.anInt5566 < 0) {
			@Pc(25) Class77_Sub1_Sub15 local25 = (Class77_Sub1_Sub15) this.aClass691_16.method36331();
			this.method32086(local25);
		}
		@Pc(36) Class77_Sub1_Sub15_Sub2 local36 = new Class77_Sub1_Sub15_Sub2(arg1, arg0, arg2);
		this.aClass12_35.method184(local36, arg1.method165());
		this.aClass691_16.method36326(local36);
		local36.aLong230 = 0L;
	}

	@OriginalMember(owner = "client!vw", name = "i", descriptor = "(Ljava/lang/Object;Lclient!vs;I)V", line = 70)
	final void method32092(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface70 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5565) {
			throw new IllegalStateException();
		}
		this.method32082(arg1);
		this.anInt5566 -= arg2;
		while (this.anInt5566 < 0) {
			@Pc(25) Class77_Sub1_Sub15 local25 = (Class77_Sub1_Sub15) this.aClass691_16.method36331();
			this.method32086(local25);
		}
		@Pc(36) Class77_Sub1_Sub15_Sub2 local36 = new Class77_Sub1_Sub15_Sub2(arg1, arg0, arg2);
		this.aClass12_35.method184(local36, arg1.method165());
		this.aClass691_16.method36326(local36);
		local36.aLong230 = 0L;
	}

	@OriginalMember(owner = "client!vw", name = "k", descriptor = "(Ljava/lang/Object;Lclient!vs;I)V", line = 70)
	final void method32093(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface70 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5565) {
			throw new IllegalStateException();
		}
		this.method32082(arg1);
		this.anInt5566 -= arg2;
		while (this.anInt5566 < 0) {
			@Pc(25) Class77_Sub1_Sub15 local25 = (Class77_Sub1_Sub15) this.aClass691_16.method36331();
			this.method32086(local25);
		}
		@Pc(36) Class77_Sub1_Sub15_Sub2 local36 = new Class77_Sub1_Sub15_Sub2(arg1, arg0, arg2);
		this.aClass12_35.method184(local36, arg1.method165());
		this.aClass691_16.method36326(local36);
		local36.aLong230 = 0L;
	}

	@OriginalMember(owner = "client!vw", name = "f", descriptor = "(I)V", line = 84)
	public final void method32094(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class77_Sub1_Sub15 local5 = (Class77_Sub1_Sub15) this.aClass691_16.method36335(); local5 != null; local5 = (Class77_Sub1_Sub15) this.aClass691_16.method36340()) {
			if (local5.method24079()) {
				if (local5.method24072() == null) {
					local5.method24063();
					local5.method24069();
					this.anInt5566 += local5.anInt3218;
				}
			} else if ((local5.aLong230 += 84410810002887935L) * -753566336061658369L > (long) arg0) {
				@Pc(50) Class77_Sub1_Sub15_Sub1 local50 = new Class77_Sub1_Sub15_Sub1(local5.anInterface70_3, local5.method24072(), local5.anInt3218);
				this.aClass12_35.method184(local50, local5.aLong229 * 8258869577519436579L);
				Class434.method28870(local50, local5);
				local5.method24063();
				local5.method24069();
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "w", descriptor = "(I)V", line = 84)
	public final void method32095(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class77_Sub1_Sub15 local5 = (Class77_Sub1_Sub15) this.aClass691_16.method36335(); local5 != null; local5 = (Class77_Sub1_Sub15) this.aClass691_16.method36340()) {
			if (local5.method24079()) {
				if (local5.method24072() == null) {
					local5.method24063();
					local5.method24069();
					this.anInt5566 += local5.anInt3218;
				}
			} else if ((local5.aLong230 += 84410810002887935L) * -753566336061658369L > (long) arg0) {
				@Pc(50) Class77_Sub1_Sub15_Sub1 local50 = new Class77_Sub1_Sub15_Sub1(local5.anInterface70_3, local5.method24072(), local5.anInt3218);
				this.aClass12_35.method184(local50, local5.aLong229 * 8258869577519436579L);
				Class434.method28870(local50, local5);
				local5.method24063();
				local5.method24069();
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "e", descriptor = "(I)V", line = 84)
	public final void method32096(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class77_Sub1_Sub15 local5 = (Class77_Sub1_Sub15) this.aClass691_16.method36335(); local5 != null; local5 = (Class77_Sub1_Sub15) this.aClass691_16.method36340()) {
			if (local5.method24079()) {
				if (local5.method24072() == null) {
					local5.method24063();
					local5.method24069();
					this.anInt5566 += local5.anInt3218;
				}
			} else if ((local5.aLong230 += 84410810002887935L) * -753566336061658369L > (long) arg0) {
				@Pc(50) Class77_Sub1_Sub15_Sub1 local50 = new Class77_Sub1_Sub15_Sub1(local5.anInterface70_3, local5.method24072(), local5.anInt3218);
				this.aClass12_35.method184(local50, local5.aLong229 * 8258869577519436579L);
				Class434.method28870(local50, local5);
				local5.method24063();
				local5.method24069();
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "u", descriptor = "(I)V", line = 84)
	public final void method32097(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class77_Sub1_Sub15 local5 = (Class77_Sub1_Sub15) this.aClass691_16.method36335(); local5 != null; local5 = (Class77_Sub1_Sub15) this.aClass691_16.method36340()) {
			if (local5.method24079()) {
				if (local5.method24072() == null) {
					local5.method24063();
					local5.method24069();
					this.anInt5566 += local5.anInt3218;
				}
			} else if ((local5.aLong230 += 84410810002887935L) * -753566336061658369L > (long) arg0) {
				@Pc(50) Class77_Sub1_Sub15_Sub1 local50 = new Class77_Sub1_Sub15_Sub1(local5.anInterface70_3, local5.method24072(), local5.anInt3218);
				this.aClass12_35.method184(local50, local5.aLong229 * 8258869577519436579L);
				Class434.method28870(local50, local5);
				local5.method24063();
				local5.method24069();
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "t", descriptor = "()V", line = 106)
	public final void method32098() {
		this.aClass691_16.method36321();
		this.aClass12_35.method188();
		this.anInt5566 = this.anInt5565;
	}

	@OriginalMember(owner = "client!vw", name = "o", descriptor = "()V", line = 106)
	public final void method32099() {
		this.aClass691_16.method36321();
		this.aClass12_35.method188();
		this.anInt5566 = this.anInt5565;
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "()V", line = 106)
	public final void method32100() {
		this.aClass691_16.method36321();
		this.aClass12_35.method188();
		this.anInt5566 = this.anInt5565;
	}

	@OriginalMember(owner = "client!vw", name = "q", descriptor = "()V", line = 112)
	public final void method32101() {
		for (@Pc(5) Class77_Sub1_Sub15 local5 = (Class77_Sub1_Sub15) this.aClass691_16.method36335(); local5 != null; local5 = (Class77_Sub1_Sub15) this.aClass691_16.method36340()) {
			if (local5.method24079()) {
				local5.method24063();
				local5.method24069();
				this.anInt5566 += local5.anInt3218;
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "n", descriptor = "()V", line = 112)
	public final void method32102() {
		for (@Pc(5) Class77_Sub1_Sub15 local5 = (Class77_Sub1_Sub15) this.aClass691_16.method36335(); local5 != null; local5 = (Class77_Sub1_Sub15) this.aClass691_16.method36340()) {
			if (local5.method24079()) {
				local5.method24063();
				local5.method24069();
				this.anInt5566 += local5.anInt3218;
			}
		}
	}
}

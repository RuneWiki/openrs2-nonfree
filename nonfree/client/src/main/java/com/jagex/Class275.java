package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public class Class275 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!kf;")
	Class275 aClass275_1;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Lclient!jf;")
	Interface25 anInterface25_1;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "F")
	float aFloat257;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "F")
	float aFloat255;

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "F")
	float aFloat256;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "F")
	float aFloat254;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "J")
	long aLong256;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "J")
	long aLong257;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IFLjava/lang/Object;Lclient!js;Lclient!jf;Lclient!kf;)V", line = 15)
	Class275(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) Class264 arg3, @OriginalArg(4) Interface25 arg4, @OriginalArg(5) Class275 arg5) {
		this.aClass275_1 = arg5;
		this.anInterface25_1 = arg4;
		this.aFloat257 = 1.0F;
		this.aFloat255 = arg1;
		this.aFloat256 = -1.0F;
		this.aFloat254 = -1.0F;
		this.aLong256 = 551119601060453451L;
		this.aLong257 = -337415112859839439L;
	}

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "(B)F", line = 27)
	float method25358() {
		return this.aFloat255;
	}

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "()F", line = 27)
	float method25365() {
		return this.aFloat255;
	}

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "()F", line = 27)
	float method25368() {
		return this.aFloat255;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)F", line = 31)
	public float method25359() {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class275 local3 = this; local3 != null; local3 = local3.method25361()) {
			local1 *= local3.method25358();
		}
		return local1;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "()F", line = 31)
	public float method25366() {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class275 local3 = this; local3 != null; local3 = local3.method25361()) {
			local1 *= local3.method25358();
		}
		return local1;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "()F", line = 31)
	public float method25367() {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class275 local3 = this; local3 != null; local3 = local3.method25361()) {
			local1 *= local3.method25358();
		}
		return local1;
	}

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)V", line = 41)
	void method25357() {
		if (this.anInterface25_1 != null) {
			@Pc(7) float local7 = this.anInterface25_1.method23202();
			if (this.aFloat257 != local7 && this.aFloat254 < 0.0F) {
				this.aFloat256 = this.aFloat257;
				this.aFloat254 = local7;
				this.aLong256 = Class176.method23413() * -551119601060453451L;
				this.aLong257 = -2889434775780357133L * this.aLong256 + -3151976861435159332L;
			}
		}
		if (this.aFloat254 >= 0.0F) {
			@Pc(46) long local46 = Class176.method23413();
			if (local46 > this.aLong257 * -4256963357421520081L) {
				this.aFloat257 = this.aFloat254;
				this.aFloat254 = -1.0F;
			} else {
				@Pc(67) float local67 = this.aFloat254 - this.aFloat256;
				@Pc(77) long local77 = this.aLong257 * -4256963357421520081L - this.aLong256 * -6469125157569776995L;
				@Pc(82) float local82 = local67 / (float) local77;
				this.aFloat257 = (float) (local46 - this.aLong256 * -6469125157569776995L) * local82 + this.aFloat256;
				if (this.aFloat254 == this.aFloat257) {
					this.aFloat254 = -1.0F;
				}
			}
		}
		this.aFloat257 = Math.min(1.0F, Math.max(this.aFloat257, 0.0F));
	}

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "()V", line = 41)
	void method25362() {
		if (this.anInterface25_1 != null) {
			@Pc(7) float local7 = this.anInterface25_1.method23202();
			if (this.aFloat257 != local7 && this.aFloat254 < 0.0F) {
				this.aFloat256 = this.aFloat257;
				this.aFloat254 = local7;
				this.aLong256 = Class176.method23413() * -551119601060453451L;
				this.aLong257 = -2889434775780357133L * this.aLong256 + -3151976861435159332L;
			}
		}
		if (this.aFloat254 >= 0.0F) {
			@Pc(46) long local46 = Class176.method23413();
			if (local46 > this.aLong257 * -4256963357421520081L) {
				this.aFloat257 = this.aFloat254;
				this.aFloat254 = -1.0F;
			} else {
				@Pc(67) float local67 = this.aFloat254 - this.aFloat256;
				@Pc(77) long local77 = this.aLong257 * -4256963357421520081L - this.aLong256 * -6469125157569776995L;
				@Pc(82) float local82 = local67 / (float) local77;
				this.aFloat257 = (float) (local46 - this.aLong256 * -6469125157569776995L) * local82 + this.aFloat256;
				if (this.aFloat254 == this.aFloat257) {
					this.aFloat254 = -1.0F;
				}
			}
		}
		this.aFloat257 = Math.min(1.0F, Math.max(this.aFloat257, 0.0F));
	}

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "()V", line = 41)
	void method25363() {
		if (this.anInterface25_1 != null) {
			@Pc(7) float local7 = this.anInterface25_1.method23202();
			if (this.aFloat257 != local7 && this.aFloat254 < 0.0F) {
				this.aFloat256 = this.aFloat257;
				this.aFloat254 = local7;
				this.aLong256 = Class176.method23413() * -551119601060453451L;
				this.aLong257 = -2889434775780357133L * this.aLong256 + -3151976861435159332L;
			}
		}
		if (this.aFloat254 >= 0.0F) {
			@Pc(46) long local46 = Class176.method23413();
			if (local46 > this.aLong257 * -4256963357421520081L) {
				this.aFloat257 = this.aFloat254;
				this.aFloat254 = -1.0F;
			} else {
				@Pc(67) float local67 = this.aFloat254 - this.aFloat256;
				@Pc(77) long local77 = this.aLong257 * -4256963357421520081L - this.aLong256 * -6469125157569776995L;
				@Pc(82) float local82 = local67 / (float) local77;
				this.aFloat257 = (float) (local46 - this.aLong256 * -6469125157569776995L) * local82 + this.aFloat256;
				if (this.aFloat254 == this.aFloat257) {
					this.aFloat254 = -1.0F;
				}
			}
		}
		this.aFloat257 = Math.min(1.0F, Math.max(this.aFloat257, 0.0F));
	}

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "()V", line = 41)
	void method25369() {
		if (this.anInterface25_1 != null) {
			@Pc(7) float local7 = this.anInterface25_1.method23202();
			if (this.aFloat257 != local7 && this.aFloat254 < 0.0F) {
				this.aFloat256 = this.aFloat257;
				this.aFloat254 = local7;
				this.aLong256 = Class176.method23413() * -551119601060453451L;
				this.aLong257 = -2889434775780357133L * this.aLong256 + -3151976861435159332L;
			}
		}
		if (this.aFloat254 >= 0.0F) {
			@Pc(46) long local46 = Class176.method23413();
			if (local46 > this.aLong257 * -4256963357421520081L) {
				this.aFloat257 = this.aFloat254;
				this.aFloat254 = -1.0F;
			} else {
				@Pc(67) float local67 = this.aFloat254 - this.aFloat256;
				@Pc(77) long local77 = this.aLong257 * -4256963357421520081L - this.aLong256 * -6469125157569776995L;
				@Pc(82) float local82 = local67 / (float) local77;
				this.aFloat257 = (float) (local46 - this.aLong256 * -6469125157569776995L) * local82 + this.aFloat256;
				if (this.aFloat254 == this.aFloat257) {
					this.aFloat254 = -1.0F;
				}
			}
		}
		this.aFloat257 = Math.min(1.0F, Math.max(this.aFloat257, 0.0F));
	}

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "()V", line = 41)
	void method25371() {
		if (this.anInterface25_1 != null) {
			@Pc(7) float local7 = this.anInterface25_1.method23202();
			if (this.aFloat257 != local7 && this.aFloat254 < 0.0F) {
				this.aFloat256 = this.aFloat257;
				this.aFloat254 = local7;
				this.aLong256 = Class176.method23413() * -551119601060453451L;
				this.aLong257 = -2889434775780357133L * this.aLong256 + -3151976861435159332L;
			}
		}
		if (this.aFloat254 >= 0.0F) {
			@Pc(46) long local46 = Class176.method23413();
			if (local46 > this.aLong257 * -4256963357421520081L) {
				this.aFloat257 = this.aFloat254;
				this.aFloat254 = -1.0F;
			} else {
				@Pc(67) float local67 = this.aFloat254 - this.aFloat256;
				@Pc(77) long local77 = this.aLong257 * -4256963357421520081L - this.aLong256 * -6469125157569776995L;
				@Pc(82) float local82 = local67 / (float) local77;
				this.aFloat257 = (float) (local46 - this.aLong256 * -6469125157569776995L) * local82 + this.aFloat256;
				if (this.aFloat254 == this.aFloat257) {
					this.aFloat254 = -1.0F;
				}
			}
		}
		this.aFloat257 = Math.min(1.0F, Math.max(this.aFloat257, 0.0F));
	}

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "(I)F", line = 70)
	public float method25360() {
		@Pc(2) float local2 = this.aFloat257;
		for (@Pc(5) Class275 local5 = this.aClass275_1; local5 != null; local5 = local5.method25361()) {
			local2 *= local5.method25370();
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "()F", line = 70)
	public float method25372() {
		@Pc(2) float local2 = this.aFloat257;
		for (@Pc(5) Class275 local5 = this.aClass275_1; local5 != null; local5 = local5.method25361()) {
			local2 *= local5.method25370();
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "()F", line = 70)
	public float method25373() {
		@Pc(2) float local2 = this.aFloat257;
		for (@Pc(5) Class275 local5 = this.aClass275_1; local5 != null; local5 = local5.method25361()) {
			local2 *= local5.method25370();
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "()F", line = 70)
	public float method25374() {
		@Pc(2) float local2 = this.aFloat257;
		for (@Pc(5) Class275 local5 = this.aClass275_1; local5 != null; local5 = local5.method25361()) {
			local2 *= local5.method25370();
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "(S)F", line = 81)
	public float method25370() {
		return this.aFloat257;
	}

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "()F", line = 81)
	public float method25375() {
		return this.aFloat257;
	}

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "()F", line = 81)
	public float method25376() {
		return this.aFloat257;
	}

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "(FB)V", line = 85)
	public void method25364(@OriginalArg(0) float arg0) {
		if (this.anInterface25_1 == null) {
			this.aFloat254 = arg0;
			this.aFloat256 = this.aFloat257;
			this.aLong256 = Class176.method23413() * -551119601060453451L;
			this.aLong257 = this.aLong256 * -2889434775780357133L + -3151976861435159332L;
		}
	}

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "(F)V", line = 85)
	public void method25377(@OriginalArg(0) float arg0) {
		if (this.anInterface25_1 == null) {
			this.aFloat254 = arg0;
			this.aFloat256 = this.aFloat257;
			this.aLong256 = Class176.method23413() * -551119601060453451L;
			this.aLong257 = this.aLong256 * -2889434775780357133L + -3151976861435159332L;
		}
	}

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "(F)V", line = 85)
	public void method25378(@OriginalArg(0) float arg0) {
		if (this.anInterface25_1 == null) {
			this.aFloat254 = arg0;
			this.aFloat256 = this.aFloat257;
			this.aLong256 = Class176.method23413() * -551119601060453451L;
			this.aLong257 = this.aLong256 * -2889434775780357133L + -3151976861435159332L;
		}
	}

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "(F)V", line = 85)
	public void method25379(@OriginalArg(0) float arg0) {
		if (this.anInterface25_1 == null) {
			this.aFloat254 = arg0;
			this.aFloat256 = this.aFloat257;
			this.aLong256 = Class176.method23413() * -551119601060453451L;
			this.aLong257 = this.aLong256 * -2889434775780357133L + -3151976861435159332L;
		}
	}

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "(I)Lclient!kf;", line = 94)
	public Class275 method25361() {
		return this.aClass275_1;
	}

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "()Lclient!kf;", line = 94)
	public Class275 method25380() {
		return this.aClass275_1;
	}

	@OriginalMember(owner = "client!kf", name = "bl", descriptor = "(Lclient!vs;B)V", line = 4256)
	static final void method25381(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		Class109.method21947(local16, arg0);
	}

	@OriginalMember(owner = "client!kf", name = "lv", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6148)
	static final void method25382(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray38 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}
}

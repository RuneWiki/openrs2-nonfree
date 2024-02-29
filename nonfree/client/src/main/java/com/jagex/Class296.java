package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public class Class296 {

	@OriginalMember(owner = "client!he", name = "p", descriptor = "Lclient!aak;")
	Class12 aClass12_28;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "[Lclient!ajk;")
	Class77_Sub12[] aClass77_Sub12Array1;

	@OriginalMember(owner = "client!he", name = "v", descriptor = "Lclient!hx;")
	final Interface28 anInterface28_4;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(ILclient!hx;)V", line = 11)
	public Class296(@OriginalArg(0) int arg0, @OriginalArg(1) Interface28 arg1) {
		@Pc(3) int local3;
		for (local3 = 1; local3 < arg0; local3 += local3) {
		}
		this.aClass12_28 = new Class12(local3);
		this.aClass77_Sub12Array1 = new Class77_Sub12[local3];
		this.anInterface28_4 = arg1;
	}

	@OriginalMember(owner = "client!he", name = "p", descriptor = "(II)Lclient!ajk;", line = 20)
	public Class77_Sub12 method27037(@OriginalArg(0) int arg0) {
		return arg0 >= this.aClass77_Sub12Array1.length ? null : this.aClass77_Sub12Array1[arg0];
	}

	@OriginalMember(owner = "client!he", name = "w", descriptor = "(I)Lclient!ajk;", line = 20)
	public Class77_Sub12 method27038(@OriginalArg(0) int arg0) {
		return arg0 >= this.aClass77_Sub12Array1.length ? null : this.aClass77_Sub12Array1[arg0];
	}

	@OriginalMember(owner = "client!he", name = "y", descriptor = "(I)Lclient!ajk;", line = 20)
	public Class77_Sub12 method27039(@OriginalArg(0) int arg0) {
		return arg0 >= this.aClass77_Sub12Array1.length ? null : this.aClass77_Sub12Array1[arg0];
	}

	@OriginalMember(owner = "client!he", name = "t", descriptor = "(I)Lclient!ajk;", line = 20)
	public Class77_Sub12 method27040(@OriginalArg(0) int arg0) {
		return arg0 >= this.aClass77_Sub12Array1.length ? null : this.aClass77_Sub12Array1[arg0];
	}

	@OriginalMember(owner = "client!he", name = "x", descriptor = "(Ljava/lang/String;)Lclient!ajk;", line = 25)
	public Class77_Sub12 method27041(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = this.anInterface28_4.method27310(arg0);
		for (@Pc(11) Class77_Sub12 local11 = (Class77_Sub12) this.aClass12_28.method173(local5); local11 != null; local11 = (Class77_Sub12) this.aClass12_28.method176()) {
			if (local11.aString120.equals(arg0)) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(Ljava/lang/String;I)Lclient!ajk;", line = 25)
	public Class77_Sub12 method27042(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = this.anInterface28_4.method27310(arg0);
		for (@Pc(11) Class77_Sub12 local11 = (Class77_Sub12) this.aClass12_28.method173(local5); local11 != null; local11 = (Class77_Sub12) this.aClass12_28.method176()) {
			if (local11.aString120.equals(arg0)) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!he", name = "q", descriptor = "(Ljava/lang/String;)Lclient!ajk;", line = 25)
	public Class77_Sub12 method27043(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = this.anInterface28_4.method27310(arg0);
		for (@Pc(11) Class77_Sub12 local11 = (Class77_Sub12) this.aClass12_28.method173(local5); local11 != null; local11 = (Class77_Sub12) this.aClass12_28.method176()) {
			if (local11.aString120.equals(arg0)) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!he", name = "v", descriptor = "(IS)V", line = 35)
	void method27044(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub12 local4 = this.method27037(arg0);
		if (local4 != null) {
			local4.method24063();
			this.aClass77_Sub12Array1[local4.anInt3173 * 1639599971] = null;
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V", line = 35)
	void method27045(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub12 local4 = this.method27037(arg0);
		if (local4 != null) {
			local4.method24063();
			this.aClass77_Sub12Array1[local4.anInt3173 * 1639599971] = null;
		}
	}

	@OriginalMember(owner = "client!he", name = "l", descriptor = "(ILjava/lang/String;Lclient!ajk;I)V", line = 43)
	public void method27046(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class77_Sub12 arg2) {
		@Pc(4) Class77_Sub12 local4 = this.method27042(arg1);
		if (local4 != null && local4.anInt3173 * 1639599971 != arg0) {
			throw new IllegalArgumentException(arg1);
		}
		this.method27044(arg0);
		if (arg0 >= this.aClass77_Sub12Array1.length) {
			@Pc(30) int local30;
			for (local30 = this.aClass77_Sub12Array1.length; local30 <= arg0; local30 += local30) {
			}
			this.aClass12_28 = new Class12(local30);
			for (@Pc(46) int local46 = 0; local46 < this.aClass77_Sub12Array1.length; local46++) {
				@Pc(56) Class77_Sub12 local56 = this.aClass77_Sub12Array1[local46];
				if (local56 != null) {
					this.aClass12_28.method184(local56, local56.aLong229 * 8258869577519436579L);
				}
			}
			@Pc(72) Class77_Sub12[] local72 = new Class77_Sub12[local30];
			for (@Pc(74) int local74 = 0; local74 < this.aClass77_Sub12Array1.length; local74++) {
				local72[local74] = this.aClass77_Sub12Array1[local74];
			}
			this.aClass77_Sub12Array1 = local72;
		}
		arg2.anInt3173 = arg0 * 1769056843;
		arg2.aString120 = arg1;
		this.aClass12_28.method184(arg2, this.anInterface28_4.method27310(arg1));
		this.aClass77_Sub12Array1[arg0] = arg2;
	}

	@OriginalMember(owner = "client!he", name = "s", descriptor = "(ILjava/lang/String;Lclient!ajk;)V", line = 43)
	public void method27047(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class77_Sub12 arg2) {
		@Pc(4) Class77_Sub12 local4 = this.method27042(arg1);
		if (local4 != null && local4.anInt3173 * 1639599971 != arg0) {
			throw new IllegalArgumentException(arg1);
		}
		this.method27044(arg0);
		if (arg0 >= this.aClass77_Sub12Array1.length) {
			@Pc(30) int local30;
			for (local30 = this.aClass77_Sub12Array1.length; local30 <= arg0; local30 += local30) {
			}
			this.aClass12_28 = new Class12(local30);
			for (@Pc(46) int local46 = 0; local46 < this.aClass77_Sub12Array1.length; local46++) {
				@Pc(56) Class77_Sub12 local56 = this.aClass77_Sub12Array1[local46];
				if (local56 != null) {
					this.aClass12_28.method184(local56, local56.aLong229 * 8258869577519436579L);
				}
			}
			@Pc(72) Class77_Sub12[] local72 = new Class77_Sub12[local30];
			for (@Pc(74) int local74 = 0; local74 < this.aClass77_Sub12Array1.length; local74++) {
				local72[local74] = this.aClass77_Sub12Array1[local74];
			}
			this.aClass77_Sub12Array1 = local72;
		}
		arg2.anInt3173 = arg0 * 1769056843;
		arg2.aString120 = arg1;
		this.aClass12_28.method184(arg2, this.anInterface28_4.method27310(arg1));
		this.aClass77_Sub12Array1[arg0] = arg2;
	}

	@OriginalMember(owner = "client!he", name = "r", descriptor = "(ILjava/lang/String;Lclient!ajk;)V", line = 43)
	public void method27048(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class77_Sub12 arg2) {
		@Pc(4) Class77_Sub12 local4 = this.method27042(arg1);
		if (local4 != null && local4.anInt3173 * 1639599971 != arg0) {
			throw new IllegalArgumentException(arg1);
		}
		this.method27044(arg0);
		if (arg0 >= this.aClass77_Sub12Array1.length) {
			@Pc(30) int local30;
			for (local30 = this.aClass77_Sub12Array1.length; local30 <= arg0; local30 += local30) {
			}
			this.aClass12_28 = new Class12(local30);
			for (@Pc(46) int local46 = 0; local46 < this.aClass77_Sub12Array1.length; local46++) {
				@Pc(56) Class77_Sub12 local56 = this.aClass77_Sub12Array1[local46];
				if (local56 != null) {
					this.aClass12_28.method184(local56, local56.aLong229 * 8258869577519436579L);
				}
			}
			@Pc(72) Class77_Sub12[] local72 = new Class77_Sub12[local30];
			for (@Pc(74) int local74 = 0; local74 < this.aClass77_Sub12Array1.length; local74++) {
				local72[local74] = this.aClass77_Sub12Array1[local74];
			}
			this.aClass77_Sub12Array1 = local72;
		}
		arg2.anInt3173 = arg0 * 1769056843;
		arg2.aString120 = arg1;
		this.aClass12_28.method184(arg2, this.anInterface28_4.method27310(arg1));
		this.aClass77_Sub12Array1[arg0] = arg2;
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(ILjava/lang/String;Lclient!ajk;)V", line = 43)
	public void method27049(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class77_Sub12 arg2) {
		@Pc(4) Class77_Sub12 local4 = this.method27042(arg1);
		if (local4 != null && local4.anInt3173 * 1639599971 != arg0) {
			throw new IllegalArgumentException(arg1);
		}
		this.method27044(arg0);
		if (arg0 >= this.aClass77_Sub12Array1.length) {
			@Pc(30) int local30;
			for (local30 = this.aClass77_Sub12Array1.length; local30 <= arg0; local30 += local30) {
			}
			this.aClass12_28 = new Class12(local30);
			for (@Pc(46) int local46 = 0; local46 < this.aClass77_Sub12Array1.length; local46++) {
				@Pc(56) Class77_Sub12 local56 = this.aClass77_Sub12Array1[local46];
				if (local56 != null) {
					this.aClass12_28.method184(local56, local56.aLong229 * 8258869577519436579L);
				}
			}
			@Pc(72) Class77_Sub12[] local72 = new Class77_Sub12[local30];
			for (@Pc(74) int local74 = 0; local74 < this.aClass77_Sub12Array1.length; local74++) {
				local72[local74] = this.aClass77_Sub12Array1[local74];
			}
			this.aClass77_Sub12Array1 = local72;
		}
		arg2.anInt3173 = arg0 * 1769056843;
		arg2.aString120 = arg1;
		this.aClass12_28.method184(arg2, this.anInterface28_4.method27310(arg1));
		this.aClass77_Sub12Array1[arg0] = arg2;
	}

	@OriginalMember(owner = "client!he", name = "ao", descriptor = "(I)V", line = 934)
	public static void method27050() {
		Class402.method28504();
	}

	@OriginalMember(owner = "client!he", name = "ql", descriptor = "(Lclient!yf;I)V", line = 7514)
	static final void method27051(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3932 * 1797197351;
	}
}

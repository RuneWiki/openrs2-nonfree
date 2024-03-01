package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class161 {

	@OriginalMember(owner = "client!ew", name = "gy", descriptor = "Lclient!ny;")
	public static Class359 aClass359_35;

	@OriginalMember(owner = "client!ew", name = "cq", descriptor = "I")
	public static int anInt3445;

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "Lclient!en;")
	Interface14 anInterface14_1;

	@OriginalMember(owner = "client!ew", name = "l", descriptor = "Lclient!wc;")
	Class546 aClass546_13;

	@OriginalMember(owner = "client!ew", name = "p", descriptor = "I")
	int anInt3443;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
	int anInt3444;

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "Lclient!xn;")
	Class581 aClass581_25;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(I)V", line = 15)
	public Class161(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!ew", name = "p", descriptor = "(Lclient!en;I)V", line = 19)
	public void method23230(@OriginalArg(0) Interface14 arg0) {
		this.anInterface14_1 = arg0;
	}

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "(Lclient!en;)V", line = 19)
	public void method23231(@OriginalArg(0) Interface14 arg0) {
		this.anInterface14_1 = arg0;
	}

	@OriginalMember(owner = "client!ew", name = "r", descriptor = "(Lclient!en;)V", line = 19)
	public void method23232(@OriginalArg(0) Interface14 arg0) {
		this.anInterface14_1 = arg0;
	}

	@OriginalMember(owner = "client!ew", name = "p", descriptor = "([I[II)V", line = 19)
	public static void method23263(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Class548.anIntArray498 = null;
			Class548.anIntArray499 = null;
			Class548.aByteArrayArrayArray14 = null;
			return;
		}
		Class548.anIntArray498 = arg0;
		Class548.anIntArray499 = new int[arg0.length];
		Class548.aByteArrayArrayArray14 = new byte[arg0.length][][];
		for (@Pc(25) int local25 = 0; local25 < Class548.anIntArray498.length; local25++) {
			Class548.aByteArrayArrayArray14[local25] = new byte[arg1[local25]][];
		}
	}

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(II)V", line = 22)
	public Class161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass546_13 = new Class546();
		this.anInt3443 = arg0 * -1665784911;
		this.anInt3444 = arg0 * -619153799;
		@Pc(18) int local18;
		for (local18 = 1; local18 + local18 < arg0 && local18 < arg1; local18 += local18) {
		}
		this.aClass581_25 = new Class581(local18);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(J)Ljava/lang/Object;", line = 31)
	public Object method23219(@OriginalArg(0) long arg0) {
		@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33217(arg0);
		if (local5 == null) {
			return null;
		}
		@Pc(13) Object local13 = local5.method21132();
		if (local13 == null) {
			local5.method33656();
			local5.method33669();
			this.anInt3444 += local5.anInt2867 * -1003043645;
			return null;
		}
		if (local5.method21127()) {
			@Pc(46) Class3_Sub1_Sub10_Sub1 local46 = new Class3_Sub1_Sub10_Sub1(local13, local5.anInt2867 * 1922758171);
			this.aClass581_25.method33241(local46, local5.aLong296 * -1930649055099428229L);
			this.aClass546_13.method32621(local46);
			local46.aLong297 = 0L;
			local5.method33656();
			local5.method33669();
		} else {
			this.aClass546_13.method32621(local5);
			local5.aLong297 = 0L;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ew", name = "q", descriptor = "(J)Ljava/lang/Object;", line = 31)
	public Object method23227(@OriginalArg(0) long arg0) {
		@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33217(arg0);
		if (local5 == null) {
			return null;
		}
		@Pc(13) Object local13 = local5.method21132();
		if (local13 == null) {
			local5.method33656();
			local5.method33669();
			this.anInt3444 += local5.anInt2867 * -1003043645;
			return null;
		}
		if (local5.method21127()) {
			@Pc(46) Class3_Sub1_Sub10_Sub1 local46 = new Class3_Sub1_Sub10_Sub1(local13, local5.anInt2867 * 1922758171);
			this.aClass581_25.method33241(local46, local5.aLong296 * -1930649055099428229L);
			this.aClass546_13.method32621(local46);
			local46.aLong297 = 0L;
			local5.method33656();
			local5.method33669();
		} else {
			this.aClass546_13.method32621(local5);
			local5.aLong297 = 0L;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "(J)Ljava/lang/Object;", line = 31)
	public Object method23233(@OriginalArg(0) long arg0) {
		@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33217(arg0);
		if (local5 == null) {
			return null;
		}
		@Pc(13) Object local13 = local5.method21132();
		if (local13 == null) {
			local5.method33656();
			local5.method33669();
			this.anInt3444 += local5.anInt2867 * -1003043645;
			return null;
		}
		if (local5.method21127()) {
			@Pc(46) Class3_Sub1_Sub10_Sub1 local46 = new Class3_Sub1_Sub10_Sub1(local13, local5.anInt2867 * 1922758171);
			this.aClass581_25.method33241(local46, local5.aLong296 * -1930649055099428229L);
			this.aClass546_13.method32621(local46);
			local46.aLong297 = 0L;
			local5.method33656();
			local5.method33669();
		} else {
			this.aClass546_13.method32621(local5);
			local5.aLong297 = 0L;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "(J)V", line = 56)
	public void method23220(@OriginalArg(0) long arg0) {
		@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33217(arg0);
		this.method23221(local5);
	}

	@OriginalMember(owner = "client!ew", name = "v", descriptor = "(Lclient!amo;)V", line = 61)
	void method23218(@OriginalArg(0) Class3_Sub1_Sub10 arg0) {
		if (arg0 != null) {
			arg0.method33656();
			arg0.method33669();
			this.anInt3444 += arg0.anInt2867 * -1003043645;
		}
	}

	@OriginalMember(owner = "client!ew", name = "l", descriptor = "(Lclient!amo;B)V", line = 61)
	void method23221(@OriginalArg(0) Class3_Sub1_Sub10 arg0) {
		if (arg0 != null) {
			arg0.method33656();
			arg0.method33669();
			this.anInt3444 += arg0.anInt2867 * -1003043645;
		}
	}

	@OriginalMember(owner = "client!ew", name = "m", descriptor = "(Lclient!amo;)V", line = 61)
	void method23235(@OriginalArg(0) Class3_Sub1_Sub10 arg0) {
		if (arg0 != null) {
			arg0.method33656();
			arg0.method33669();
			this.anInt3444 += arg0.anInt2867 * -1003043645;
		}
	}

	@OriginalMember(owner = "client!ew", name = "t", descriptor = "(Lclient!amo;)V", line = 61)
	void method23237(@OriginalArg(0) Class3_Sub1_Sub10 arg0) {
		if (arg0 != null) {
			arg0.method33656();
			arg0.method33669();
			this.anInt3444 += arg0.anInt2867 * -1003043645;
		}
	}

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "(Ljava/lang/Object;J)V", line = 69)
	public void method23222(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method23239(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!ew", name = "o", descriptor = "(Ljava/lang/Object;J)V", line = 69)
	public void method23223(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method23239(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!ew", name = "w", descriptor = "(Ljava/lang/Object;J)V", line = 69)
	public void method23238(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method23239(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!ew", name = "x", descriptor = "(Ljava/lang/Object;JIB)V", line = 73)
	public void method23239(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt3443 * -289389231) {
			throw new IllegalStateException();
		}
		this.method23220(arg1);
		this.anInt3444 -= arg2 * -619153799;
		while (this.anInt3444 * 822088649 < 0) {
			@Pc(31) Class3_Sub1_Sub10 local31 = (Class3_Sub1_Sub10) this.aClass546_13.method32622();
			if (local31 == null) {
				throw new RuntimeException("");
			}
			if (!local31.method21127()) {
			}
			this.method23221(local31);
			if (this.anInterface14_1 != null) {
				this.anInterface14_1.method23054(local31.method21132());
			}
		}
		@Pc(65) Class3_Sub1_Sub10_Sub1 local65 = new Class3_Sub1_Sub10_Sub1(arg0, arg2);
		this.aClass581_25.method33241(local65, arg1);
		this.aClass546_13.method32621(local65);
		local65.aLong297 = 0L;
	}

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "(Ljava/lang/Object;JI)V", line = 73)
	public void method23247(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt3443 * -289389231) {
			throw new IllegalStateException();
		}
		this.method23220(arg1);
		this.anInt3444 -= arg2 * -619153799;
		while (this.anInt3444 * 822088649 < 0) {
			@Pc(31) Class3_Sub1_Sub10 local31 = (Class3_Sub1_Sub10) this.aClass546_13.method32622();
			if (local31 == null) {
				throw new RuntimeException("");
			}
			if (!local31.method21127()) {
			}
			this.method23221(local31);
			if (this.anInterface14_1 != null) {
				this.anInterface14_1.method23054(local31.method21132());
			}
		}
		@Pc(65) Class3_Sub1_Sub10_Sub1 local65 = new Class3_Sub1_Sub10_Sub1(arg0, arg2);
		this.aClass581_25.method33241(local65, arg1);
		this.aClass546_13.method32621(local65);
		local65.aLong297 = 0L;
	}

	@OriginalMember(owner = "client!ew", name = "ak", descriptor = "(I)V", line = 94)
	public void method23228(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32623(); local5 != null; local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32645()) {
			if (local5.method21127()) {
				if (local5.method21132() == null) {
					local5.method33656();
					local5.method33669();
					this.anInt3444 += local5.anInt2867 * -1003043645;
				}
			} else if ((local5.aLong297 += -2199417693621122125L) * -2884094411549009029L > (long) arg0) {
				@Pc(55) Class3_Sub1_Sub10_Sub2 local55 = new Class3_Sub1_Sub10_Sub2(local5.method21132(), local5.anInt2867 * 1922758171);
				this.aClass581_25.method33241(local55, local5.aLong296 * -1930649055099428229L);
				Class533.method32507(local55, local5);
				local5.method33656();
				local5.method33669();
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "s", descriptor = "(IB)V", line = 94)
	public void method23240(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32623(); local5 != null; local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32645()) {
			if (local5.method21127()) {
				if (local5.method21132() == null) {
					local5.method33656();
					local5.method33669();
					this.anInt3444 += local5.anInt2867 * -1003043645;
				}
			} else if ((local5.aLong297 += -2199417693621122125L) * -2884094411549009029L > (long) arg0) {
				@Pc(55) Class3_Sub1_Sub10_Sub2 local55 = new Class3_Sub1_Sub10_Sub2(local5.method21132(), local5.anInt2867 * 1922758171);
				this.aClass581_25.method33241(local55, local5.aLong296 * -1930649055099428229L);
				Class533.method32507(local55, local5);
				local5.method33656();
				local5.method33669();
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "(I)V", line = 94)
	public void method23241(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32623(); local5 != null; local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32645()) {
			if (local5.method21127()) {
				if (local5.method21132() == null) {
					local5.method33656();
					local5.method33669();
					this.anInt3444 += local5.anInt2867 * -1003043645;
				}
			} else if ((local5.aLong297 += -2199417693621122125L) * -2884094411549009029L > (long) arg0) {
				@Pc(55) Class3_Sub1_Sub10_Sub2 local55 = new Class3_Sub1_Sub10_Sub2(local5.method21132(), local5.anInt2867 * 1922758171);
				this.aClass581_25.method33241(local55, local5.aLong296 * -1930649055099428229L);
				Class533.method32507(local55, local5);
				local5.method33656();
				local5.method33669();
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "(I)V", line = 94)
	public void method23242(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32623(); local5 != null; local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32645()) {
			if (local5.method21127()) {
				if (local5.method21132() == null) {
					local5.method33656();
					local5.method33669();
					this.anInt3444 += local5.anInt2867 * -1003043645;
				}
			} else if ((local5.aLong297 += -2199417693621122125L) * -2884094411549009029L > (long) arg0) {
				@Pc(55) Class3_Sub1_Sub10_Sub2 local55 = new Class3_Sub1_Sub10_Sub2(local5.method21132(), local5.anInt2867 * 1922758171);
				this.aClass581_25.method33241(local55, local5.aLong296 * -1930649055099428229L);
				Class533.method32507(local55, local5);
				local5.method33656();
				local5.method33669();
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "at", descriptor = "(I)V", line = 94)
	public void method23243(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32623(); local5 != null; local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32645()) {
			if (local5.method21127()) {
				if (local5.method21132() == null) {
					local5.method33656();
					local5.method33669();
					this.anInt3444 += local5.anInt2867 * -1003043645;
				}
			} else if ((local5.aLong297 += -2199417693621122125L) * -2884094411549009029L > (long) arg0) {
				@Pc(55) Class3_Sub1_Sub10_Sub2 local55 = new Class3_Sub1_Sub10_Sub2(local5.method21132(), local5.anInt2867 * 1922758171);
				this.aClass581_25.method33241(local55, local5.aLong296 * -1930649055099428229L);
				Class533.method32507(local55, local5);
				local5.method33656();
				local5.method33669();
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "af", descriptor = "(I)V", line = 94)
	public void method23244(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32623(); local5 != null; local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32645()) {
			if (local5.method21127()) {
				if (local5.method21132() == null) {
					local5.method33656();
					local5.method33669();
					this.anInt3444 += local5.anInt2867 * -1003043645;
				}
			} else if ((local5.aLong297 += -2199417693621122125L) * -2884094411549009029L > (long) arg0) {
				@Pc(55) Class3_Sub1_Sub10_Sub2 local55 = new Class3_Sub1_Sub10_Sub2(local5.method21132(), local5.anInt2867 * 1922758171);
				this.aClass581_25.method33241(local55, local5.aLong296 * -1930649055099428229L);
				Class533.method32507(local55, local5);
				local5.method33656();
				local5.method33669();
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "u", descriptor = "(I)V", line = 116)
	public void method23224() {
		this.aClass546_13.method32620();
		this.aClass581_25.method33222();
		this.anInt3444 = this.anInt3443 * 1131157833;
	}

	@OriginalMember(owner = "client!ew", name = "ah", descriptor = "()V", line = 116)
	public void method23226() {
		this.aClass546_13.method32620();
		this.aClass581_25.method33222();
		this.anInt3444 = this.anInt3443 * 1131157833;
	}

	@OriginalMember(owner = "client!ew", name = "aa", descriptor = "()V", line = 116)
	public void method23246() {
		this.aClass546_13.method32620();
		this.aClass581_25.method33222();
		this.anInt3444 = this.anInt3443 * 1131157833;
	}

	@OriginalMember(owner = "client!ew", name = "y", descriptor = "(B)I", line = 122)
	public int method23225() {
		return this.anInt3443 * -289389231;
	}

	@OriginalMember(owner = "client!ew", name = "an", descriptor = "()I", line = 126)
	public int method23217() {
		return this.anInt3444 * 822088649;
	}

	@OriginalMember(owner = "client!ew", name = "aj", descriptor = "()I", line = 126)
	public int method23249() {
		return this.anInt3444 * 822088649;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)I", line = 126)
	public int method23257() {
		return this.anInt3444 * 822088649;
	}

	@OriginalMember(owner = "client!ew", name = "as", descriptor = "()I", line = 130)
	public int method23250() {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class3_Sub1_Sub10 local7 = (Class3_Sub1_Sub10) this.aClass546_13.method32623(); local7 != null; local7 = (Class3_Sub1_Sub10) this.aClass546_13.method32645()) {
			if (!local7.method21127()) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ew", name = "ai", descriptor = "()I", line = 130)
	public int method23251() {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class3_Sub1_Sub10 local7 = (Class3_Sub1_Sub10) this.aClass546_13.method32623(); local7 != null; local7 = (Class3_Sub1_Sub10) this.aClass546_13.method32645()) {
			if (!local7.method21127()) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)I", line = 130)
	public int method23254() {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class3_Sub1_Sub10 local7 = (Class3_Sub1_Sub10) this.aClass546_13.method32623(); local7 != null; local7 = (Class3_Sub1_Sub10) this.aClass546_13.method32645()) {
			if (!local7.method21127()) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ew", name = "z", descriptor = "(I)V", line = 138)
	public void method23245() {
		for (@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32623(); local5 != null; local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32645()) {
			if (local5.method21127()) {
				local5.method33656();
				local5.method33669();
				this.anInt3444 += local5.anInt2867 * -1003043645;
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "aq", descriptor = "()V", line = 138)
	public void method23252() {
		for (@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32623(); local5 != null; local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32645()) {
			if (local5.method21127()) {
				local5.method33656();
				local5.method33669();
				this.anInt3444 += local5.anInt2867 * -1003043645;
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "av", descriptor = "()V", line = 138)
	public void method23253() {
		for (@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32623(); local5 != null; local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32645()) {
			if (local5.method21127()) {
				local5.method33656();
				local5.method33669();
				this.anInt3444 += local5.anInt2867 * -1003043645;
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "ax", descriptor = "()V", line = 138)
	public void method23256() {
		for (@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32623(); local5 != null; local5 = (Class3_Sub1_Sub10) this.aClass546_13.method32645()) {
			if (local5.method21127()) {
				local5.method33656();
				local5.method33669();
				this.anInt3444 += local5.anInt2867 * -1003043645;
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "j", descriptor = "(B)Ljava/lang/Object;", line = 148)
	public Object method23229() {
		@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33221();
		while (local5 != null) {
			@Pc(11) Object local11 = local5.method21132();
			if (local11 != null) {
				return local11;
			}
			@Pc(16) Class3_Sub1_Sub10 local16 = local5;
			local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33231();
			local16.method33656();
			local16.method33669();
			this.anInt3444 += local16.anInt2867 * -1003043645;
		}
		return null;
	}

	@OriginalMember(owner = "client!ew", name = "al", descriptor = "()Ljava/lang/Object;", line = 148)
	public Object method23234() {
		@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33221();
		while (local5 != null) {
			@Pc(11) Object local11 = local5.method21132();
			if (local11 != null) {
				return local11;
			}
			@Pc(16) Class3_Sub1_Sub10 local16 = local5;
			local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33231();
			local16.method33656();
			local16.method33669();
			this.anInt3444 += local16.anInt2867 * -1003043645;
		}
		return null;
	}

	@OriginalMember(owner = "client!ew", name = "az", descriptor = "()Ljava/lang/Object;", line = 148)
	public Object method23255() {
		@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33221();
		while (local5 != null) {
			@Pc(11) Object local11 = local5.method21132();
			if (local11 != null) {
				return local11;
			}
			@Pc(16) Class3_Sub1_Sub10 local16 = local5;
			local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33231();
			local16.method33656();
			local16.method33669();
			this.anInt3444 += local16.anInt2867 * -1003043645;
		}
		return null;
	}

	@OriginalMember(owner = "client!ew", name = "ao", descriptor = "()Ljava/lang/Object;", line = 164)
	public Object method23236() {
		@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33231();
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method21132();
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class3_Sub1_Sub10 local17 = local5;
			local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33231();
			local17.method33656();
			local17.method33669();
			this.anInt3444 += local17.anInt2867 * -1003043645;
		}
		return null;
	}

	@OriginalMember(owner = "client!ew", name = "n", descriptor = "(B)Ljava/lang/Object;", line = 164)
	public Object method23248() {
		@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33231();
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method21132();
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class3_Sub1_Sub10 local17 = local5;
			local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33231();
			local17.method33656();
			local17.method33669();
			this.anInt3444 += local17.anInt2867 * -1003043645;
		}
		return null;
	}

	@OriginalMember(owner = "client!ew", name = "ap", descriptor = "()Ljava/lang/Object;", line = 164)
	public Object method23258() {
		@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33231();
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method21132();
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class3_Sub1_Sub10 local17 = local5;
			local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33231();
			local17.method33656();
			local17.method33669();
			this.anInt3444 += local17.anInt2867 * -1003043645;
		}
		return null;
	}

	@OriginalMember(owner = "client!ew", name = "ab", descriptor = "()Ljava/lang/Object;", line = 164)
	public Object method23259() {
		@Pc(5) Class3_Sub1_Sub10 local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33231();
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method21132();
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class3_Sub1_Sub10 local17 = local5;
			local5 = (Class3_Sub1_Sub10) this.aClass581_25.method33231();
			local17.method33656();
			local17.method33669();
			this.anInt3444 += local17.anInt2867 * -1003043645;
		}
		return null;
	}

	@OriginalMember(owner = "client!ew", name = "w", descriptor = "(I)V", line = 724)
	public static void method23260() {
		Class178.aClass186Array1 = new Class186[Class504.aClass359_93.method26683()];
		Class16.aBooleanArray3 = new boolean[Class504.aClass359_93.method26683()];
	}

	@OriginalMember(owner = "client!ew", name = "fi", descriptor = "(I)V", line = 2420)
	static final void method23267() {
		client.anInt3064 = -741970315;
		client.anInt3065 = 1500491188;
		Class223.aClass3_Sub41_17 = null;
		Class123.method22843();
	}

	@OriginalMember(owner = "client!ew", name = "ua", descriptor = "(Lclient!vs;B)V", line = 7794)
	static final void method23261(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class424.aClass165_1.method23325(local12);
	}

	@OriginalMember(owner = "client!ew", name = "yk", descriptor = "(Lclient!vs;I)V", line = 8469)
	static final void method23266(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.aString151 == null || local12 >= Class21_Sub1.anInt288 * 906110417) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class43_Sub2.aClass79Array1[local12].aString132;
		}
	}

	@OriginalMember(owner = "client!ew", name = "acs", descriptor = "(Lclient!vs;I)V", line = 9084)
	static final void method23265(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		@Pc(26) int local26 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(32) Class611 local32 = Class457.method28517(Class475.aClass359_86, local26, 0);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local32.method33582(local13, Class19_Sub1.aClass6Array10);
	}

	@OriginalMember(owner = "client!ew", name = "anu", descriptor = "(Lclient!vs;B)V", line = 11456)
	static final void method23262(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub8_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean606 = true;
	}

	@OriginalMember(owner = "client!ew", name = "mc", descriptor = "(IIIIIILjava/lang/String;I)V", line = 11773)
	public static void method23264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6) {
		@Pc(3) Class53_Sub4 local3 = new Class53_Sub4();
		local3.anInt1167 = arg0 * 1437424127;
		local3.anInt1164 = arg1 * 1926419561;
		local3.anInt1166 = arg2 * 1710373439;
		local3.anInt1168 = (client.anInt3034 + arg4) * -1467010681;
		local3.anInt1165 = arg3 * -722120545;
		local3.aString42 = arg6;
		local3.anInt1169 = arg5 * -713346409;
		client.aClass559_7.method32819(local3);
	}
}

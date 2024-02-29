package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adq")
public class Class77_Sub1_Sub3 extends Class77_Sub1 implements Interface12, Interface6 {

	@OriginalMember(owner = "client!adq", name = "z", descriptor = "I")
	static int anInt285;

	@OriginalMember(owner = "client!adq", name = "l", descriptor = "Lclient!aak;")
	Class12 aClass12_3;

	@OriginalMember(owner = "client!adq", name = "<init>", descriptor = "()V", line = 14)
	Class77_Sub1_Sub3() {
	}

	@OriginalMember(owner = "client!adq", name = "p", descriptor = "(Lclient!akv;B)V", line = 18)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method1751(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!adq", name = "v", descriptor = "(Lclient!akv;)V", line = 18)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method1751(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!adq", name = "y", descriptor = "(Lclient!akv;)V", line = 18)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method1751(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!adq", name = "l", descriptor = "(Lclient!akv;)V", line = 18)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method1751(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!adq", name = "q", descriptor = "(Lclient!akv;IB)V", line = 25)
	void method1751(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(6) int local6 = arg0.method22478();
		@Pc(13) int local13;
		if (this.aClass12_3 == null) {
			local13 = Class199.method25492(local6);
			this.aClass12_3 = new Class12(local13);
		}
		for (local13 = 0; local13 < local6; local13++) {
			@Pc(33) boolean local33 = arg0.method22478() == 1;
			@Pc(37) int local37 = arg0.method22492();
			@Pc(46) Class77 local46;
			if (local33) {
				local46 = new Class77_Sub6(arg0.method22523());
			} else {
				local46 = new Class77_Sub40(arg0.method22500());
			}
			this.aClass12_3.method184(local46, (long) local37);
		}
	}

	@OriginalMember(owner = "client!adq", name = "j", descriptor = "(Lclient!akv;I)V", line = 25)
	void method1752(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(6) int local6 = arg0.method22478();
		@Pc(13) int local13;
		if (this.aClass12_3 == null) {
			local13 = Class199.method25492(local6);
			this.aClass12_3 = new Class12(local13);
		}
		for (local13 = 0; local13 < local6; local13++) {
			@Pc(33) boolean local33 = arg0.method22478() == 1;
			@Pc(37) int local37 = arg0.method22492();
			@Pc(46) Class77 local46;
			if (local33) {
				local46 = new Class77_Sub6(arg0.method22523());
			} else {
				local46 = new Class77_Sub40(arg0.method22500());
			}
			this.aClass12_3.method184(local46, (long) local37);
		}
	}

	@OriginalMember(owner = "client!adq", name = "r", descriptor = "(Lclient!akv;I)V", line = 25)
	void method1753(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(6) int local6 = arg0.method22478();
		@Pc(13) int local13;
		if (this.aClass12_3 == null) {
			local13 = Class199.method25492(local6);
			this.aClass12_3 = new Class12(local13);
		}
		for (local13 = 0; local13 < local6; local13++) {
			@Pc(33) boolean local33 = arg0.method22478() == 1;
			@Pc(37) int local37 = arg0.method22492();
			@Pc(46) Class77 local46;
			if (local33) {
				local46 = new Class77_Sub6(arg0.method22523());
			} else {
				local46 = new Class77_Sub40(arg0.method22500());
			}
			this.aClass12_3.method184(local46, (long) local37);
		}
	}

	@OriginalMember(owner = "client!adq", name = "d", descriptor = "(IIB)I", line = 44)
	public int method1754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass12_3 == null) {
			return arg1;
		} else {
			@Pc(12) Class77_Sub40 local12 = (Class77_Sub40) this.aClass12_3.method173((long) arg0);
			return local12 == null ? arg1 : local12.anInt1786 * -705967177;
		}
	}

	@OriginalMember(owner = "client!adq", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 51)
	public String method1755(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass12_3 == null) {
			return arg1;
		} else {
			@Pc(11) Class77_Sub6 local11 = (Class77_Sub6) this.aClass12_3.method173((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject5;
		}
	}

	@OriginalMember(owner = "client!adq", name = "n", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 51)
	public String method1756(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass12_3 == null) {
			return arg1;
		} else {
			@Pc(11) Class77_Sub6 local11 = (Class77_Sub6) this.aClass12_3.method173((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject5;
		}
	}

	@OriginalMember(owner = "client!adq", name = "s", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 51)
	public String method1757(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass12_3 == null) {
			return arg1;
		} else {
			@Pc(11) Class77_Sub6 local11 = (Class77_Sub6) this.aClass12_3.method173((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject5;
		}
	}

	@OriginalMember(owner = "client!adq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 51)
	public String method1758(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass12_3 == null) {
			return arg1;
		} else {
			@Pc(11) Class77_Sub6 local11 = (Class77_Sub6) this.aClass12_3.method173((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject5;
		}
	}

	@OriginalMember(owner = "client!adq", name = "m", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 51)
	public String method1759(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass12_3 == null) {
			return arg1;
		} else {
			@Pc(11) Class77_Sub6 local11 = (Class77_Sub6) this.aClass12_3.method173((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject5;
		}
	}

	@OriginalMember(owner = "client!adq", name = "x", descriptor = "(II)V", line = 57)
	@Override
	public void method32874(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adq", name = "g", descriptor = "(I)V", line = 57)
	@Override
	public void method32873(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adq", name = "z", descriptor = "(I)V", line = 57)
	@Override
	public void method32872(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adq", name = "c", descriptor = "(I)V", line = 58)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!adq", name = "w", descriptor = "()V", line = 58)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!adq", name = "t", descriptor = "()V", line = 58)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!adq", name = "w", descriptor = "(I)Lclient!alh;", line = 95)
	public static Class145_Sub1 method1760() {
		Class8.anInt29 = 0;
		return Class504.method24848();
	}

	@OriginalMember(owner = "client!adq", name = "alv", descriptor = "(Lclient!yf;I)V", line = 11534)
	static final void method1761(@OriginalArg(0) Class665 arg0) {
		Class622.method32435(arg0, arg0.aClass104_Sub1_Sub1_Sub1_4);
	}
}

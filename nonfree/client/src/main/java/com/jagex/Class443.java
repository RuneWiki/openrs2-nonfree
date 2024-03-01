package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public class Class443 {

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "I")
	public static final int anInt4940 = 1;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
	public static final int anInt4941 = -1;

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "I")
	static final int anInt4944 = 70;

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
	static final int anInt4946 = 16777215;

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
	public static final int anInt4955 = 0;

	@OriginalMember(owner = "client!rv", name = "th", descriptor = "J")
	static long aLong271;

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "Lclient!ss;")
	Class465 aClass465_2;

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "Z")
	public boolean aBoolean767 = false;

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "I")
	public int anInt4945 = 1798685567;

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
	public int anInt4942 = 710002155;

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
	public int anInt4947 = -2143539598;

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
	int anInt4948 = -520649355;

	@OriginalMember(owner = "client!rv", name = "z", descriptor = "I")
	int anInt4949 = 2045831241;

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
	int anInt4950 = -1194325957;

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
	int anInt4951 = -865132891;

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
	public int anInt4952 = 0;

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "I")
	public int anInt4953 = 0;

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
	public int anInt4943 = 865854537;

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "Ljava/lang/String;")
	String aString223 = "";

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
	public int anInt4954 = -1089637441;

	@OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
	public int anInt4956 = 0;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "()V", line = 30)
	Class443() {
	}

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "(Lclient!ahb;I)V", line = 34)
	void method28255(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method28271(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "(Lclient!ahb;)V", line = 34)
	void method28269(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method28271(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Lclient!ahb;I)V", line = 41)
	void method28254(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4945 = arg0.method20375() * -1798685567;
		} else if (arg1 == 2) {
			this.anInt4942 = arg0.method20273() * -357680619;
			this.aBoolean767 = true;
		} else if (arg1 == 3) {
			this.anInt4948 = arg0.method20375() * 520649355;
		} else if (arg1 == 4) {
			this.anInt4950 = arg0.method20375() * 1194325957;
		} else if (arg1 == 5) {
			this.anInt4949 = arg0.method20375() * -2045831241;
		} else if (arg1 == 6) {
			this.anInt4951 = arg0.method20375() * 865132891;
		} else if (arg1 == 7) {
			this.anInt4952 = arg0.method20272() * -386665369;
		} else if (arg1 == 8) {
			this.aString223 = arg0.method20284();
		} else if (arg1 == 9) {
			this.anInt4947 = arg0.method20271() * -1687252237;
		} else if (arg1 == 10) {
			this.anInt4953 = arg0.method20272() * 1158953387;
		} else if (arg1 == 11) {
			this.anInt4943 = 0;
		} else if (arg1 == 12) {
			this.anInt4954 = arg0.method20269() * 1089637441;
		} else if (arg1 == 13) {
			this.anInt4956 = arg0.method20272() * -926342069;
		} else if (arg1 == 14) {
			this.anInt4943 = arg0.method20271() * -865854537;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!ahb;II)V", line = 41)
	void method28271(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4945 = arg0.method20375() * -1798685567;
		} else if (arg1 == 2) {
			this.anInt4942 = arg0.method20273() * -357680619;
			this.aBoolean767 = true;
		} else if (arg1 == 3) {
			this.anInt4948 = arg0.method20375() * 520649355;
		} else if (arg1 == 4) {
			this.anInt4950 = arg0.method20375() * 1194325957;
		} else if (arg1 == 5) {
			this.anInt4949 = arg0.method20375() * -2045831241;
		} else if (arg1 == 6) {
			this.anInt4951 = arg0.method20375() * 865132891;
		} else if (arg1 == 7) {
			this.anInt4952 = arg0.method20272() * -386665369;
		} else if (arg1 == 8) {
			this.aString223 = arg0.method20284();
		} else if (arg1 == 9) {
			this.anInt4947 = arg0.method20271() * -1687252237;
		} else if (arg1 == 10) {
			this.anInt4953 = arg0.method20272() * 1158953387;
		} else if (arg1 == 11) {
			this.anInt4943 = 0;
		} else if (arg1 == 12) {
			this.anInt4954 = arg0.method20269() * 1089637441;
		} else if (arg1 == 13) {
			this.anInt4956 = arg0.method20272() * -926342069;
		} else if (arg1 == 14) {
			this.anInt4943 = arg0.method20271() * -865854537;
		}
	}

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "(IB)Ljava/lang/String;", line = 62)
	public String method28257(@OriginalArg(0) int arg0) {
		@Pc(2) String local2 = this.aString223;
		while (true) {
			@Pc(6) int local6 = local2.indexOf("%1");
			if (local6 < 0) {
				return local2;
			}
			local2 = local2.substring(0, local6) + Class301.method25662(arg0, false) + local2.substring(local6 + 2);
		}
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)Ljava/lang/String;", line = 62)
	public String method28264(@OriginalArg(0) int arg0) {
		@Pc(2) String local2 = this.aString223;
		while (true) {
			@Pc(6) int local6 = local2.indexOf("%1");
			if (local6 < 0) {
				return local2;
			}
			local2 = local2.substring(0, local6) + Class301.method25662(arg0, false) + local2.substring(local6 + 2);
		}
	}

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "(Lclient!de;I)Lclient!co;", line = 72)
	public Class6 method28258(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4948 * 1913691427 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4948 * 1913691427));
		if (local17 == null) {
			this.method28262(arg0);
			local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4948 * 1913691427));
		}
		return local17;
	}

	@OriginalMember(owner = "client!rv", name = "z", descriptor = "(Lclient!de;)Lclient!co;", line = 72)
	public Class6 method28266(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4948 * 1913691427 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4948 * 1913691427));
		if (local17 == null) {
			this.method28262(arg0);
			local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4948 * 1913691427));
		}
		return local17;
	}

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "(Lclient!de;)Lclient!co;", line = 72)
	public Class6 method28267(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4948 * 1913691427 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4948 * 1913691427));
		if (local17 == null) {
			this.method28262(arg0);
			local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4948 * 1913691427));
		}
		return local17;
	}

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "(Lclient!de;)Lclient!co;", line = 82)
	public Class6 method28256(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4949 * 345536007 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4949 * 345536007));
		if (local17 == null) {
			this.method28262(arg0);
			local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4949 * 345536007));
		}
		return local17;
	}

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "(Lclient!de;I)Lclient!co;", line = 82)
	public Class6 method28259(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4949 * 345536007 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4949 * 345536007));
		if (local17 == null) {
			this.method28262(arg0);
			local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4949 * 345536007));
		}
		return local17;
	}

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "(Lclient!de;)Lclient!co;", line = 82)
	public Class6 method28263(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4949 * 345536007 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4949 * 345536007));
		if (local17 == null) {
			this.method28262(arg0);
			local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4949 * 345536007));
		}
		return local17;
	}

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "(Lclient!de;)Lclient!co;", line = 82)
	public Class6 method28265(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4949 * 345536007 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4949 * 345536007));
		if (local17 == null) {
			this.method28262(arg0);
			local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4949 * 345536007));
		}
		return local17;
	}

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "(Lclient!de;I)Lclient!co;", line = 92)
	public Class6 method28260(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4950 * 1572499213 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4950 * 1572499213));
		if (local17 == null) {
			this.method28262(arg0);
			local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4950 * 1572499213));
		}
		return local17;
	}

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "(Lclient!de;)Lclient!co;", line = 92)
	public Class6 method28268(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4950 * 1572499213 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4950 * 1572499213));
		if (local17 == null) {
			this.method28262(arg0);
			local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4950 * 1572499213));
		}
		return local17;
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(Lclient!de;)Lclient!co;", line = 92)
	public Class6 method28270(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4950 * 1572499213 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4950 * 1572499213));
		if (local17 == null) {
			this.method28262(arg0);
			local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4950 * 1572499213));
		}
		return local17;
	}

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "(Lclient!de;)Lclient!co;", line = 92)
	public Class6 method28272(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4950 * 1572499213 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4950 * 1572499213));
		if (local17 == null) {
			this.method28262(arg0);
			local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4950 * 1572499213));
		}
		return local17;
	}

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "(Lclient!de;I)Lclient!co;", line = 102)
	public Class6 method28261(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4951 * 1327785683 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4951 * 1327785683));
		if (local17 == null) {
			this.method28262(arg0);
			local17 = (Class6) this.aClass465_2.aClass161_50.method23219((long) (this.anInt4951 * 1327785683));
		}
		return local17;
	}

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "(Lclient!de;I)V", line = 112)
	void method28262(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class359 local3 = this.aClass465_2.aClass359_84;
		@Pc(33) Class15 local33;
		if (this.anInt4948 * 1913691427 >= 0 && this.aClass465_2.aClass161_50.method23219((long) (this.anInt4948 * 1913691427)) == null && local3.method26674(this.anInt4948 * 1913691427)) {
			local33 = Class137.method22937(local3, this.anInt4948 * 1913691427);
			this.aClass465_2.aClass161_50.method23222(arg0.method17089(local33, true), (long) (this.anInt4948 * 1913691427));
		}
		if (this.anInt4949 * 345536007 >= 0 && this.aClass465_2.aClass161_50.method23219((long) (this.anInt4949 * 345536007)) == null && local3.method26674(this.anInt4949 * 345536007)) {
			local33 = Class137.method22937(local3, this.anInt4949 * 345536007);
			this.aClass465_2.aClass161_50.method23222(arg0.method17089(local33, true), (long) (this.anInt4949 * 345536007));
		}
		if (this.anInt4950 * 1572499213 >= 0 && this.aClass465_2.aClass161_50.method23219((long) (this.anInt4950 * 1572499213)) == null && local3.method26674(this.anInt4950 * 1572499213)) {
			local33 = Class137.method22937(local3, this.anInt4950 * 1572499213);
			this.aClass465_2.aClass161_50.method23222(arg0.method17089(local33, true), (long) (this.anInt4950 * 1572499213));
		}
		if (this.anInt4951 * 1327785683 >= 0 && this.aClass465_2.aClass161_50.method23219((long) (this.anInt4951 * 1327785683)) == null && local3.method26674(this.anInt4951 * 1327785683)) {
			local33 = Class137.method22937(local3, this.anInt4951 * 1327785683);
			this.aClass465_2.aClass161_50.method23222(arg0.method17089(local33, true), (long) (this.anInt4951 * 1327785683));
		}
	}

	@OriginalMember(owner = "client!rv", name = "v", descriptor = "(Lclient!de;)V", line = 112)
	void method28273(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class359 local3 = this.aClass465_2.aClass359_84;
		@Pc(33) Class15 local33;
		if (this.anInt4948 * 1913691427 >= 0 && this.aClass465_2.aClass161_50.method23219((long) (this.anInt4948 * 1913691427)) == null && local3.method26674(this.anInt4948 * 1913691427)) {
			local33 = Class137.method22937(local3, this.anInt4948 * 1913691427);
			this.aClass465_2.aClass161_50.method23222(arg0.method17089(local33, true), (long) (this.anInt4948 * 1913691427));
		}
		if (this.anInt4949 * 345536007 >= 0 && this.aClass465_2.aClass161_50.method23219((long) (this.anInt4949 * 345536007)) == null && local3.method26674(this.anInt4949 * 345536007)) {
			local33 = Class137.method22937(local3, this.anInt4949 * 345536007);
			this.aClass465_2.aClass161_50.method23222(arg0.method17089(local33, true), (long) (this.anInt4949 * 345536007));
		}
		if (this.anInt4950 * 1572499213 >= 0 && this.aClass465_2.aClass161_50.method23219((long) (this.anInt4950 * 1572499213)) == null && local3.method26674(this.anInt4950 * 1572499213)) {
			local33 = Class137.method22937(local3, this.anInt4950 * 1572499213);
			this.aClass465_2.aClass161_50.method23222(arg0.method17089(local33, true), (long) (this.anInt4950 * 1572499213));
		}
		if (this.anInt4951 * 1327785683 >= 0 && this.aClass465_2.aClass161_50.method23219((long) (this.anInt4951 * 1327785683)) == null && local3.method26674(this.anInt4951 * 1327785683)) {
			local33 = Class137.method22937(local3, this.anInt4951 * 1327785683);
			this.aClass465_2.aClass161_50.method23222(arg0.method17089(local33, true), (long) (this.anInt4951 * 1327785683));
		}
	}

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "(Lclient!de;)V", line = 112)
	void method28274(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class359 local3 = this.aClass465_2.aClass359_84;
		@Pc(33) Class15 local33;
		if (this.anInt4948 * 1913691427 >= 0 && this.aClass465_2.aClass161_50.method23219((long) (this.anInt4948 * 1913691427)) == null && local3.method26674(this.anInt4948 * 1913691427)) {
			local33 = Class137.method22937(local3, this.anInt4948 * 1913691427);
			this.aClass465_2.aClass161_50.method23222(arg0.method17089(local33, true), (long) (this.anInt4948 * 1913691427));
		}
		if (this.anInt4949 * 345536007 >= 0 && this.aClass465_2.aClass161_50.method23219((long) (this.anInt4949 * 345536007)) == null && local3.method26674(this.anInt4949 * 345536007)) {
			local33 = Class137.method22937(local3, this.anInt4949 * 345536007);
			this.aClass465_2.aClass161_50.method23222(arg0.method17089(local33, true), (long) (this.anInt4949 * 345536007));
		}
		if (this.anInt4950 * 1572499213 >= 0 && this.aClass465_2.aClass161_50.method23219((long) (this.anInt4950 * 1572499213)) == null && local3.method26674(this.anInt4950 * 1572499213)) {
			local33 = Class137.method22937(local3, this.anInt4950 * 1572499213);
			this.aClass465_2.aClass161_50.method23222(arg0.method17089(local33, true), (long) (this.anInt4950 * 1572499213));
		}
		if (this.anInt4951 * 1327785683 >= 0 && this.aClass465_2.aClass161_50.method23219((long) (this.anInt4951 * 1327785683)) == null && local3.method26674(this.anInt4951 * 1327785683)) {
			local33 = Class137.method22937(local3, this.anInt4951 * 1327785683);
			this.aClass465_2.aClass161_50.method23222(arg0.method17089(local33, true), (long) (this.anInt4951 * 1327785683));
		}
	}
}

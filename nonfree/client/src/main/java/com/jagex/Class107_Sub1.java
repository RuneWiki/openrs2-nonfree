package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agn")
public class Class107_Sub1 extends Class107 {

	@OriginalMember(owner = "client!agn", name = "og", descriptor = "Z")
	public static boolean aBoolean193;

	@OriginalMember(owner = "client!agn", name = "fz", descriptor = "Lclient!pw;")
	public static Class478 aClass478_28;

	@OriginalMember(owner = "client!agn", name = "av", descriptor = "I")
	int anInt1044 = 0;

	@OriginalMember(owner = "client!agn", name = "<init>", descriptor = "(Lclient!ij;)V", line = 26)
	public Class107_Sub1(@OriginalArg(0) Interface29 arg0) {
		super(Class335.aClass335_3, arg0);
	}

	@OriginalMember(owner = "client!agn", name = "fm", descriptor = "(I)I", line = 30)
	public int method8934() {
		this.anInt1044 += -1538640795;
		if (this.anInt1044 * 1987272045 == 126) {
			this.anInt1044 = 0;
		}
		return this.anInt1044 * 1987272045;
	}

	@OriginalMember(owner = "client!agn", name = "ft", descriptor = "()I", line = 30)
	public int method8935() {
		this.anInt1044 += -1538640795;
		if (this.anInt1044 * 1987272045 == 126) {
			this.anInt1044 = 0;
		}
		return this.anInt1044 * 1987272045;
	}

	@OriginalMember(owner = "client!agn", name = "fk", descriptor = "()I", line = 30)
	public int method8936() {
		this.anInt1044 += -1538640795;
		if (this.anInt1044 * 1987272045 == 126) {
			this.anInt1044 = 0;
		}
		return this.anInt1044 * 1987272045;
	}

	@OriginalMember(owner = "client!agn", name = "fw", descriptor = "()I", line = 30)
	public int method8937() {
		this.anInt1044 += -1538640795;
		if (this.anInt1044 * 1987272045 == 126) {
			this.anInt1044 = 0;
		}
		return this.anInt1044 * 1987272045;
	}

	@OriginalMember(owner = "client!agn", name = "fe", descriptor = "()I", line = 30)
	public int method8938() {
		this.anInt1044 += -1538640795;
		if (this.anInt1044 * 1987272045 == 126) {
			this.anInt1044 = 0;
		}
		return this.anInt1044 * 1987272045;
	}

	@OriginalMember(owner = "client!agn", name = "fi", descriptor = "(Lclient!akv;I)V", line = 36)
	public void method8939(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.anInt3089 * 31645619;
		@Pc(8) int local8 = arg0.method22478();
		this.method8784(Class277.method26575(local8 & 0x1));
		if ((local8 & 0x8) != 0) {
			@Pc(26) Class321 local26 = Class285.method26719(arg0.method22478());
			if (local26 != this.aClass321_2) {
				try {
					this.method8787(local26, true);
				} catch (@Pc(38) Exception_Sub2 local38) {
					local38.printStackTrace();
				}
			}
		}
		if ((local8 & 0x10) != 0) {
			@Pc(50) Class331 local50 = Class246.method26126(arg0.method22478());
			if (this.aClass331_2 != local50) {
				try {
					this.method8788(local50, true);
				} catch (@Pc(62) Exception_Sub2 local62) {
					local62.printStackTrace();
				}
			}
		}
		if ((local8 >> 7 & 0x1) == 1) {
			@Pc(75) int local75 = arg0.method22483();
			if ((local75 >> Class317.aClass317_12.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass447_10.method29131(arg0);
			}
			if ((local75 >> Class317.aClass317_2.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass447_12.method29131(arg0);
			}
			if ((local75 >> Class317.aClass317_3.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass447_13.method29131(arg0);
			}
			if ((local75 >> Class317.aClass317_4.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass447_11.method29131(arg0);
			}
			if ((local75 >> Class317.aClass317_5.anInt4070 * 269920571 & 0x1) == 1) {
				this.aFloat114 = arg0.method22517();
				this.aFloat103 = arg0.method22517();
			}
			if ((local75 >> Class317.aClass317_1.anInt4070 * 269920571 & 0x1) == 1) {
				this.aFloat104 = arg0.method22517();
				this.aFloat116 = arg0.method22517();
			}
			if ((local75 >> Class317.aClass317_7.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass336_2 = Class92.method23485(arg0.method22478());
			}
			if ((local75 >> Class317.aClass317_8.anInt4070 * 269920571 & 0x1) == 1) {
				this.anInt1040 = arg0.method22492() * 2095297221;
				arg0.method22478();
			}
			@Pc(223) int local223;
			if ((local75 >> Class317.aClass317_13.anInt4070 * 269920571 & 0x1) == 1) {
				local223 = arg0.method22478();
				this.aBoolean191 = (local223 & 0x1) == 1;
				this.aBoolean192 = (local223 & 0x2) == 2;
			}
			if ((local75 >> Class317.aClass317_10.anInt4070 * 269920571 & 0x1) == 1) {
				local223 = arg0.method22478();
				for (@Pc(259) int local259 = 0; local259 < local223; local259++) {
					@Pc(266) int local266 = arg0.method22478();
					@Pc(270) int local270 = arg0.method22478();
					if (local266 == 0) {
						this.method8853(local270);
					} else {
						@Pc(284) Class301 local284 = Class488.method29992(arg0.method22478());
						@Pc(286) boolean local286 = true;
						@Pc(290) Iterator local290 = this.aClass12_7.iterator();
						while (local290.hasNext()) {
							@Pc(297) Class77_Sub1_Sub12 local297 = (Class77_Sub1_Sub12) local290.next();
							if (local270 == local297.anInt3212 * -997430305) {
								local297.method24014(arg0);
								local286 = false;
								break;
							}
						}
						if (local286) {
							this.method8846(Class310.method27277(local270, local284, arg0));
						}
					}
				}
			}
			if ((local75 >> Class317.aClass317_9.anInt4070 * 269920571 & 0x1) == 1) {
				this.anInt1043 = arg0.method22483() * 695781827;
				this.aFloat109 = arg0.method22517();
			}
			if ((local75 >> Class317.aClass317_11.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass330_2 = Class152.method17432(arg0.method22478());
			}
			if ((local75 >> Class317.aClass317_14.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass447_14.method29131(arg0);
				this.aClass447_15.method29131(arg0);
				this.aFloat112 = arg0.method22517();
				this.aFloat113 = arg0.method22517();
			}
			if ((local75 >> Class317.aClass317_6.anInt4070 * 269920571 & 0x1) == 1) {
				arg0.method22517();
			}
			if ((local75 >> Class317.aClass317_15.anInt4070 * 269920571 & 0x1) == 1) {
				this.aFloat105 = arg0.method22517();
			}
		}
		if (this.aClass149_2 != null && (local8 >> 5 & 0x1) == 1) {
			this.aClass149_2.method23152(arg0);
		}
		if (this.aClass115_2 != null && (local8 >> 6 & 0x1) == 1) {
			this.aClass115_2.method21224(arg0);
		}
		if (arg1 != arg0.anInt3089 * 31645619 - local4) {
			throw new RuntimeException(arg0.anInt3089 * 31645619 - local4 + "," + arg1);
		}
	}

	@OriginalMember(owner = "client!agn", name = "fl", descriptor = "(Lclient!akv;II)V", line = 36)
	public void method8940(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.anInt3089 * 31645619;
		@Pc(8) int local8 = arg0.method22478();
		this.method8784(Class277.method26575(local8 & 0x1));
		if ((local8 & 0x8) != 0) {
			@Pc(26) Class321 local26 = Class285.method26719(arg0.method22478());
			if (local26 != this.aClass321_2) {
				try {
					this.method8787(local26, true);
				} catch (@Pc(38) Exception_Sub2 local38) {
					local38.printStackTrace();
				}
			}
		}
		if ((local8 & 0x10) != 0) {
			@Pc(50) Class331 local50 = Class246.method26126(arg0.method22478());
			if (this.aClass331_2 != local50) {
				try {
					this.method8788(local50, true);
				} catch (@Pc(62) Exception_Sub2 local62) {
					local62.printStackTrace();
				}
			}
		}
		if ((local8 >> 7 & 0x1) == 1) {
			@Pc(75) int local75 = arg0.method22483();
			if ((local75 >> Class317.aClass317_12.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass447_10.method29131(arg0);
			}
			if ((local75 >> Class317.aClass317_2.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass447_12.method29131(arg0);
			}
			if ((local75 >> Class317.aClass317_3.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass447_13.method29131(arg0);
			}
			if ((local75 >> Class317.aClass317_4.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass447_11.method29131(arg0);
			}
			if ((local75 >> Class317.aClass317_5.anInt4070 * 269920571 & 0x1) == 1) {
				this.aFloat114 = arg0.method22517();
				this.aFloat103 = arg0.method22517();
			}
			if ((local75 >> Class317.aClass317_1.anInt4070 * 269920571 & 0x1) == 1) {
				this.aFloat104 = arg0.method22517();
				this.aFloat116 = arg0.method22517();
			}
			if ((local75 >> Class317.aClass317_7.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass336_2 = Class92.method23485(arg0.method22478());
			}
			if ((local75 >> Class317.aClass317_8.anInt4070 * 269920571 & 0x1) == 1) {
				this.anInt1040 = arg0.method22492() * 2095297221;
				arg0.method22478();
			}
			@Pc(223) int local223;
			if ((local75 >> Class317.aClass317_13.anInt4070 * 269920571 & 0x1) == 1) {
				local223 = arg0.method22478();
				this.aBoolean191 = (local223 & 0x1) == 1;
				this.aBoolean192 = (local223 & 0x2) == 2;
			}
			if ((local75 >> Class317.aClass317_10.anInt4070 * 269920571 & 0x1) == 1) {
				local223 = arg0.method22478();
				for (@Pc(259) int local259 = 0; local259 < local223; local259++) {
					@Pc(266) int local266 = arg0.method22478();
					@Pc(270) int local270 = arg0.method22478();
					if (local266 == 0) {
						this.method8853(local270);
					} else {
						@Pc(284) Class301 local284 = Class488.method29992(arg0.method22478());
						@Pc(286) boolean local286 = true;
						@Pc(290) Iterator local290 = this.aClass12_7.iterator();
						while (local290.hasNext()) {
							@Pc(297) Class77_Sub1_Sub12 local297 = (Class77_Sub1_Sub12) local290.next();
							if (local270 == local297.anInt3212 * -997430305) {
								local297.method24014(arg0);
								local286 = false;
								break;
							}
						}
						if (local286) {
							this.method8846(Class310.method27277(local270, local284, arg0));
						}
					}
				}
			}
			if ((local75 >> Class317.aClass317_9.anInt4070 * 269920571 & 0x1) == 1) {
				this.anInt1043 = arg0.method22483() * 695781827;
				this.aFloat109 = arg0.method22517();
			}
			if ((local75 >> Class317.aClass317_11.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass330_2 = Class152.method17432(arg0.method22478());
			}
			if ((local75 >> Class317.aClass317_14.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass447_14.method29131(arg0);
				this.aClass447_15.method29131(arg0);
				this.aFloat112 = arg0.method22517();
				this.aFloat113 = arg0.method22517();
			}
			if ((local75 >> Class317.aClass317_6.anInt4070 * 269920571 & 0x1) == 1) {
				arg0.method22517();
			}
			if ((local75 >> Class317.aClass317_15.anInt4070 * 269920571 & 0x1) == 1) {
				this.aFloat105 = arg0.method22517();
			}
		}
		if (this.aClass149_2 != null && (local8 >> 5 & 0x1) == 1) {
			this.aClass149_2.method23152(arg0);
		}
		if (this.aClass115_2 != null && (local8 >> 6 & 0x1) == 1) {
			this.aClass115_2.method21224(arg0);
		}
		if (arg1 != arg0.anInt3089 * 31645619 - local4) {
			throw new RuntimeException(arg0.anInt3089 * 31645619 - local4 + "," + arg1);
		}
	}

	@OriginalMember(owner = "client!agn", name = "fz", descriptor = "(Lclient!akv;I)V", line = 36)
	public void method8941(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.anInt3089 * 31645619;
		@Pc(8) int local8 = arg0.method22478();
		this.method8784(Class277.method26575(local8 & 0x1));
		if ((local8 & 0x8) != 0) {
			@Pc(26) Class321 local26 = Class285.method26719(arg0.method22478());
			if (local26 != this.aClass321_2) {
				try {
					this.method8787(local26, true);
				} catch (@Pc(38) Exception_Sub2 local38) {
					local38.printStackTrace();
				}
			}
		}
		if ((local8 & 0x10) != 0) {
			@Pc(50) Class331 local50 = Class246.method26126(arg0.method22478());
			if (this.aClass331_2 != local50) {
				try {
					this.method8788(local50, true);
				} catch (@Pc(62) Exception_Sub2 local62) {
					local62.printStackTrace();
				}
			}
		}
		if ((local8 >> 7 & 0x1) == 1) {
			@Pc(75) int local75 = arg0.method22483();
			if ((local75 >> Class317.aClass317_12.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass447_10.method29131(arg0);
			}
			if ((local75 >> Class317.aClass317_2.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass447_12.method29131(arg0);
			}
			if ((local75 >> Class317.aClass317_3.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass447_13.method29131(arg0);
			}
			if ((local75 >> Class317.aClass317_4.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass447_11.method29131(arg0);
			}
			if ((local75 >> Class317.aClass317_5.anInt4070 * 269920571 & 0x1) == 1) {
				this.aFloat114 = arg0.method22517();
				this.aFloat103 = arg0.method22517();
			}
			if ((local75 >> Class317.aClass317_1.anInt4070 * 269920571 & 0x1) == 1) {
				this.aFloat104 = arg0.method22517();
				this.aFloat116 = arg0.method22517();
			}
			if ((local75 >> Class317.aClass317_7.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass336_2 = Class92.method23485(arg0.method22478());
			}
			if ((local75 >> Class317.aClass317_8.anInt4070 * 269920571 & 0x1) == 1) {
				this.anInt1040 = arg0.method22492() * 2095297221;
				arg0.method22478();
			}
			@Pc(223) int local223;
			if ((local75 >> Class317.aClass317_13.anInt4070 * 269920571 & 0x1) == 1) {
				local223 = arg0.method22478();
				this.aBoolean191 = (local223 & 0x1) == 1;
				this.aBoolean192 = (local223 & 0x2) == 2;
			}
			if ((local75 >> Class317.aClass317_10.anInt4070 * 269920571 & 0x1) == 1) {
				local223 = arg0.method22478();
				for (@Pc(259) int local259 = 0; local259 < local223; local259++) {
					@Pc(266) int local266 = arg0.method22478();
					@Pc(270) int local270 = arg0.method22478();
					if (local266 == 0) {
						this.method8853(local270);
					} else {
						@Pc(284) Class301 local284 = Class488.method29992(arg0.method22478());
						@Pc(286) boolean local286 = true;
						@Pc(290) Iterator local290 = this.aClass12_7.iterator();
						while (local290.hasNext()) {
							@Pc(297) Class77_Sub1_Sub12 local297 = (Class77_Sub1_Sub12) local290.next();
							if (local270 == local297.anInt3212 * -997430305) {
								local297.method24014(arg0);
								local286 = false;
								break;
							}
						}
						if (local286) {
							this.method8846(Class310.method27277(local270, local284, arg0));
						}
					}
				}
			}
			if ((local75 >> Class317.aClass317_9.anInt4070 * 269920571 & 0x1) == 1) {
				this.anInt1043 = arg0.method22483() * 695781827;
				this.aFloat109 = arg0.method22517();
			}
			if ((local75 >> Class317.aClass317_11.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass330_2 = Class152.method17432(arg0.method22478());
			}
			if ((local75 >> Class317.aClass317_14.anInt4070 * 269920571 & 0x1) == 1) {
				this.aClass447_14.method29131(arg0);
				this.aClass447_15.method29131(arg0);
				this.aFloat112 = arg0.method22517();
				this.aFloat113 = arg0.method22517();
			}
			if ((local75 >> Class317.aClass317_6.anInt4070 * 269920571 & 0x1) == 1) {
				arg0.method22517();
			}
			if ((local75 >> Class317.aClass317_15.anInt4070 * 269920571 & 0x1) == 1) {
				this.aFloat105 = arg0.method22517();
			}
		}
		if (this.aClass149_2 != null && (local8 >> 5 & 0x1) == 1) {
			this.aClass149_2.method23152(arg0);
		}
		if (this.aClass115_2 != null && (local8 >> 6 & 0x1) == 1) {
			this.aClass115_2.method21224(arg0);
		}
		if (arg1 != arg0.anInt3089 * 31645619 - local4) {
			throw new RuntimeException(arg0.anInt3089 * 31645619 - local4 + "," + arg1);
		}
	}
}

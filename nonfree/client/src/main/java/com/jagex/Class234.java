package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public class Class234 implements Interface12 {

	@OriginalMember(owner = "client!et", name = "p", descriptor = "Z")
	public static boolean aBoolean647 = false;

	@OriginalMember(owner = "client!et", name = "l", descriptor = "[I")
	public int[] anIntArray375;

	@OriginalMember(owner = "client!et", name = "y", descriptor = "[I")
	public int[] anIntArray376;

	@OriginalMember(owner = "client!et", name = "w", descriptor = "[I")
	public int[] anIntArray377;

	@OriginalMember(owner = "client!et", name = "q", descriptor = "Lclient!ew;")
	public Class236 aClass236_1;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!et", name = "o", descriptor = "[I")
	public int[] anIntArray378;

	@OriginalMember(owner = "client!et", name = "n", descriptor = "[I")
	public int[] anIntArray379;

	@OriginalMember(owner = "client!et", name = "b", descriptor = "[I")
	public int[] anIntArray380;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "Lclient!aak;")
	Class12 aClass12_26;

	@OriginalMember(owner = "client!et", name = "t", descriptor = "I")
	public int anInt3767 = 0;

	@OriginalMember(owner = "client!et", name = "x", descriptor = "I")
	int anInt3774 = -243170501;

	@OriginalMember(owner = "client!et", name = "s", descriptor = "I")
	public int anInt3765 = 1861769857;

	@OriginalMember(owner = "client!et", name = "r", descriptor = "I")
	public int anInt3768 = -1102522023;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "I")
	public int anInt3770 = -2116456681;

	@OriginalMember(owner = "client!et", name = "z", descriptor = "I")
	public int anInt3775 = 1704094575;

	@OriginalMember(owner = "client!et", name = "j", descriptor = "I")
	public int anInt3771 = 74266175;

	@OriginalMember(owner = "client!et", name = "i", descriptor = "I")
	public int anInt3772 = 2082983731;

	@OriginalMember(owner = "client!et", name = "k", descriptor = "I")
	public int anInt3769 = -1084459067;

	@OriginalMember(owner = "client!et", name = "u", descriptor = "I")
	public int anInt3773 = -565922618;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "Z")
	public boolean aBoolean646 = false;

	@OriginalMember(owner = "client!et", name = "f", descriptor = "Z")
	public boolean aBoolean648 = false;

	@OriginalMember(owner = "client!et", name = "m", descriptor = "I")
	public int anInt3776 = 2097961293;

	@OriginalMember(owner = "client!et", name = "v", descriptor = "I")
	public int anInt3766;

	@OriginalMember(owner = "client!et", name = "c", descriptor = "Lclient!eu;")
	Class110 aClass110_1;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(ILclient!eu;)V", line = 41)
	Class234(@OriginalArg(0) int arg0, @OriginalArg(1) Class110 arg1) {
		this.anInt3766 = arg0 * -1644429831;
		this.aClass110_1 = arg1;
	}

	@OriginalMember(owner = "client!et", name = "p", descriptor = "(Lclient!akv;B)V", line = 48)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method25883(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!et", name = "l", descriptor = "(Lclient!akv;)V", line = 48)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method25883(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!et", name = "v", descriptor = "(Lclient!akv;)V", line = 48)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method25883(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!et", name = "y", descriptor = "(Lclient!akv;)V", line = 48)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method25883(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!et", name = "i", descriptor = "(Lclient!akv;I)V", line = 55)
	void method25882(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local6 = arg0.method22483();
			this.anIntArray377 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray377[local12] = arg0.method22483();
			}
			this.anIntArray375 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray375[local12] = arg0.method22483();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray375[local12] += arg0.method22483() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3765 = arg0.method22483() * -1861769857;
		} else if (arg1 == 5) {
			this.anInt3768 = arg0.method22478() * -1938491323;
		} else if (arg1 == 6) {
			this.anInt3770 = arg0.method22483() * 2116456681;
		} else if (arg1 == 7) {
			this.anInt3775 = arg0.method22483() * -1704094575;
		} else if (arg1 == 8) {
			this.anInt3771 = arg0.method22478() * 1736090485;
		} else if (arg1 == 9) {
			this.anInt3772 = arg0.method22478() * -2082983731;
		} else if (arg1 == 10) {
			this.anInt3769 = arg0.method22478() * 1084459067;
		} else if (arg1 == 11) {
			this.anInt3773 = arg0.method22478() * -282961309;
		} else if (arg1 == 12 || arg1 == 112) {
			if (arg1 == 12) {
				local6 = arg0.method22478();
			} else {
				local6 = arg0.method22483();
			}
			this.anIntArray376 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray376[local12] = arg0.method22483();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray376[local12] += arg0.method22483() << 16;
			}
		} else {
			@Pc(249) int local249;
			if (arg1 == 13) {
				local6 = arg0.method22483();
				this.anIntArrayArray44 = new int[local6][];
				for (local12 = 0; local12 < local6; local12++) {
					@Pc(230) int local230 = arg0.method22478();
					if (local230 > 0) {
						this.anIntArrayArray44[local12] = new int[local230];
						this.anIntArrayArray44[local12][0] = arg0.method22492();
						for (local249 = 1; local249 < local230; local249++) {
							this.anIntArrayArray44[local12][local249] = arg0.method22483();
						}
					}
				}
			} else if (arg1 == 14) {
				this.aBoolean646 = true;
			} else if (arg1 == 15) {
				this.aBoolean648 = true;
			} else if (arg1 != 16 && arg1 != 18) {
				if (arg1 == 19 || arg1 == 119) {
					if (this.anIntArray378 == null) {
						this.anIntArray378 = new int[this.anIntArrayArray44.length];
						for (local6 = 0; local6 < this.anIntArrayArray44.length; local6++) {
							this.anIntArray378[local6] = 255;
						}
					}
					if (arg1 == 19) {
						local6 = arg0.method22478();
					} else {
						local6 = arg0.method22483();
					}
					this.anIntArray378[local6] = arg0.method22478();
				} else if (arg1 == 20 || arg1 == 120) {
					if (this.anIntArray380 == null || this.anIntArray379 == null) {
						this.anIntArray380 = new int[this.anIntArrayArray44.length];
						this.anIntArray379 = new int[this.anIntArrayArray44.length];
						for (local6 = 0; local6 < this.anIntArrayArray44.length; local6++) {
							this.anIntArray380[local6] = 256;
							this.anIntArray379[local6] = 256;
						}
					}
					if (arg1 == 20) {
						local6 = arg0.method22478();
					} else {
						local6 = arg0.method22483();
					}
					this.anIntArray380[local6] = arg0.method22483();
					this.anIntArray379[local6] = arg0.method22483();
				} else if (arg1 == 22) {
					this.anInt3776 = arg0.method22478() * -2097961293;
				} else if (arg1 == 23) {
					arg0.method22483();
				} else if (arg1 == 24) {
					this.anInt3774 = arg0.method22483() * 243170501;
					if (this.aClass110_1 != null) {
						this.aClass236_1 = (Class236) this.aClass110_1.anInterface13_4.method18319(this.anInt3774 * 2115215885);
					}
				} else if (arg1 == 249) {
					local6 = arg0.method22478();
					if (this.aClass12_26 == null) {
						local12 = Class199.method25492(local6);
						this.aClass12_26 = new Class12(local12);
					}
					for (local12 = 0; local12 < local6; local12++) {
						@Pc(489) boolean local489 = arg0.method22478() == 1;
						local249 = arg0.method22492();
						@Pc(502) Class77 local502;
						if (local489) {
							local502 = new Class77_Sub6(arg0.method22523());
						} else {
							local502 = new Class77_Sub40(arg0.method22500());
						}
						this.aClass12_26.method184(local502, (long) local249);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "q", descriptor = "(Lclient!akv;II)V", line = 55)
	void method25883(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local6 = arg0.method22483();
			this.anIntArray377 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray377[local12] = arg0.method22483();
			}
			this.anIntArray375 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray375[local12] = arg0.method22483();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray375[local12] += arg0.method22483() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3765 = arg0.method22483() * -1861769857;
		} else if (arg1 == 5) {
			this.anInt3768 = arg0.method22478() * -1938491323;
		} else if (arg1 == 6) {
			this.anInt3770 = arg0.method22483() * 2116456681;
		} else if (arg1 == 7) {
			this.anInt3775 = arg0.method22483() * -1704094575;
		} else if (arg1 == 8) {
			this.anInt3771 = arg0.method22478() * 1736090485;
		} else if (arg1 == 9) {
			this.anInt3772 = arg0.method22478() * -2082983731;
		} else if (arg1 == 10) {
			this.anInt3769 = arg0.method22478() * 1084459067;
		} else if (arg1 == 11) {
			this.anInt3773 = arg0.method22478() * -282961309;
		} else if (arg1 == 12 || arg1 == 112) {
			if (arg1 == 12) {
				local6 = arg0.method22478();
			} else {
				local6 = arg0.method22483();
			}
			this.anIntArray376 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray376[local12] = arg0.method22483();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray376[local12] += arg0.method22483() << 16;
			}
		} else {
			@Pc(249) int local249;
			if (arg1 == 13) {
				local6 = arg0.method22483();
				this.anIntArrayArray44 = new int[local6][];
				for (local12 = 0; local12 < local6; local12++) {
					@Pc(230) int local230 = arg0.method22478();
					if (local230 > 0) {
						this.anIntArrayArray44[local12] = new int[local230];
						this.anIntArrayArray44[local12][0] = arg0.method22492();
						for (local249 = 1; local249 < local230; local249++) {
							this.anIntArrayArray44[local12][local249] = arg0.method22483();
						}
					}
				}
			} else if (arg1 == 14) {
				this.aBoolean646 = true;
			} else if (arg1 == 15) {
				this.aBoolean648 = true;
			} else if (arg1 != 16 && arg1 != 18) {
				if (arg1 == 19 || arg1 == 119) {
					if (this.anIntArray378 == null) {
						this.anIntArray378 = new int[this.anIntArrayArray44.length];
						for (local6 = 0; local6 < this.anIntArrayArray44.length; local6++) {
							this.anIntArray378[local6] = 255;
						}
					}
					if (arg1 == 19) {
						local6 = arg0.method22478();
					} else {
						local6 = arg0.method22483();
					}
					this.anIntArray378[local6] = arg0.method22478();
				} else if (arg1 == 20 || arg1 == 120) {
					if (this.anIntArray380 == null || this.anIntArray379 == null) {
						this.anIntArray380 = new int[this.anIntArrayArray44.length];
						this.anIntArray379 = new int[this.anIntArrayArray44.length];
						for (local6 = 0; local6 < this.anIntArrayArray44.length; local6++) {
							this.anIntArray380[local6] = 256;
							this.anIntArray379[local6] = 256;
						}
					}
					if (arg1 == 20) {
						local6 = arg0.method22478();
					} else {
						local6 = arg0.method22483();
					}
					this.anIntArray380[local6] = arg0.method22483();
					this.anIntArray379[local6] = arg0.method22483();
				} else if (arg1 == 22) {
					this.anInt3776 = arg0.method22478() * -2097961293;
				} else if (arg1 == 23) {
					arg0.method22483();
				} else if (arg1 == 24) {
					this.anInt3774 = arg0.method22483() * 243170501;
					if (this.aClass110_1 != null) {
						this.aClass236_1 = (Class236) this.aClass110_1.anInterface13_4.method18319(this.anInt3774 * 2115215885);
					}
				} else if (arg1 == 249) {
					local6 = arg0.method22478();
					if (this.aClass12_26 == null) {
						local12 = Class199.method25492(local6);
						this.aClass12_26 = new Class12(local12);
					}
					for (local12 = 0; local12 < local6; local12++) {
						@Pc(489) boolean local489 = arg0.method22478() == 1;
						local249 = arg0.method22492();
						@Pc(502) Class77 local502;
						if (local489) {
							local502 = new Class77_Sub6(arg0.method22523());
						} else {
							local502 = new Class77_Sub40(arg0.method22500());
						}
						this.aClass12_26.method184(local502, (long) local249);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "r", descriptor = "(Lclient!akv;I)V", line = 55)
	void method25884(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local6 = arg0.method22483();
			this.anIntArray377 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray377[local12] = arg0.method22483();
			}
			this.anIntArray375 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray375[local12] = arg0.method22483();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray375[local12] += arg0.method22483() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3765 = arg0.method22483() * -1861769857;
		} else if (arg1 == 5) {
			this.anInt3768 = arg0.method22478() * -1938491323;
		} else if (arg1 == 6) {
			this.anInt3770 = arg0.method22483() * 2116456681;
		} else if (arg1 == 7) {
			this.anInt3775 = arg0.method22483() * -1704094575;
		} else if (arg1 == 8) {
			this.anInt3771 = arg0.method22478() * 1736090485;
		} else if (arg1 == 9) {
			this.anInt3772 = arg0.method22478() * -2082983731;
		} else if (arg1 == 10) {
			this.anInt3769 = arg0.method22478() * 1084459067;
		} else if (arg1 == 11) {
			this.anInt3773 = arg0.method22478() * -282961309;
		} else if (arg1 == 12 || arg1 == 112) {
			if (arg1 == 12) {
				local6 = arg0.method22478();
			} else {
				local6 = arg0.method22483();
			}
			this.anIntArray376 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray376[local12] = arg0.method22483();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray376[local12] += arg0.method22483() << 16;
			}
		} else {
			@Pc(249) int local249;
			if (arg1 == 13) {
				local6 = arg0.method22483();
				this.anIntArrayArray44 = new int[local6][];
				for (local12 = 0; local12 < local6; local12++) {
					@Pc(230) int local230 = arg0.method22478();
					if (local230 > 0) {
						this.anIntArrayArray44[local12] = new int[local230];
						this.anIntArrayArray44[local12][0] = arg0.method22492();
						for (local249 = 1; local249 < local230; local249++) {
							this.anIntArrayArray44[local12][local249] = arg0.method22483();
						}
					}
				}
			} else if (arg1 == 14) {
				this.aBoolean646 = true;
			} else if (arg1 == 15) {
				this.aBoolean648 = true;
			} else if (arg1 != 16 && arg1 != 18) {
				if (arg1 == 19 || arg1 == 119) {
					if (this.anIntArray378 == null) {
						this.anIntArray378 = new int[this.anIntArrayArray44.length];
						for (local6 = 0; local6 < this.anIntArrayArray44.length; local6++) {
							this.anIntArray378[local6] = 255;
						}
					}
					if (arg1 == 19) {
						local6 = arg0.method22478();
					} else {
						local6 = arg0.method22483();
					}
					this.anIntArray378[local6] = arg0.method22478();
				} else if (arg1 == 20 || arg1 == 120) {
					if (this.anIntArray380 == null || this.anIntArray379 == null) {
						this.anIntArray380 = new int[this.anIntArrayArray44.length];
						this.anIntArray379 = new int[this.anIntArrayArray44.length];
						for (local6 = 0; local6 < this.anIntArrayArray44.length; local6++) {
							this.anIntArray380[local6] = 256;
							this.anIntArray379[local6] = 256;
						}
					}
					if (arg1 == 20) {
						local6 = arg0.method22478();
					} else {
						local6 = arg0.method22483();
					}
					this.anIntArray380[local6] = arg0.method22483();
					this.anIntArray379[local6] = arg0.method22483();
				} else if (arg1 == 22) {
					this.anInt3776 = arg0.method22478() * -2097961293;
				} else if (arg1 == 23) {
					arg0.method22483();
				} else if (arg1 == 24) {
					this.anInt3774 = arg0.method22483() * 243170501;
					if (this.aClass110_1 != null) {
						this.aClass236_1 = (Class236) this.aClass110_1.anInterface13_4.method18319(this.anInt3774 * 2115215885);
					}
				} else if (arg1 == 249) {
					local6 = arg0.method22478();
					if (this.aClass12_26 == null) {
						local12 = Class199.method25492(local6);
						this.aClass12_26 = new Class12(local12);
					}
					for (local12 = 0; local12 < local6; local12++) {
						@Pc(489) boolean local489 = arg0.method22478() == 1;
						local249 = arg0.method22492();
						@Pc(502) Class77 local502;
						if (local489) {
							local502 = new Class77_Sub6(arg0.method22523());
						} else {
							local502 = new Class77_Sub40(arg0.method22500());
						}
						this.aClass12_26.method184(local502, (long) local249);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(Lclient!akv;I)V", line = 55)
	void method25885(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local6 = arg0.method22483();
			this.anIntArray377 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray377[local12] = arg0.method22483();
			}
			this.anIntArray375 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray375[local12] = arg0.method22483();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray375[local12] += arg0.method22483() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3765 = arg0.method22483() * -1861769857;
		} else if (arg1 == 5) {
			this.anInt3768 = arg0.method22478() * -1938491323;
		} else if (arg1 == 6) {
			this.anInt3770 = arg0.method22483() * 2116456681;
		} else if (arg1 == 7) {
			this.anInt3775 = arg0.method22483() * -1704094575;
		} else if (arg1 == 8) {
			this.anInt3771 = arg0.method22478() * 1736090485;
		} else if (arg1 == 9) {
			this.anInt3772 = arg0.method22478() * -2082983731;
		} else if (arg1 == 10) {
			this.anInt3769 = arg0.method22478() * 1084459067;
		} else if (arg1 == 11) {
			this.anInt3773 = arg0.method22478() * -282961309;
		} else if (arg1 == 12 || arg1 == 112) {
			if (arg1 == 12) {
				local6 = arg0.method22478();
			} else {
				local6 = arg0.method22483();
			}
			this.anIntArray376 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray376[local12] = arg0.method22483();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray376[local12] += arg0.method22483() << 16;
			}
		} else {
			@Pc(249) int local249;
			if (arg1 == 13) {
				local6 = arg0.method22483();
				this.anIntArrayArray44 = new int[local6][];
				for (local12 = 0; local12 < local6; local12++) {
					@Pc(230) int local230 = arg0.method22478();
					if (local230 > 0) {
						this.anIntArrayArray44[local12] = new int[local230];
						this.anIntArrayArray44[local12][0] = arg0.method22492();
						for (local249 = 1; local249 < local230; local249++) {
							this.anIntArrayArray44[local12][local249] = arg0.method22483();
						}
					}
				}
			} else if (arg1 == 14) {
				this.aBoolean646 = true;
			} else if (arg1 == 15) {
				this.aBoolean648 = true;
			} else if (arg1 != 16 && arg1 != 18) {
				if (arg1 == 19 || arg1 == 119) {
					if (this.anIntArray378 == null) {
						this.anIntArray378 = new int[this.anIntArrayArray44.length];
						for (local6 = 0; local6 < this.anIntArrayArray44.length; local6++) {
							this.anIntArray378[local6] = 255;
						}
					}
					if (arg1 == 19) {
						local6 = arg0.method22478();
					} else {
						local6 = arg0.method22483();
					}
					this.anIntArray378[local6] = arg0.method22478();
				} else if (arg1 == 20 || arg1 == 120) {
					if (this.anIntArray380 == null || this.anIntArray379 == null) {
						this.anIntArray380 = new int[this.anIntArrayArray44.length];
						this.anIntArray379 = new int[this.anIntArrayArray44.length];
						for (local6 = 0; local6 < this.anIntArrayArray44.length; local6++) {
							this.anIntArray380[local6] = 256;
							this.anIntArray379[local6] = 256;
						}
					}
					if (arg1 == 20) {
						local6 = arg0.method22478();
					} else {
						local6 = arg0.method22483();
					}
					this.anIntArray380[local6] = arg0.method22483();
					this.anIntArray379[local6] = arg0.method22483();
				} else if (arg1 == 22) {
					this.anInt3776 = arg0.method22478() * -2097961293;
				} else if (arg1 == 23) {
					arg0.method22483();
				} else if (arg1 == 24) {
					this.anInt3774 = arg0.method22483() * 243170501;
					if (this.aClass110_1 != null) {
						this.aClass236_1 = (Class236) this.aClass110_1.anInterface13_4.method18319(this.anInt3774 * 2115215885);
					}
				} else if (arg1 == 249) {
					local6 = arg0.method22478();
					if (this.aClass12_26 == null) {
						local12 = Class199.method25492(local6);
						this.aClass12_26 = new Class12(local12);
					}
					for (local12 = 0; local12 < local6; local12++) {
						@Pc(489) boolean local489 = arg0.method22478() == 1;
						local249 = arg0.method22492();
						@Pc(502) Class77 local502;
						if (local489) {
							local502 = new Class77_Sub6(arg0.method22523());
						} else {
							local502 = new Class77_Sub40(arg0.method22500());
						}
						this.aClass12_26.method184(local502, (long) local249);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "z", descriptor = "(Lclient!akv;I)V", line = 55)
	void method25886(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local6 = arg0.method22483();
			this.anIntArray377 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray377[local12] = arg0.method22483();
			}
			this.anIntArray375 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray375[local12] = arg0.method22483();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray375[local12] += arg0.method22483() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3765 = arg0.method22483() * -1861769857;
		} else if (arg1 == 5) {
			this.anInt3768 = arg0.method22478() * -1938491323;
		} else if (arg1 == 6) {
			this.anInt3770 = arg0.method22483() * 2116456681;
		} else if (arg1 == 7) {
			this.anInt3775 = arg0.method22483() * -1704094575;
		} else if (arg1 == 8) {
			this.anInt3771 = arg0.method22478() * 1736090485;
		} else if (arg1 == 9) {
			this.anInt3772 = arg0.method22478() * -2082983731;
		} else if (arg1 == 10) {
			this.anInt3769 = arg0.method22478() * 1084459067;
		} else if (arg1 == 11) {
			this.anInt3773 = arg0.method22478() * -282961309;
		} else if (arg1 == 12 || arg1 == 112) {
			if (arg1 == 12) {
				local6 = arg0.method22478();
			} else {
				local6 = arg0.method22483();
			}
			this.anIntArray376 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray376[local12] = arg0.method22483();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray376[local12] += arg0.method22483() << 16;
			}
		} else {
			@Pc(249) int local249;
			if (arg1 == 13) {
				local6 = arg0.method22483();
				this.anIntArrayArray44 = new int[local6][];
				for (local12 = 0; local12 < local6; local12++) {
					@Pc(230) int local230 = arg0.method22478();
					if (local230 > 0) {
						this.anIntArrayArray44[local12] = new int[local230];
						this.anIntArrayArray44[local12][0] = arg0.method22492();
						for (local249 = 1; local249 < local230; local249++) {
							this.anIntArrayArray44[local12][local249] = arg0.method22483();
						}
					}
				}
			} else if (arg1 == 14) {
				this.aBoolean646 = true;
			} else if (arg1 == 15) {
				this.aBoolean648 = true;
			} else if (arg1 != 16 && arg1 != 18) {
				if (arg1 == 19 || arg1 == 119) {
					if (this.anIntArray378 == null) {
						this.anIntArray378 = new int[this.anIntArrayArray44.length];
						for (local6 = 0; local6 < this.anIntArrayArray44.length; local6++) {
							this.anIntArray378[local6] = 255;
						}
					}
					if (arg1 == 19) {
						local6 = arg0.method22478();
					} else {
						local6 = arg0.method22483();
					}
					this.anIntArray378[local6] = arg0.method22478();
				} else if (arg1 == 20 || arg1 == 120) {
					if (this.anIntArray380 == null || this.anIntArray379 == null) {
						this.anIntArray380 = new int[this.anIntArrayArray44.length];
						this.anIntArray379 = new int[this.anIntArrayArray44.length];
						for (local6 = 0; local6 < this.anIntArrayArray44.length; local6++) {
							this.anIntArray380[local6] = 256;
							this.anIntArray379[local6] = 256;
						}
					}
					if (arg1 == 20) {
						local6 = arg0.method22478();
					} else {
						local6 = arg0.method22483();
					}
					this.anIntArray380[local6] = arg0.method22483();
					this.anIntArray379[local6] = arg0.method22483();
				} else if (arg1 == 22) {
					this.anInt3776 = arg0.method22478() * -2097961293;
				} else if (arg1 == 23) {
					arg0.method22483();
				} else if (arg1 == 24) {
					this.anInt3774 = arg0.method22483() * 243170501;
					if (this.aClass110_1 != null) {
						this.aClass236_1 = (Class236) this.aClass110_1.anInterface13_4.method18319(this.anInt3774 * 2115215885);
					}
				} else if (arg1 == 249) {
					local6 = arg0.method22478();
					if (this.aClass12_26 == null) {
						local12 = Class199.method25492(local6);
						this.aClass12_26 = new Class12(local12);
					}
					for (local12 = 0; local12 < local6; local12++) {
						@Pc(489) boolean local489 = arg0.method22478() == 1;
						local249 = arg0.method22492();
						@Pc(502) Class77 local502;
						if (local489) {
							local502 = new Class77_Sub6(arg0.method22523());
						} else {
							local502 = new Class77_Sub40(arg0.method22500());
						}
						this.aClass12_26.method184(local502, (long) local249);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "j", descriptor = "(Lclient!akv;I)V", line = 55)
	void method25887(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local6 = arg0.method22483();
			this.anIntArray377 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray377[local12] = arg0.method22483();
			}
			this.anIntArray375 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray375[local12] = arg0.method22483();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray375[local12] += arg0.method22483() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3765 = arg0.method22483() * -1861769857;
		} else if (arg1 == 5) {
			this.anInt3768 = arg0.method22478() * -1938491323;
		} else if (arg1 == 6) {
			this.anInt3770 = arg0.method22483() * 2116456681;
		} else if (arg1 == 7) {
			this.anInt3775 = arg0.method22483() * -1704094575;
		} else if (arg1 == 8) {
			this.anInt3771 = arg0.method22478() * 1736090485;
		} else if (arg1 == 9) {
			this.anInt3772 = arg0.method22478() * -2082983731;
		} else if (arg1 == 10) {
			this.anInt3769 = arg0.method22478() * 1084459067;
		} else if (arg1 == 11) {
			this.anInt3773 = arg0.method22478() * -282961309;
		} else if (arg1 == 12 || arg1 == 112) {
			if (arg1 == 12) {
				local6 = arg0.method22478();
			} else {
				local6 = arg0.method22483();
			}
			this.anIntArray376 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray376[local12] = arg0.method22483();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray376[local12] += arg0.method22483() << 16;
			}
		} else {
			@Pc(249) int local249;
			if (arg1 == 13) {
				local6 = arg0.method22483();
				this.anIntArrayArray44 = new int[local6][];
				for (local12 = 0; local12 < local6; local12++) {
					@Pc(230) int local230 = arg0.method22478();
					if (local230 > 0) {
						this.anIntArrayArray44[local12] = new int[local230];
						this.anIntArrayArray44[local12][0] = arg0.method22492();
						for (local249 = 1; local249 < local230; local249++) {
							this.anIntArrayArray44[local12][local249] = arg0.method22483();
						}
					}
				}
			} else if (arg1 == 14) {
				this.aBoolean646 = true;
			} else if (arg1 == 15) {
				this.aBoolean648 = true;
			} else if (arg1 != 16 && arg1 != 18) {
				if (arg1 == 19 || arg1 == 119) {
					if (this.anIntArray378 == null) {
						this.anIntArray378 = new int[this.anIntArrayArray44.length];
						for (local6 = 0; local6 < this.anIntArrayArray44.length; local6++) {
							this.anIntArray378[local6] = 255;
						}
					}
					if (arg1 == 19) {
						local6 = arg0.method22478();
					} else {
						local6 = arg0.method22483();
					}
					this.anIntArray378[local6] = arg0.method22478();
				} else if (arg1 == 20 || arg1 == 120) {
					if (this.anIntArray380 == null || this.anIntArray379 == null) {
						this.anIntArray380 = new int[this.anIntArrayArray44.length];
						this.anIntArray379 = new int[this.anIntArrayArray44.length];
						for (local6 = 0; local6 < this.anIntArrayArray44.length; local6++) {
							this.anIntArray380[local6] = 256;
							this.anIntArray379[local6] = 256;
						}
					}
					if (arg1 == 20) {
						local6 = arg0.method22478();
					} else {
						local6 = arg0.method22483();
					}
					this.anIntArray380[local6] = arg0.method22483();
					this.anIntArray379[local6] = arg0.method22483();
				} else if (arg1 == 22) {
					this.anInt3776 = arg0.method22478() * -2097961293;
				} else if (arg1 == 23) {
					arg0.method22483();
				} else if (arg1 == 24) {
					this.anInt3774 = arg0.method22483() * 243170501;
					if (this.aClass110_1 != null) {
						this.aClass236_1 = (Class236) this.aClass110_1.anInterface13_4.method18319(this.anInt3774 * 2115215885);
					}
				} else if (arg1 == 249) {
					local6 = arg0.method22478();
					if (this.aClass12_26 == null) {
						local12 = Class199.method25492(local6);
						this.aClass12_26 = new Class12(local12);
					}
					for (local12 = 0; local12 < local6; local12++) {
						@Pc(489) boolean local489 = arg0.method22478() == 1;
						local249 = arg0.method22492();
						@Pc(502) Class77 local502;
						if (local489) {
							local502 = new Class77_Sub6(arg0.method22523());
						} else {
							local502 = new Class77_Sub40(arg0.method22500());
						}
						this.aClass12_26.method184(local502, (long) local249);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V", line = 149)
	@Override
	public void method36034() {
		if (this.anInt3772 * 716389381 == -1) {
			if (this.aClass236_1 == null || this.aClass236_1.aBooleanArray20 == null) {
				this.anInt3772 = 0;
			} else {
				this.anInt3772 = 128999834;
			}
		}
		if (this.anInt3769 * -492433165 == -1) {
			if (this.aClass236_1 == null || this.aClass236_1.aBooleanArray20 == null) {
				this.anInt3769 = 0;
			} else {
				this.anInt3769 = -2126049162;
			}
		}
		if (this.anIntArray377 != null) {
			this.anInt3767 = 0;
			for (@Pc(48) int local48 = 0; local48 < this.anIntArray377.length; local48++) {
				this.anInt3767 += this.anIntArray377[local48] * -1346711357;
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "w", descriptor = "()V", line = 149)
	@Override
	public void method36035() {
		if (this.anInt3772 * 716389381 == -1) {
			if (this.aClass236_1 == null || this.aClass236_1.aBooleanArray20 == null) {
				this.anInt3772 = 0;
			} else {
				this.anInt3772 = 128999834;
			}
		}
		if (this.anInt3769 * -492433165 == -1) {
			if (this.aClass236_1 == null || this.aClass236_1.aBooleanArray20 == null) {
				this.anInt3769 = 0;
			} else {
				this.anInt3769 = -2126049162;
			}
		}
		if (this.anIntArray377 != null) {
			this.anInt3767 = 0;
			for (@Pc(48) int local48 = 0; local48 < this.anIntArray377.length; local48++) {
				this.anInt3767 += this.anIntArray377[local48] * -1346711357;
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "t", descriptor = "()V", line = 149)
	@Override
	public void method36036() {
		if (this.anInt3772 * 716389381 == -1) {
			if (this.aClass236_1 == null || this.aClass236_1.aBooleanArray20 == null) {
				this.anInt3772 = 0;
			} else {
				this.anInt3772 = 128999834;
			}
		}
		if (this.anInt3769 * -492433165 == -1) {
			if (this.aClass236_1 == null || this.aClass236_1.aBooleanArray20 == null) {
				this.anInt3769 = 0;
			} else {
				this.anInt3769 = -2126049162;
			}
		}
		if (this.anIntArray377 != null) {
			this.anInt3767 = 0;
			for (@Pc(48) int local48 = 0; local48 < this.anIntArray377.length; local48++) {
				this.anInt3767 += this.anIntArray377[local48] * -1346711357;
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "x", descriptor = "(I)Z", line = 164)
	public boolean method25888() {
		if (this.anIntArray375 == null) {
			return true;
		}
		@Pc(7) boolean local7 = true;
		@Pc(10) int[] local10 = this.anIntArray375;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(20) int local20 = local10[local12];
			if (this.aClass110_1.method9151(local20 >>> 16) == null) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(IIB)I", line = 179)
	public int method25889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass12_26 == null) {
			return arg1;
		} else {
			@Pc(11) Class77_Sub40 local11 = (Class77_Sub40) this.aClass12_26.method173((long) arg0);
			return local11 == null ? arg1 : local11.anInt1786 * -705967177;
		}
	}

	@OriginalMember(owner = "client!et", name = "k", descriptor = "(II)I", line = 179)
	public int method25890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass12_26 == null) {
			return arg1;
		} else {
			@Pc(11) Class77_Sub40 local11 = (Class77_Sub40) this.aClass12_26.method173((long) arg0);
			return local11 == null ? arg1 : local11.anInt1786 * -705967177;
		}
	}

	@OriginalMember(owner = "client!et", name = "u", descriptor = "(II)I", line = 179)
	public int method25891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass12_26 == null) {
			return arg1;
		} else {
			@Pc(11) Class77_Sub40 local11 = (Class77_Sub40) this.aClass12_26.method173((long) arg0);
			return local11 == null ? arg1 : local11.anInt1786 * -705967177;
		}
	}

	@OriginalMember(owner = "client!et", name = "s", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 186)
	public String method25892(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass12_26 == null) {
			return arg1;
		} else {
			@Pc(12) Class77_Sub6 local12 = (Class77_Sub6) this.aClass12_26.method173((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject5;
		}
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 186)
	public String method25893(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass12_26 == null) {
			return arg1;
		} else {
			@Pc(12) Class77_Sub6 local12 = (Class77_Sub6) this.aClass12_26.method173((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject5;
		}
	}

	@OriginalMember(owner = "client!et", name = "aip", descriptor = "(Lclient!yf;I)V", line = 10795)
	static final void method25894(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class136_Sub1.anInt1702 * -1857977261 == 100 ? 1 : 0;
	}
}

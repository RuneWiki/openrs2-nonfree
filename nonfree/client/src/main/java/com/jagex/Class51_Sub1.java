package com.jagex;

import java.io.IOException;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aey")
public class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!aey", name = "o", descriptor = "Lclient!qg;")
	Class62 aClass62_1;

	@OriginalMember(owner = "client!aey", name = "ak", descriptor = "(II)V", line = 13)
	@Override
	void method9829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClass62_1.method12850();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass62_1 = null;
		this.anInt1113 += 876183929;
		this.anInt1115 = 1371376565;
		this.aByte33 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1109 = arg0 * -155394861;
		this.anInt1116 = arg1 * 1698205817;
	}

	@OriginalMember(owner = "client!aey", name = "x", descriptor = "(III)V", line = 13)
	@Override
	void method9823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClass62_1.method12850();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass62_1 = null;
		this.anInt1113 += 876183929;
		this.anInt1115 = 1371376565;
		this.aByte33 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1109 = arg0 * -155394861;
		this.anInt1116 = arg1 * 1698205817;
	}

	@OriginalMember(owner = "client!aey", name = "af", descriptor = "(II)V", line = 13)
	@Override
	void method9844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClass62_1.method12850();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass62_1 = null;
		this.anInt1113 += 876183929;
		this.anInt1115 = 1371376565;
		this.aByte33 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1109 = arg0 * -155394861;
		this.anInt1116 = arg1 * 1698205817;
	}

	@OriginalMember(owner = "client!aey", name = "s", descriptor = "(I)Z", line = 25)
	@Override
	public boolean method9838() {
		@Pc(14) int local14;
		if (this.aClass62_1 != null) {
			@Pc(6) long local6 = Class176.method23413();
			local14 = (int) (local6 - this.aLong39 * -260837468447057599L);
			this.aLong39 = local6 * 97482058490689217L;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt1110 += local14 * -1192284147;
			if (this.anInt1110 * -144138555 > 30000) {
				try {
					this.aClass62_1.method12850();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass62_1 = null;
			}
		}
		if (this.aClass62_1 == null) {
			return this.method9835() == 0 && this.method9828() == 0;
		}
		try {
			@Pc(68) Class3_Sub1_Sub12_Sub3 local68;
			for (local68 = (Class3_Sub1_Sub12_Sub3) this.aClass546_8.method32623(); local68 != null; local68 = (Class3_Sub1_Sub12_Sub3) this.aClass546_8.method32645()) {
				this.aClass3_Sub41_4.anInt2803 = 0;
				this.aClass3_Sub41_4.method20250(1);
				this.aClass3_Sub41_4.method20256(local68.aLong297 * -2884094411549009029L);
				this.aClass62_1.method12846(this.aClass3_Sub41_4.aByteArray51, 0, this.aClass3_Sub41_4.aByteArray51.length);
				this.aClass546_5.method32621(local68);
			}
			for (local68 = (Class3_Sub1_Sub12_Sub3) this.aClass546_7.method32623(); local68 != null; local68 = (Class3_Sub1_Sub12_Sub3) this.aClass546_7.method32645()) {
				this.aClass3_Sub41_4.anInt2803 = 0;
				this.aClass3_Sub41_4.method20250(0);
				this.aClass3_Sub41_4.method20256(local68.aLong297 * -2884094411549009029L);
				this.aClass62_1.method12846(this.aClass3_Sub41_4.aByteArray51, 0, this.aClass3_Sub41_4.aByteArray51.length);
				this.aClass546_6.method32621(local68);
			}
			for (@Pc(162) int local162 = 0; local162 < 100; local162++) {
				@Pc(170) int local170 = this.aClass62_1.method12847();
				if (local170 < 0) {
					throw new IOException();
				}
				if (local170 == 0) {
					break;
				}
				this.anInt1110 = 0;
				@Pc(218) int local218;
				@Pc(271) int local271;
				if (this.aClass3_Sub1_Sub12_Sub3_2 == null) {
					local14 = 5 - this.aClass3_Sub41_5.anInt2803 * 62066237;
					if (local14 > local170) {
						local14 = local170;
					}
					this.aClass62_1.method12848(this.aClass3_Sub41_5.aByteArray51, this.aClass3_Sub41_5.anInt2803 * 62066237, local14);
					if (this.aByte33 != 0) {
						for (local218 = 0; local218 < local14; local218++) {
							this.aClass3_Sub41_5.aByteArray51[local218 + this.aClass3_Sub41_5.anInt2803 * 62066237] ^= this.aByte33;
						}
					}
					this.aClass3_Sub41_5.anInt2803 += local14 * -918980331;
					if (this.aClass3_Sub41_5.anInt2803 * 62066237 >= 5) {
						this.aClass3_Sub41_5.anInt2803 = 0;
						local218 = this.aClass3_Sub41_5.method20269();
						local271 = this.aClass3_Sub41_5.method20275();
						@Pc(280) boolean local280 = (local271 & Integer.MIN_VALUE) != 0;
						@Pc(284) int local284 = local271 & Integer.MAX_VALUE;
						@Pc(292) long local292 = (long) local284 + ((long) local218 << 32);
						@Pc(298) Iterator local298;
						@Pc(305) Class3_Sub1_Sub12_Sub3 local305;
						if (local280) {
							local298 = this.aClass546_6.iterator();
							while (local298.hasNext()) {
								local305 = (Class3_Sub1_Sub12_Sub3) local298.next();
								if (local292 == local305.aLong297 * -2884094411549009029L) {
									this.aClass3_Sub1_Sub12_Sub3_2 = local305;
									break;
								}
							}
						} else {
							local298 = this.aClass546_5.iterator();
							while (local298.hasNext()) {
								local305 = (Class3_Sub1_Sub12_Sub3) local298.next();
								if (local292 == local305.aLong297 * -2884094411549009029L) {
									this.aClass3_Sub1_Sub12_Sub3_2 = local305;
									break;
								}
							}
						}
						if (this.aClass3_Sub1_Sub12_Sub3_2 == null) {
							throw new IOException();
						}
						this.anInt1111 = 1879355431;
						this.aClass3_Sub41_5.anInt2803 = 0;
						this.aClass3_Sub41_6.anInt2803 = 0;
					}
				} else {
					@Pc(365) Class3_Sub41 local365 = this.aClass3_Sub1_Sub12_Sub3_2.aClass3_Sub41_14;
					@Pc(453) int local453;
					if (local365 == null) {
						local218 = 5 - this.aClass3_Sub41_6.anInt2803 * 62066237;
						if (local218 > local170) {
							local218 = local170;
						}
						this.aClass62_1.method12848(this.aClass3_Sub41_6.aByteArray51, this.aClass3_Sub41_6.anInt2803 * 62066237, local218);
						if (this.aByte33 != 0) {
							for (local271 = 0; local271 < local218; local271++) {
								this.aClass3_Sub41_6.aByteArray51[this.aClass3_Sub41_6.anInt2803 * 62066237 + local271] ^= this.aByte33;
							}
						}
						this.aClass3_Sub41_6.anInt2803 += local218 * -918980331;
						if (this.aClass3_Sub41_6.anInt2803 * 62066237 >= 5) {
							this.aClass3_Sub41_6.anInt2803 = 0;
							local271 = this.aClass3_Sub41_6.method20269();
							local453 = this.aClass3_Sub41_6.method20275();
							@Pc(455) byte local455 = 5;
							if (local271 != 0) {
								local455 = 9;
							}
							local365 = this.aClass3_Sub1_Sub12_Sub3_2.aClass3_Sub41_14 = new Class3_Sub41(local455 + local453 + this.aClass3_Sub1_Sub12_Sub3_2.aByte98);
							local365.method20250(local271);
							local365.method20254(local453);
							this.anInt1111 += 1879355431;
						}
					} else {
						local218 = local365.aByteArray51.length - this.aClass3_Sub1_Sub12_Sub3_2.aByte98;
						local271 = 512 - this.anInt1111 * 243318259;
						if (local271 > local218 - local365.anInt2803 * 62066237) {
							local271 = local218 - local365.anInt2803 * 62066237;
						}
						if (local271 > local170) {
							local271 = local170;
						}
						this.aClass62_1.method12848(local365.aByteArray51, local365.anInt2803 * 62066237, local271);
						if (this.aByte33 != 0) {
							for (local453 = 0; local453 < local271; local453++) {
								local365.aByteArray51[local453 + local365.anInt2803 * 62066237] ^= this.aByte33;
							}
						}
						local365.anInt2803 += local271 * -918980331;
						this.anInt1111 += local271 * -483122373;
						if (local218 == local365.anInt2803 * 62066237) {
							this.aClass3_Sub1_Sub12_Sub3_2.method33669();
							this.aClass3_Sub1_Sub12_Sub3_2.aBoolean516 = false;
							this.aClass3_Sub1_Sub12_Sub3_2 = null;
						} else if (this.anInt1111 * 243318259 == 512) {
							this.anInt1111 = 0;
							this.aClass3_Sub1_Sub12_Sub3_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(615) IOException local615) {
			try {
				this.aClass62_1.method12850();
			} catch (@Pc(621) Exception local621) {
			}
			this.aClass62_1 = null;
			this.anInt1113 += 876183929;
			this.anInt1115 = -1552214166;
			return this.method9835() == 0 && this.method9828() == 0;
		}
	}

	@OriginalMember(owner = "client!aey", name = "ao", descriptor = "()Z", line = 25)
	@Override
	public boolean method9857() {
		@Pc(14) int local14;
		if (this.aClass62_1 != null) {
			@Pc(6) long local6 = Class176.method23413();
			local14 = (int) (local6 - this.aLong39 * -260837468447057599L);
			this.aLong39 = local6 * 97482058490689217L;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt1110 += local14 * -1192284147;
			if (this.anInt1110 * -144138555 > 30000) {
				try {
					this.aClass62_1.method12850();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass62_1 = null;
			}
		}
		if (this.aClass62_1 == null) {
			return this.method9835() == 0 && this.method9828() == 0;
		}
		try {
			@Pc(68) Class3_Sub1_Sub12_Sub3 local68;
			for (local68 = (Class3_Sub1_Sub12_Sub3) this.aClass546_8.method32623(); local68 != null; local68 = (Class3_Sub1_Sub12_Sub3) this.aClass546_8.method32645()) {
				this.aClass3_Sub41_4.anInt2803 = 0;
				this.aClass3_Sub41_4.method20250(1);
				this.aClass3_Sub41_4.method20256(local68.aLong297 * -2884094411549009029L);
				this.aClass62_1.method12846(this.aClass3_Sub41_4.aByteArray51, 0, this.aClass3_Sub41_4.aByteArray51.length);
				this.aClass546_5.method32621(local68);
			}
			for (local68 = (Class3_Sub1_Sub12_Sub3) this.aClass546_7.method32623(); local68 != null; local68 = (Class3_Sub1_Sub12_Sub3) this.aClass546_7.method32645()) {
				this.aClass3_Sub41_4.anInt2803 = 0;
				this.aClass3_Sub41_4.method20250(0);
				this.aClass3_Sub41_4.method20256(local68.aLong297 * -2884094411549009029L);
				this.aClass62_1.method12846(this.aClass3_Sub41_4.aByteArray51, 0, this.aClass3_Sub41_4.aByteArray51.length);
				this.aClass546_6.method32621(local68);
			}
			for (@Pc(162) int local162 = 0; local162 < 100; local162++) {
				@Pc(170) int local170 = this.aClass62_1.method12847();
				if (local170 < 0) {
					throw new IOException();
				}
				if (local170 == 0) {
					break;
				}
				this.anInt1110 = 0;
				@Pc(218) int local218;
				@Pc(271) int local271;
				if (this.aClass3_Sub1_Sub12_Sub3_2 == null) {
					local14 = 5 - this.aClass3_Sub41_5.anInt2803 * 62066237;
					if (local14 > local170) {
						local14 = local170;
					}
					this.aClass62_1.method12848(this.aClass3_Sub41_5.aByteArray51, this.aClass3_Sub41_5.anInt2803 * 62066237, local14);
					if (this.aByte33 != 0) {
						for (local218 = 0; local218 < local14; local218++) {
							this.aClass3_Sub41_5.aByteArray51[local218 + this.aClass3_Sub41_5.anInt2803 * 62066237] ^= this.aByte33;
						}
					}
					this.aClass3_Sub41_5.anInt2803 += local14 * -918980331;
					if (this.aClass3_Sub41_5.anInt2803 * 62066237 >= 5) {
						this.aClass3_Sub41_5.anInt2803 = 0;
						local218 = this.aClass3_Sub41_5.method20269();
						local271 = this.aClass3_Sub41_5.method20275();
						@Pc(280) boolean local280 = (local271 & Integer.MIN_VALUE) != 0;
						@Pc(284) int local284 = local271 & Integer.MAX_VALUE;
						@Pc(292) long local292 = (long) local284 + ((long) local218 << 32);
						@Pc(298) Iterator local298;
						@Pc(305) Class3_Sub1_Sub12_Sub3 local305;
						if (local280) {
							local298 = this.aClass546_6.iterator();
							while (local298.hasNext()) {
								local305 = (Class3_Sub1_Sub12_Sub3) local298.next();
								if (local292 == local305.aLong297 * -2884094411549009029L) {
									this.aClass3_Sub1_Sub12_Sub3_2 = local305;
									break;
								}
							}
						} else {
							local298 = this.aClass546_5.iterator();
							while (local298.hasNext()) {
								local305 = (Class3_Sub1_Sub12_Sub3) local298.next();
								if (local292 == local305.aLong297 * -2884094411549009029L) {
									this.aClass3_Sub1_Sub12_Sub3_2 = local305;
									break;
								}
							}
						}
						if (this.aClass3_Sub1_Sub12_Sub3_2 == null) {
							throw new IOException();
						}
						this.anInt1111 = 1879355431;
						this.aClass3_Sub41_5.anInt2803 = 0;
						this.aClass3_Sub41_6.anInt2803 = 0;
					}
				} else {
					@Pc(365) Class3_Sub41 local365 = this.aClass3_Sub1_Sub12_Sub3_2.aClass3_Sub41_14;
					@Pc(453) int local453;
					if (local365 == null) {
						local218 = 5 - this.aClass3_Sub41_6.anInt2803 * 62066237;
						if (local218 > local170) {
							local218 = local170;
						}
						this.aClass62_1.method12848(this.aClass3_Sub41_6.aByteArray51, this.aClass3_Sub41_6.anInt2803 * 62066237, local218);
						if (this.aByte33 != 0) {
							for (local271 = 0; local271 < local218; local271++) {
								this.aClass3_Sub41_6.aByteArray51[this.aClass3_Sub41_6.anInt2803 * 62066237 + local271] ^= this.aByte33;
							}
						}
						this.aClass3_Sub41_6.anInt2803 += local218 * -918980331;
						if (this.aClass3_Sub41_6.anInt2803 * 62066237 >= 5) {
							this.aClass3_Sub41_6.anInt2803 = 0;
							local271 = this.aClass3_Sub41_6.method20269();
							local453 = this.aClass3_Sub41_6.method20275();
							@Pc(455) byte local455 = 5;
							if (local271 != 0) {
								local455 = 9;
							}
							local365 = this.aClass3_Sub1_Sub12_Sub3_2.aClass3_Sub41_14 = new Class3_Sub41(local455 + local453 + this.aClass3_Sub1_Sub12_Sub3_2.aByte98);
							local365.method20250(local271);
							local365.method20254(local453);
							this.anInt1111 += 1879355431;
						}
					} else {
						local218 = local365.aByteArray51.length - this.aClass3_Sub1_Sub12_Sub3_2.aByte98;
						local271 = 512 - this.anInt1111 * 243318259;
						if (local271 > local218 - local365.anInt2803 * 62066237) {
							local271 = local218 - local365.anInt2803 * 62066237;
						}
						if (local271 > local170) {
							local271 = local170;
						}
						this.aClass62_1.method12848(local365.aByteArray51, local365.anInt2803 * 62066237, local271);
						if (this.aByte33 != 0) {
							for (local453 = 0; local453 < local271; local453++) {
								local365.aByteArray51[local453 + local365.anInt2803 * 62066237] ^= this.aByte33;
							}
						}
						local365.anInt2803 += local271 * -918980331;
						this.anInt1111 += local271 * -483122373;
						if (local218 == local365.anInt2803 * 62066237) {
							this.aClass3_Sub1_Sub12_Sub3_2.method33669();
							this.aClass3_Sub1_Sub12_Sub3_2.aBoolean516 = false;
							this.aClass3_Sub1_Sub12_Sub3_2 = null;
						} else if (this.anInt1111 * 243318259 == 512) {
							this.anInt1111 = 0;
							this.aClass3_Sub1_Sub12_Sub3_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(615) IOException local615) {
			try {
				this.aClass62_1.method12850();
			} catch (@Pc(621) Exception local621) {
			}
			this.aClass62_1 = null;
			this.anInt1113 += 876183929;
			this.anInt1115 = -1552214166;
			return this.method9835() == 0 && this.method9828() == 0;
		}
	}

	@OriginalMember(owner = "client!aey", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!any;", line = 67)
	public static RuntimeException_Sub3 method9866(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub3 local5;
		if (arg0 instanceof RuntimeException_Sub3) {
			local5 = (RuntimeException_Sub3) arg0;
			local5.aString122 = local5.aString122 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub3(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!aey", name = "u", descriptor = "(Ljava/lang/Object;ZI)V", line = 166)
	@Override
	public void method9825(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass62_1 != null) {
			try {
				this.aClass62_1.method12850();
			} catch (@Pc(8) Exception local8) {
			}
			this.aClass62_1 = null;
		}
		this.aClass62_1 = (Class62) arg0;
		this.method9863();
		this.method9826(arg1);
		this.aClass3_Sub41_5.anInt2803 = 0;
		this.aClass3_Sub41_6.anInt2803 = 0;
		this.aClass3_Sub1_Sub12_Sub3_2 = null;
		while (true) {
			@Pc(39) Class3_Sub1_Sub12_Sub3 local39 = (Class3_Sub1_Sub12_Sub3) this.aClass546_5.method32622();
			if (local39 == null) {
				while (true) {
					local39 = (Class3_Sub1_Sub12_Sub3) this.aClass546_6.method32622();
					if (local39 == null) {
						if (this.aByte33 != 0) {
							try {
								this.aClass3_Sub41_4.anInt2803 = 0;
								this.aClass3_Sub41_4.method20250(4);
								this.aClass3_Sub41_4.method20250(this.aByte33);
								this.aClass3_Sub41_4.method20254(0);
								this.aClass62_1.method12846(this.aClass3_Sub41_4.aByteArray51, 0, this.aClass3_Sub41_4.aByteArray51.length);
							} catch (@Pc(108) IOException local108) {
								try {
									this.aClass62_1.method12850();
								} catch (@Pc(114) Exception local114) {
								}
								this.aClass62_1 = null;
								this.anInt1113 += 876183929;
								this.anInt1115 = -1552214166;
							}
						}
						this.anInt1110 = 0;
						this.aLong39 = Class176.method23413() * 97482058490689217L;
						return;
					}
					local39.aClass3_Sub41_14 = null;
					this.aClass546_7.method32621(local39);
				}
			}
			local39.aClass3_Sub41_14 = null;
			this.aClass546_8.method32621(local39);
		}
	}

	@OriginalMember(owner = "client!aey", name = "aa", descriptor = "(Ljava/lang/Object;Z)V", line = 166)
	@Override
	public void method9846(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass62_1 != null) {
			try {
				this.aClass62_1.method12850();
			} catch (@Pc(8) Exception local8) {
			}
			this.aClass62_1 = null;
		}
		this.aClass62_1 = (Class62) arg0;
		this.method9863();
		this.method9826(arg1);
		this.aClass3_Sub41_5.anInt2803 = 0;
		this.aClass3_Sub41_6.anInt2803 = 0;
		this.aClass3_Sub1_Sub12_Sub3_2 = null;
		while (true) {
			@Pc(39) Class3_Sub1_Sub12_Sub3 local39 = (Class3_Sub1_Sub12_Sub3) this.aClass546_5.method32622();
			if (local39 == null) {
				while (true) {
					local39 = (Class3_Sub1_Sub12_Sub3) this.aClass546_6.method32622();
					if (local39 == null) {
						if (this.aByte33 != 0) {
							try {
								this.aClass3_Sub41_4.anInt2803 = 0;
								this.aClass3_Sub41_4.method20250(4);
								this.aClass3_Sub41_4.method20250(this.aByte33);
								this.aClass3_Sub41_4.method20254(0);
								this.aClass62_1.method12846(this.aClass3_Sub41_4.aByteArray51, 0, this.aClass3_Sub41_4.aByteArray51.length);
							} catch (@Pc(108) IOException local108) {
								try {
									this.aClass62_1.method12850();
								} catch (@Pc(114) Exception local114) {
								}
								this.aClass62_1 = null;
								this.anInt1113 += 876183929;
								this.anInt1115 = -1552214166;
							}
						}
						this.anInt1110 = 0;
						this.aLong39 = Class176.method23413() * 97482058490689217L;
						return;
					}
					local39.aClass3_Sub41_14 = null;
					this.aClass546_7.method32621(local39);
				}
			}
			local39.aClass3_Sub41_14 = null;
			this.aClass546_8.method32621(local39);
		}
	}

	@OriginalMember(owner = "client!aey", name = "ap", descriptor = "(B)V", line = 214)
	void method9863() {
		if (this.aClass62_1 == null) {
			return;
		}
		try {
			this.aClass3_Sub41_4.anInt2803 = 0;
			this.aClass3_Sub41_4.method20250(6);
			this.aClass3_Sub41_4.method20253(3);
			this.aClass3_Sub41_4.method20251(0);
			this.aClass62_1.method12846(this.aClass3_Sub41_4.aByteArray51, 0, this.aClass3_Sub41_4.aByteArray51.length);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass62_1.method12850();
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass62_1 = null;
			this.anInt1113 += 876183929;
			this.anInt1115 = -1552214166;
		}
	}

	@OriginalMember(owner = "client!aey", name = "ab", descriptor = "()V", line = 214)
	void method9864() {
		if (this.aClass62_1 == null) {
			return;
		}
		try {
			this.aClass3_Sub41_4.anInt2803 = 0;
			this.aClass3_Sub41_4.method20250(6);
			this.aClass3_Sub41_4.method20253(3);
			this.aClass3_Sub41_4.method20251(0);
			this.aClass62_1.method12846(this.aClass3_Sub41_4.aByteArray51, 0, this.aClass3_Sub41_4.aByteArray51.length);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass62_1.method12850();
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass62_1 = null;
			this.anInt1113 += 876183929;
			this.anInt1115 = -1552214166;
		}
	}

	@OriginalMember(owner = "client!aey", name = "y", descriptor = "(ZI)V", line = 234)
	@Override
	public void method9826(@OriginalArg(0) boolean arg0) {
		if (this.aClass62_1 == null) {
			return;
		}
		try {
			this.aClass3_Sub41_4.anInt2803 = 0;
			this.aClass3_Sub41_4.method20250(arg0 ? 2 : 3);
			this.aClass3_Sub41_4.method20256(0L);
			this.aClass62_1.method12846(this.aClass3_Sub41_4.aByteArray51, 0, this.aClass3_Sub41_4.aByteArray51.length);
		} catch (@Pc(35) IOException local35) {
			try {
				this.aClass62_1.method12850();
			} catch (@Pc(41) Exception local41) {
			}
			this.aClass62_1 = null;
			this.anInt1113 += 876183929;
			this.anInt1115 = -1552214166;
		}
	}

	@OriginalMember(owner = "client!aey", name = "an", descriptor = "(Z)V", line = 234)
	@Override
	public void method9845(@OriginalArg(0) boolean arg0) {
		if (this.aClass62_1 == null) {
			return;
		}
		try {
			this.aClass3_Sub41_4.anInt2803 = 0;
			this.aClass3_Sub41_4.method20250(arg0 ? 2 : 3);
			this.aClass3_Sub41_4.method20256(0L);
			this.aClass62_1.method12846(this.aClass3_Sub41_4.aByteArray51, 0, this.aClass3_Sub41_4.aByteArray51.length);
		} catch (@Pc(35) IOException local35) {
			try {
				this.aClass62_1.method12850();
			} catch (@Pc(41) Exception local41) {
			}
			this.aClass62_1 = null;
			this.anInt1113 += 876183929;
			this.anInt1115 = -1552214166;
		}
	}

	@OriginalMember(owner = "client!aey", name = "ah", descriptor = "(Z)V", line = 234)
	@Override
	public void method9847(@OriginalArg(0) boolean arg0) {
		if (this.aClass62_1 == null) {
			return;
		}
		try {
			this.aClass3_Sub41_4.anInt2803 = 0;
			this.aClass3_Sub41_4.method20250(arg0 ? 2 : 3);
			this.aClass3_Sub41_4.method20256(0L);
			this.aClass62_1.method12846(this.aClass3_Sub41_4.aByteArray51, 0, this.aClass3_Sub41_4.aByteArray51.length);
		} catch (@Pc(35) IOException local35) {
			try {
				this.aClass62_1.method12850();
			} catch (@Pc(41) Exception local41) {
			}
			this.aClass62_1 = null;
			this.anInt1113 += 876183929;
			this.anInt1115 = -1552214166;
		}
	}

	@OriginalMember(owner = "client!aey", name = "b", descriptor = "(I)V", line = 253)
	@Override
	public void method9827() {
		if (this.aClass62_1 == null) {
			return;
		}
		try {
			this.aClass3_Sub41_4.anInt2803 = 0;
			this.aClass3_Sub41_4.method20250(7);
			this.aClass3_Sub41_4.method20256(0L);
			this.aClass62_1.method12846(this.aClass3_Sub41_4.aByteArray51, 0, this.aClass3_Sub41_4.aByteArray51.length);
		} catch (@Pc(31) IOException local31) {
			try {
				this.aClass62_1.method12850();
			} catch (@Pc(37) Exception local37) {
			}
			this.aClass62_1 = null;
			this.anInt1113 += 876183929;
			this.anInt1115 = -1552214166;
		}
	}

	@OriginalMember(owner = "client!aey", name = "aj", descriptor = "()V", line = 253)
	@Override
	public void method9849() {
		if (this.aClass62_1 == null) {
			return;
		}
		try {
			this.aClass3_Sub41_4.anInt2803 = 0;
			this.aClass3_Sub41_4.method20250(7);
			this.aClass3_Sub41_4.method20256(0L);
			this.aClass62_1.method12846(this.aClass3_Sub41_4.aByteArray51, 0, this.aClass3_Sub41_4.aByteArray51.length);
		} catch (@Pc(31) IOException local31) {
			try {
				this.aClass62_1.method12850();
			} catch (@Pc(37) Exception local37) {
			}
			this.aClass62_1 = null;
			this.anInt1113 += 876183929;
			this.anInt1115 = -1552214166;
		}
	}

	@OriginalMember(owner = "client!aey", name = "as", descriptor = "()V", line = 253)
	@Override
	public void method9850() {
		if (this.aClass62_1 == null) {
			return;
		}
		try {
			this.aClass3_Sub41_4.anInt2803 = 0;
			this.aClass3_Sub41_4.method20250(7);
			this.aClass3_Sub41_4.method20256(0L);
			this.aClass62_1.method12846(this.aClass3_Sub41_4.aByteArray51, 0, this.aClass3_Sub41_4.aByteArray51.length);
		} catch (@Pc(31) IOException local31) {
			try {
				this.aClass62_1.method12850();
			} catch (@Pc(37) Exception local37) {
			}
			this.aClass62_1 = null;
			this.anInt1113 += 876183929;
			this.anInt1115 = -1552214166;
		}
	}

	@OriginalMember(owner = "client!aey", name = "ai", descriptor = "()V", line = 253)
	@Override
	public void method9851() {
		if (this.aClass62_1 == null) {
			return;
		}
		try {
			this.aClass3_Sub41_4.anInt2803 = 0;
			this.aClass3_Sub41_4.method20250(7);
			this.aClass3_Sub41_4.method20256(0L);
			this.aClass62_1.method12846(this.aClass3_Sub41_4.aByteArray51, 0, this.aClass3_Sub41_4.aByteArray51.length);
		} catch (@Pc(31) IOException local31) {
			try {
				this.aClass62_1.method12850();
			} catch (@Pc(37) Exception local37) {
			}
			this.aClass62_1 = null;
			this.anInt1113 += 876183929;
			this.anInt1115 = -1552214166;
		}
	}

	@OriginalMember(owner = "client!aey", name = "c", descriptor = "(B)V", line = 272)
	@Override
	public void method9817() {
		if (this.aClass62_1 != null) {
			this.aClass62_1.method12850();
		}
	}

	@OriginalMember(owner = "client!aey", name = "aq", descriptor = "()V", line = 272)
	@Override
	public void method9824() {
		if (this.aClass62_1 != null) {
			this.aClass62_1.method12850();
		}
	}

	@OriginalMember(owner = "client!aey", name = "av", descriptor = "()V", line = 272)
	@Override
	public void method9853() {
		if (this.aClass62_1 != null) {
			this.aClass62_1.method12850();
		}
	}

	@OriginalMember(owner = "client!aey", name = "ax", descriptor = "()V", line = 276)
	@Override
	public void method9854() {
		if (this.aClass62_1 != null) {
			this.aClass62_1.method12857();
		}
	}

	@OriginalMember(owner = "client!aey", name = "az", descriptor = "()V", line = 276)
	@Override
	public void method9855() {
		if (this.aClass62_1 != null) {
			this.aClass62_1.method12857();
		}
	}

	@OriginalMember(owner = "client!aey", name = "z", descriptor = "(B)V", line = 276)
	@Override
	public void method9837() {
		if (this.aClass62_1 != null) {
			this.aClass62_1.method12857();
		}
	}

	@OriginalMember(owner = "client!aey", name = "al", descriptor = "()V", line = 276)
	@Override
	public void method9856() {
		if (this.aClass62_1 != null) {
			this.aClass62_1.method12857();
		}
	}

	@OriginalMember(owner = "client!aey", name = "ny", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 6469)
	static final void method9865(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray27 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}
}

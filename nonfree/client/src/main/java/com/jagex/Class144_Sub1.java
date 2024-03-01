package com.jagex;

import java.io.IOException;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aik")
public class Class144_Sub1 extends Class144 {

	@OriginalMember(owner = "client!aik", name = "gx", descriptor = "Lclient!py;")
	public static Class497 aClass497_42;

	@OriginalMember(owner = "client!aik", name = "g", descriptor = "Lclient!uz;")
	Class160 aClass160_1;

	@OriginalMember(owner = "client!aik", name = "q", descriptor = "(II)V", line = 13)
	@Override
	void method11161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClass160_1.method14713();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass160_1 = null;
		this.anInt1338 += 70225315;
		this.anInt1337 = 697773497;
		this.aByte22 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1340 = arg0 * -2057883105;
		this.anInt1339 = arg1 * -1058402615;
	}

	@OriginalMember(owner = "client!aik", name = "x", descriptor = "(II)V", line = 13)
	@Override
	void method11153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClass160_1.method14713();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass160_1 = null;
		this.anInt1338 += 70225315;
		this.anInt1337 = 697773497;
		this.aByte22 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1340 = arg0 * -2057883105;
		this.anInt1339 = arg1 * -1058402615;
	}

	@OriginalMember(owner = "client!aik", name = "w", descriptor = "(IIB)V", line = 13)
	@Override
	void method11149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClass160_1.method14713();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass160_1 = null;
		this.anInt1338 += 70225315;
		this.anInt1337 = 697773497;
		this.aByte22 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1340 = arg0 * -2057883105;
		this.anInt1339 = arg1 * -1058402615;
	}

	@OriginalMember(owner = "client!aik", name = "l", descriptor = "(I)Z", line = 25)
	@Override
	public boolean method11150() {
		@Pc(14) int local14;
		if (this.aClass160_1 != null) {
			@Pc(6) long local6 = Class305.method26796();
			local14 = (int) (local6 - this.aLong45 * -1879205428230144291L);
			this.aLong45 = local6 * 416383678038968693L;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt1331 += local14 * 2082734059;
			if (this.anInt1331 * 63451331 > 30000) {
				try {
					this.aClass160_1.method14713();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass160_1 = null;
			}
		}
		if (this.aClass160_1 == null) {
			return this.method11155() == 0 && this.method11147() == 0;
		}
		try {
			@Pc(69) Class93_Sub1_Sub16_Sub3 local69;
			for (local69 = (Class93_Sub1_Sub16_Sub3) this.aClass18_7.method246(); local69 != null; local69 = (Class93_Sub1_Sub16_Sub3) this.aClass18_7.method253()) {
				this.aClass93_Sub41_5.anInt3070 = 0;
				this.aClass93_Sub41_5.method22510(1);
				this.aClass93_Sub41_5.method22397(local69.aLong233 * -5980455722457358841L);
				this.aClass160_1.method14712(this.aClass93_Sub41_5.aByteArray58, 0, this.aClass93_Sub41_5.aByteArray58.length);
				this.aClass18_9.method268(local69);
			}
			for (local69 = (Class93_Sub1_Sub16_Sub3) this.aClass18_8.method246(); local69 != null; local69 = (Class93_Sub1_Sub16_Sub3) this.aClass18_8.method253()) {
				this.aClass93_Sub41_5.anInt3070 = 0;
				this.aClass93_Sub41_5.method22510(0);
				this.aClass93_Sub41_5.method22397(local69.aLong233 * -5980455722457358841L);
				this.aClass160_1.method14712(this.aClass93_Sub41_5.aByteArray58, 0, this.aClass93_Sub41_5.aByteArray58.length);
				this.aClass18_6.method268(local69);
			}
			for (@Pc(162) int local162 = 0; local162 < 100; local162++) {
				@Pc(170) int local170 = this.aClass160_1.method14725();
				if (local170 < 0) {
					throw new IOException();
				}
				if (local170 == 0) {
					break;
				}
				this.anInt1331 = 0;
				@Pc(219) int local219;
				@Pc(272) int local272;
				if (this.aClass93_Sub1_Sub16_Sub3_2 == null) {
					local14 = 5 - this.aClass93_Sub41_6.anInt3070 * 212851357;
					if (local14 > local170) {
						local14 = local170;
					}
					this.aClass160_1.method14711(this.aClass93_Sub41_6.aByteArray58, this.aClass93_Sub41_6.anInt3070 * 212851357, local14);
					if (this.aByte22 != 0) {
						for (local219 = 0; local219 < local14; local219++) {
							this.aClass93_Sub41_6.aByteArray58[this.aClass93_Sub41_6.anInt3070 * 212851357 + local219] ^= this.aByte22;
						}
					}
					this.aClass93_Sub41_6.anInt3070 += local14 * -1445626955;
					if (this.aClass93_Sub41_6.anInt3070 * 212851357 >= 5) {
						this.aClass93_Sub41_6.anInt3070 = 0;
						local219 = this.aClass93_Sub41_6.method22413();
						local272 = this.aClass93_Sub41_6.method22419();
						@Pc(280) boolean local280 = (local272 & Integer.MIN_VALUE) != 0;
						@Pc(284) int local284 = local272 & Integer.MAX_VALUE;
						@Pc(292) long local292 = (long) local284 + ((long) local219 << 32);
						@Pc(298) Iterator local298;
						@Pc(305) Class93_Sub1_Sub16_Sub3 local305;
						if (local280) {
							local298 = this.aClass18_6.iterator();
							while (local298.hasNext()) {
								local305 = (Class93_Sub1_Sub16_Sub3) local298.next();
								if (local305.aLong233 * -5980455722457358841L == local292) {
									this.aClass93_Sub1_Sub16_Sub3_2 = local305;
									break;
								}
							}
						} else {
							local298 = this.aClass18_9.iterator();
							while (local298.hasNext()) {
								local305 = (Class93_Sub1_Sub16_Sub3) local298.next();
								if (local292 == local305.aLong233 * -5980455722457358841L) {
									this.aClass93_Sub1_Sub16_Sub3_2 = local305;
									break;
								}
							}
						}
						if (this.aClass93_Sub1_Sub16_Sub3_2 == null) {
							throw new IOException();
						}
						this.anInt1342 = -1763880151;
						this.aClass93_Sub41_6.anInt3070 = 0;
						this.aClass93_Sub41_7.anInt3070 = 0;
					}
				} else {
					@Pc(365) Class93_Sub41 local365 = this.aClass93_Sub1_Sub16_Sub3_2.aClass93_Sub41_13;
					@Pc(454) int local454;
					if (local365 == null) {
						local219 = 5 - this.aClass93_Sub41_7.anInt3070 * 212851357;
						if (local219 > local170) {
							local219 = local170;
						}
						this.aClass160_1.method14711(this.aClass93_Sub41_7.aByteArray58, this.aClass93_Sub41_7.anInt3070 * 212851357, local219);
						if (this.aByte22 != 0) {
							for (local272 = 0; local272 < local219; local272++) {
								this.aClass93_Sub41_7.aByteArray58[this.aClass93_Sub41_7.anInt3070 * 212851357 + local272] ^= this.aByte22;
							}
						}
						this.aClass93_Sub41_7.anInt3070 += local219 * -1445626955;
						if (this.aClass93_Sub41_7.anInt3070 * 212851357 >= 5) {
							this.aClass93_Sub41_7.anInt3070 = 0;
							local272 = this.aClass93_Sub41_7.method22413();
							local454 = this.aClass93_Sub41_7.method22419();
							@Pc(456) byte local456 = 5;
							if (local272 != Class484.aClass484_5.method36920()) {
								local456 = 9;
							}
							local365 = this.aClass93_Sub1_Sub16_Sub3_2.aClass93_Sub41_13 = new Class93_Sub41(this.aClass93_Sub1_Sub16_Sub3_2.aByte93 + local454 + local456);
							local365.method22510(local272);
							local365.method22395(local454);
							this.anInt1342 += -1763880151;
						}
					} else {
						local219 = local365.aByteArray58.length - this.aClass93_Sub1_Sub16_Sub3_2.aByte93;
						local272 = 102400 - this.anInt1342 * -997925507;
						if (local272 > local219 - local365.anInt3070 * 212851357) {
							local272 = local219 - local365.anInt3070 * 212851357;
						}
						if (local272 > local170) {
							local272 = local170;
						}
						this.aClass160_1.method14711(local365.aByteArray58, local365.anInt3070 * 212851357, local272);
						if (this.aByte22 != 0) {
							for (local454 = 0; local454 < local272; local454++) {
								local365.aByteArray58[local454 + local365.anInt3070 * 212851357] ^= this.aByte22;
							}
						}
						local365.anInt3070 += local272 * -1445626955;
						this.anInt1342 += local272 * 506217429;
						if (local219 == local365.anInt3070 * 212851357) {
							this.aClass93_Sub1_Sub16_Sub3_2.method23976();
							this.aClass93_Sub1_Sub16_Sub3_2.aBoolean546 = false;
							this.aClass93_Sub1_Sub16_Sub3_2 = null;
						} else if (this.anInt1342 * -997925507 == 102400) {
							this.anInt1342 = 0;
							this.aClass93_Sub1_Sub16_Sub3_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(616) IOException local616) {
			try {
				this.aClass160_1.method14713();
			} catch (@Pc(622) Exception local622) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
			return this.method11155() == 0 && this.method11147() == 0;
		}
	}

	@OriginalMember(owner = "client!aik", name = "b", descriptor = "()Z", line = 25)
	@Override
	public boolean method11163() {
		@Pc(14) int local14;
		if (this.aClass160_1 != null) {
			@Pc(6) long local6 = Class305.method26796();
			local14 = (int) (local6 - this.aLong45 * -1879205428230144291L);
			this.aLong45 = local6 * 416383678038968693L;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt1331 += local14 * 2082734059;
			if (this.anInt1331 * 63451331 > 30000) {
				try {
					this.aClass160_1.method14713();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass160_1 = null;
			}
		}
		if (this.aClass160_1 == null) {
			return this.method11155() == 0 && this.method11147() == 0;
		}
		try {
			@Pc(69) Class93_Sub1_Sub16_Sub3 local69;
			for (local69 = (Class93_Sub1_Sub16_Sub3) this.aClass18_7.method246(); local69 != null; local69 = (Class93_Sub1_Sub16_Sub3) this.aClass18_7.method253()) {
				this.aClass93_Sub41_5.anInt3070 = 0;
				this.aClass93_Sub41_5.method22510(1);
				this.aClass93_Sub41_5.method22397(local69.aLong233 * -5980455722457358841L);
				this.aClass160_1.method14712(this.aClass93_Sub41_5.aByteArray58, 0, this.aClass93_Sub41_5.aByteArray58.length);
				this.aClass18_9.method268(local69);
			}
			for (local69 = (Class93_Sub1_Sub16_Sub3) this.aClass18_8.method246(); local69 != null; local69 = (Class93_Sub1_Sub16_Sub3) this.aClass18_8.method253()) {
				this.aClass93_Sub41_5.anInt3070 = 0;
				this.aClass93_Sub41_5.method22510(0);
				this.aClass93_Sub41_5.method22397(local69.aLong233 * -5980455722457358841L);
				this.aClass160_1.method14712(this.aClass93_Sub41_5.aByteArray58, 0, this.aClass93_Sub41_5.aByteArray58.length);
				this.aClass18_6.method268(local69);
			}
			for (@Pc(162) int local162 = 0; local162 < 100; local162++) {
				@Pc(170) int local170 = this.aClass160_1.method14725();
				if (local170 < 0) {
					throw new IOException();
				}
				if (local170 == 0) {
					break;
				}
				this.anInt1331 = 0;
				@Pc(219) int local219;
				@Pc(272) int local272;
				if (this.aClass93_Sub1_Sub16_Sub3_2 == null) {
					local14 = 5 - this.aClass93_Sub41_6.anInt3070 * 212851357;
					if (local14 > local170) {
						local14 = local170;
					}
					this.aClass160_1.method14711(this.aClass93_Sub41_6.aByteArray58, this.aClass93_Sub41_6.anInt3070 * 212851357, local14);
					if (this.aByte22 != 0) {
						for (local219 = 0; local219 < local14; local219++) {
							this.aClass93_Sub41_6.aByteArray58[this.aClass93_Sub41_6.anInt3070 * 212851357 + local219] ^= this.aByte22;
						}
					}
					this.aClass93_Sub41_6.anInt3070 += local14 * -1445626955;
					if (this.aClass93_Sub41_6.anInt3070 * 212851357 >= 5) {
						this.aClass93_Sub41_6.anInt3070 = 0;
						local219 = this.aClass93_Sub41_6.method22413();
						local272 = this.aClass93_Sub41_6.method22419();
						@Pc(280) boolean local280 = (local272 & Integer.MIN_VALUE) != 0;
						@Pc(284) int local284 = local272 & Integer.MAX_VALUE;
						@Pc(292) long local292 = (long) local284 + ((long) local219 << 32);
						@Pc(298) Iterator local298;
						@Pc(305) Class93_Sub1_Sub16_Sub3 local305;
						if (local280) {
							local298 = this.aClass18_6.iterator();
							while (local298.hasNext()) {
								local305 = (Class93_Sub1_Sub16_Sub3) local298.next();
								if (local305.aLong233 * -5980455722457358841L == local292) {
									this.aClass93_Sub1_Sub16_Sub3_2 = local305;
									break;
								}
							}
						} else {
							local298 = this.aClass18_9.iterator();
							while (local298.hasNext()) {
								local305 = (Class93_Sub1_Sub16_Sub3) local298.next();
								if (local292 == local305.aLong233 * -5980455722457358841L) {
									this.aClass93_Sub1_Sub16_Sub3_2 = local305;
									break;
								}
							}
						}
						if (this.aClass93_Sub1_Sub16_Sub3_2 == null) {
							throw new IOException();
						}
						this.anInt1342 = -1763880151;
						this.aClass93_Sub41_6.anInt3070 = 0;
						this.aClass93_Sub41_7.anInt3070 = 0;
					}
				} else {
					@Pc(365) Class93_Sub41 local365 = this.aClass93_Sub1_Sub16_Sub3_2.aClass93_Sub41_13;
					@Pc(454) int local454;
					if (local365 == null) {
						local219 = 5 - this.aClass93_Sub41_7.anInt3070 * 212851357;
						if (local219 > local170) {
							local219 = local170;
						}
						this.aClass160_1.method14711(this.aClass93_Sub41_7.aByteArray58, this.aClass93_Sub41_7.anInt3070 * 212851357, local219);
						if (this.aByte22 != 0) {
							for (local272 = 0; local272 < local219; local272++) {
								this.aClass93_Sub41_7.aByteArray58[this.aClass93_Sub41_7.anInt3070 * 212851357 + local272] ^= this.aByte22;
							}
						}
						this.aClass93_Sub41_7.anInt3070 += local219 * -1445626955;
						if (this.aClass93_Sub41_7.anInt3070 * 212851357 >= 5) {
							this.aClass93_Sub41_7.anInt3070 = 0;
							local272 = this.aClass93_Sub41_7.method22413();
							local454 = this.aClass93_Sub41_7.method22419();
							@Pc(456) byte local456 = 5;
							if (local272 != Class484.aClass484_5.method36920()) {
								local456 = 9;
							}
							local365 = this.aClass93_Sub1_Sub16_Sub3_2.aClass93_Sub41_13 = new Class93_Sub41(this.aClass93_Sub1_Sub16_Sub3_2.aByte93 + local454 + local456);
							local365.method22510(local272);
							local365.method22395(local454);
							this.anInt1342 += -1763880151;
						}
					} else {
						local219 = local365.aByteArray58.length - this.aClass93_Sub1_Sub16_Sub3_2.aByte93;
						local272 = 102400 - this.anInt1342 * -997925507;
						if (local272 > local219 - local365.anInt3070 * 212851357) {
							local272 = local219 - local365.anInt3070 * 212851357;
						}
						if (local272 > local170) {
							local272 = local170;
						}
						this.aClass160_1.method14711(local365.aByteArray58, local365.anInt3070 * 212851357, local272);
						if (this.aByte22 != 0) {
							for (local454 = 0; local454 < local272; local454++) {
								local365.aByteArray58[local454 + local365.anInt3070 * 212851357] ^= this.aByte22;
							}
						}
						local365.anInt3070 += local272 * -1445626955;
						this.anInt1342 += local272 * 506217429;
						if (local219 == local365.anInt3070 * 212851357) {
							this.aClass93_Sub1_Sub16_Sub3_2.method23976();
							this.aClass93_Sub1_Sub16_Sub3_2.aBoolean546 = false;
							this.aClass93_Sub1_Sub16_Sub3_2 = null;
						} else if (this.anInt1342 * -997925507 == 102400) {
							this.anInt1342 = 0;
							this.aClass93_Sub1_Sub16_Sub3_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(616) IOException local616) {
			try {
				this.aClass160_1.method14713();
			} catch (@Pc(622) Exception local622) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
			return this.method11155() == 0 && this.method11147() == 0;
		}
	}

	@OriginalMember(owner = "client!aik", name = "u", descriptor = "(Ljava/lang/Object;ZI)V", line = 166)
	@Override
	public void method11151(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass160_1 != null) {
			try {
				this.aClass160_1.method14713();
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass160_1 = null;
		}
		this.aClass160_1 = (Class160) arg0;
		this.method11181();
		this.method11144(arg1);
		this.aClass93_Sub41_6.anInt3070 = 0;
		this.aClass93_Sub41_7.anInt3070 = 0;
		this.aClass93_Sub1_Sub16_Sub3_2 = null;
		while (true) {
			@Pc(40) Class93_Sub1_Sub16_Sub3 local40 = (Class93_Sub1_Sub16_Sub3) this.aClass18_9.method244();
			if (local40 == null) {
				while (true) {
					local40 = (Class93_Sub1_Sub16_Sub3) this.aClass18_6.method244();
					if (local40 == null) {
						if (this.aByte22 != 0) {
							try {
								this.aClass93_Sub41_5.anInt3070 = 0;
								this.aClass93_Sub41_5.method22510(4);
								this.aClass93_Sub41_5.method22510(this.aByte22);
								this.aClass93_Sub41_5.method22395(0);
								this.aClass160_1.method14712(this.aClass93_Sub41_5.aByteArray58, 0, this.aClass93_Sub41_5.aByteArray58.length);
							} catch (@Pc(110) IOException local110) {
								try {
									this.aClass160_1.method14713();
								} catch (@Pc(116) Exception local116) {
								}
								this.aClass160_1 = null;
								this.anInt1338 += 70225315;
								this.anInt1337 = 1395546994;
							}
						}
						this.anInt1331 = 0;
						this.aLong45 = Class305.method26796() * 416383678038968693L;
						return;
					}
					local40.aClass93_Sub41_13 = null;
					this.aClass18_8.method268(local40);
				}
			}
			local40.aClass93_Sub41_13 = null;
			this.aClass18_7.method268(local40);
		}
	}

	@OriginalMember(owner = "client!aik", name = "h", descriptor = "(Ljava/lang/Object;Z)V", line = 166)
	@Override
	public void method11164(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass160_1 != null) {
			try {
				this.aClass160_1.method14713();
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass160_1 = null;
		}
		this.aClass160_1 = (Class160) arg0;
		this.method11181();
		this.method11144(arg1);
		this.aClass93_Sub41_6.anInt3070 = 0;
		this.aClass93_Sub41_7.anInt3070 = 0;
		this.aClass93_Sub1_Sub16_Sub3_2 = null;
		while (true) {
			@Pc(40) Class93_Sub1_Sub16_Sub3 local40 = (Class93_Sub1_Sub16_Sub3) this.aClass18_9.method244();
			if (local40 == null) {
				while (true) {
					local40 = (Class93_Sub1_Sub16_Sub3) this.aClass18_6.method244();
					if (local40 == null) {
						if (this.aByte22 != 0) {
							try {
								this.aClass93_Sub41_5.anInt3070 = 0;
								this.aClass93_Sub41_5.method22510(4);
								this.aClass93_Sub41_5.method22510(this.aByte22);
								this.aClass93_Sub41_5.method22395(0);
								this.aClass160_1.method14712(this.aClass93_Sub41_5.aByteArray58, 0, this.aClass93_Sub41_5.aByteArray58.length);
							} catch (@Pc(110) IOException local110) {
								try {
									this.aClass160_1.method14713();
								} catch (@Pc(116) Exception local116) {
								}
								this.aClass160_1 = null;
								this.anInt1338 += 70225315;
								this.anInt1337 = 1395546994;
							}
						}
						this.anInt1331 = 0;
						this.aLong45 = Class305.method26796() * 416383678038968693L;
						return;
					}
					local40.aClass93_Sub41_13 = null;
					this.aClass18_8.method268(local40);
				}
			}
			local40.aClass93_Sub41_13 = null;
			this.aClass18_7.method268(local40);
		}
	}

	@OriginalMember(owner = "client!aik", name = "ac", descriptor = "(I)V", line = 214)
	void method11181() {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aClass93_Sub41_5.anInt3070 = 0;
			this.aClass93_Sub41_5.method22510(6);
			this.aClass93_Sub41_5.method22394(4);
			this.aClass93_Sub41_5.method22454(0);
			this.aClass160_1.method14712(this.aClass93_Sub41_5.aByteArray58, 0, this.aClass93_Sub41_5.aByteArray58.length);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass160_1.method14713();
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "ai", descriptor = "()V", line = 214)
	void method11182() {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aClass93_Sub41_5.anInt3070 = 0;
			this.aClass93_Sub41_5.method22510(6);
			this.aClass93_Sub41_5.method22394(4);
			this.aClass93_Sub41_5.method22454(0);
			this.aClass160_1.method14712(this.aClass93_Sub41_5.aByteArray58, 0, this.aClass93_Sub41_5.aByteArray58.length);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass160_1.method14713();
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "aw", descriptor = "()V", line = 214)
	void method11183() {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aClass93_Sub41_5.anInt3070 = 0;
			this.aClass93_Sub41_5.method22510(6);
			this.aClass93_Sub41_5.method22394(4);
			this.aClass93_Sub41_5.method22454(0);
			this.aClass160_1.method14712(this.aClass93_Sub41_5.aByteArray58, 0, this.aClass93_Sub41_5.aByteArray58.length);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass160_1.method14713();
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "as", descriptor = "()V", line = 214)
	void method11184() {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aClass93_Sub41_5.anInt3070 = 0;
			this.aClass93_Sub41_5.method22510(6);
			this.aClass93_Sub41_5.method22394(4);
			this.aClass93_Sub41_5.method22454(0);
			this.aClass160_1.method14712(this.aClass93_Sub41_5.aByteArray58, 0, this.aClass93_Sub41_5.aByteArray58.length);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass160_1.method14713();
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "a", descriptor = "(Z)V", line = 234)
	@Override
	public void method11165(@OriginalArg(0) boolean arg0) {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aClass93_Sub41_5.anInt3070 = 0;
			this.aClass93_Sub41_5.method22510(arg0 ? 2 : 3);
			this.aClass93_Sub41_5.method22397(0L);
			this.aClass160_1.method14712(this.aClass93_Sub41_5.aByteArray58, 0, this.aClass93_Sub41_5.aByteArray58.length);
		} catch (@Pc(34) IOException local34) {
			try {
				this.aClass160_1.method14713();
			} catch (@Pc(40) Exception local40) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "z", descriptor = "(ZI)V", line = 234)
	@Override
	public void method11144(@OriginalArg(0) boolean arg0) {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aClass93_Sub41_5.anInt3070 = 0;
			this.aClass93_Sub41_5.method22510(arg0 ? 2 : 3);
			this.aClass93_Sub41_5.method22397(0L);
			this.aClass160_1.method14712(this.aClass93_Sub41_5.aByteArray58, 0, this.aClass93_Sub41_5.aByteArray58.length);
		} catch (@Pc(34) IOException local34) {
			try {
				this.aClass160_1.method14713();
			} catch (@Pc(40) Exception local40) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "i", descriptor = "()V", line = 253)
	@Override
	public void method11167() {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aClass93_Sub41_5.anInt3070 = 0;
			this.aClass93_Sub41_5.method22510(7);
			this.aClass93_Sub41_5.method22397(0L);
			this.aClass160_1.method14712(this.aClass93_Sub41_5.aByteArray58, 0, this.aClass93_Sub41_5.aByteArray58.length);
		} catch (@Pc(30) IOException local30) {
			try {
				this.aClass160_1.method14713();
			} catch (@Pc(36) Exception local36) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "p", descriptor = "(I)V", line = 253)
	@Override
	public void method11148() {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aClass93_Sub41_5.anInt3070 = 0;
			this.aClass93_Sub41_5.method22510(7);
			this.aClass93_Sub41_5.method22397(0L);
			this.aClass160_1.method14712(this.aClass93_Sub41_5.aByteArray58, 0, this.aClass93_Sub41_5.aByteArray58.length);
		} catch (@Pc(30) IOException local30) {
			try {
				this.aClass160_1.method14713();
			} catch (@Pc(36) Exception local36) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "g", descriptor = "()V", line = 253)
	@Override
	public void method11166() {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aClass93_Sub41_5.anInt3070 = 0;
			this.aClass93_Sub41_5.method22510(7);
			this.aClass93_Sub41_5.method22397(0L);
			this.aClass160_1.method14712(this.aClass93_Sub41_5.aByteArray58, 0, this.aClass93_Sub41_5.aByteArray58.length);
		} catch (@Pc(30) IOException local30) {
			try {
				this.aClass160_1.method14713();
			} catch (@Pc(36) Exception local36) {
			}
			this.aClass160_1 = null;
			this.anInt1338 += 70225315;
			this.anInt1337 = 1395546994;
		}
	}

	@OriginalMember(owner = "client!aik", name = "d", descriptor = "(I)V", line = 272)
	@Override
	public void method11154() {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method14713();
		}
	}

	@OriginalMember(owner = "client!aik", name = "ae", descriptor = "()V", line = 272)
	@Override
	public void method11170() {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method14713();
		}
	}

	@OriginalMember(owner = "client!aik", name = "t", descriptor = "()V", line = 272)
	@Override
	public void method11159() {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method14713();
		}
	}

	@OriginalMember(owner = "client!aik", name = "j", descriptor = "()V", line = 272)
	@Override
	public void method11168() {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method14713();
		}
	}

	@OriginalMember(owner = "client!aik", name = "ag", descriptor = "()V", line = 276)
	@Override
	public void method11171() {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method14714();
		}
	}

	@OriginalMember(owner = "client!aik", name = "ah", descriptor = "()V", line = 276)
	@Override
	public void method11172() {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method14714();
		}
	}

	@OriginalMember(owner = "client!aik", name = "c", descriptor = "(I)V", line = 276)
	@Override
	public void method11169() {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method14714();
		}
	}

	@OriginalMember(owner = "client!aik", name = "al", descriptor = "()V", line = 276)
	@Override
	public void method11173() {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method14714();
		}
	}

	@OriginalMember(owner = "client!aik", name = "aec", descriptor = "(Lclient!yf;I)V", line = 10347)
	static final void method11185(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local13 | local23;
	}
}

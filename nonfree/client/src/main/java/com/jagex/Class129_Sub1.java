package com.jagex;

import java.io.IOException;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aij")
public class Class129_Sub1 extends Class129 {

	@OriginalMember(owner = "client!aij", name = "n", descriptor = "Lclient!ta;")
	Class139 aClass139_2;

	@OriginalMember(owner = "client!aij", name = "w", descriptor = "(IIB)V", line = 13)
	@Override
	void method12203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClass139_2.method14345();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass139_2 = null;
		this.anInt1344 += 1323405863;
		this.anInt1345 = -836467277;
		this.aByte45 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1346 = arg0 * 624355545;
		this.anInt1342 = arg1 * -1826868259;
	}

	@OriginalMember(owner = "client!aij", name = "b", descriptor = "(II)V", line = 13)
	@Override
	void method12194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClass139_2.method14345();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass139_2 = null;
		this.anInt1344 += 1323405863;
		this.anInt1345 = -836467277;
		this.aByte45 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1346 = arg0 * 624355545;
		this.anInt1342 = arg1 * -1826868259;
	}

	@OriginalMember(owner = "client!aij", name = "t", descriptor = "(I)Z", line = 25)
	@Override
	public boolean method12196() {
		@Pc(13) int local13;
		if (this.aClass139_2 != null) {
			@Pc(5) long local5 = Class280.method26667();
			local13 = (int) (local5 - this.aLong49 * -8040290761580816281L);
			this.aLong49 = local5 * -1928393657558056105L;
			if (local13 > 200) {
				local13 = 200;
			}
			this.anInt1343 += local13 * 1431766545;
			if (this.anInt1343 * -229856527 > 30000) {
				try {
					this.aClass139_2.method14345();
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass139_2 = null;
			}
		}
		if (this.aClass139_2 == null) {
			return this.method12190() == 0 && this.method12188() == 0;
		}
		try {
			@Pc(68) Class77_Sub1_Sub18_Sub2 local68;
			for (local68 = (Class77_Sub1_Sub18_Sub2) this.aClass691_6.method36335(); local68 != null; local68 = (Class77_Sub1_Sub18_Sub2) this.aClass691_6.method36340()) {
				this.aClass77_Sub39_7.anInt3089 = 0;
				this.aClass77_Sub39_7.method22403(1);
				this.aClass77_Sub39_7.method22424(local68.aLong230 * -753566336061658369L);
				this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
				this.aClass691_5.method36326(local68);
			}
			for (local68 = (Class77_Sub1_Sub18_Sub2) this.aClass691_7.method36335(); local68 != null; local68 = (Class77_Sub1_Sub18_Sub2) this.aClass691_7.method36340()) {
				this.aClass77_Sub39_7.anInt3089 = 0;
				this.aClass77_Sub39_7.method22403(0);
				this.aClass77_Sub39_7.method22424(local68.aLong230 * -753566336061658369L);
				this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
				this.aClass691_8.method36326(local68);
			}
			for (@Pc(161) int local161 = 0; local161 < 100; local161++) {
				@Pc(169) int local169 = this.aClass139_2.method14340();
				if (local169 < 0) {
					throw new IOException();
				}
				if (local169 == 0) {
					break;
				}
				this.anInt1343 = 0;
				@Pc(216) int local216;
				@Pc(269) int local269;
				if (this.aClass77_Sub1_Sub18_Sub2_2 == null) {
					local13 = 5 - this.aClass77_Sub39_5.anInt3089 * 31645619;
					if (local13 > local169) {
						local13 = local169;
					}
					this.aClass139_2.method14339(this.aClass77_Sub39_5.aByteArray53, this.aClass77_Sub39_5.anInt3089 * 31645619, local13);
					if (this.aByte45 != 0) {
						for (local216 = 0; local216 < local13; local216++) {
							this.aClass77_Sub39_5.aByteArray53[local216 + this.aClass77_Sub39_5.anInt3089 * 31645619] ^= this.aByte45;
						}
					}
					this.aClass77_Sub39_5.anInt3089 += local13 * -1387468933;
					if (this.aClass77_Sub39_5.anInt3089 * 31645619 >= 5) {
						this.aClass77_Sub39_5.anInt3089 = 0;
						local216 = this.aClass77_Sub39_5.method22478();
						local269 = this.aClass77_Sub39_5.method22500();
						@Pc(278) boolean local278 = (local269 & Integer.MIN_VALUE) != 0;
						@Pc(282) int local282 = local269 & Integer.MAX_VALUE;
						@Pc(290) long local290 = (long) local282 + ((long) local216 << 32);
						@Pc(296) Iterator local296;
						@Pc(303) Class77_Sub1_Sub18_Sub2 local303;
						if (local278) {
							local296 = this.aClass691_8.iterator();
							while (local296.hasNext()) {
								local303 = (Class77_Sub1_Sub18_Sub2) local296.next();
								if (local290 == local303.aLong230 * -753566336061658369L) {
									this.aClass77_Sub1_Sub18_Sub2_2 = local303;
									break;
								}
							}
						} else {
							local296 = this.aClass691_5.iterator();
							while (local296.hasNext()) {
								local303 = (Class77_Sub1_Sub18_Sub2) local296.next();
								if (local290 == local303.aLong230 * -753566336061658369L) {
									this.aClass77_Sub1_Sub18_Sub2_2 = local303;
									break;
								}
							}
						}
						if (this.aClass77_Sub1_Sub18_Sub2_2 == null) {
							throw new IOException();
						}
						this.anInt1347 = -708365043;
						this.aClass77_Sub39_5.anInt3089 = 0;
						this.aClass77_Sub39_6.anInt3089 = 0;
					}
				} else {
					@Pc(363) Class77_Sub39 local363 = this.aClass77_Sub1_Sub18_Sub2_2.aClass77_Sub39_14;
					@Pc(452) int local452;
					if (local363 == null) {
						local216 = 5 - this.aClass77_Sub39_6.anInt3089 * 31645619;
						if (local216 > local169) {
							local216 = local169;
						}
						this.aClass139_2.method14339(this.aClass77_Sub39_6.aByteArray53, this.aClass77_Sub39_6.anInt3089 * 31645619, local216);
						if (this.aByte45 != 0) {
							for (local269 = 0; local269 < local216; local269++) {
								this.aClass77_Sub39_6.aByteArray53[this.aClass77_Sub39_6.anInt3089 * 31645619 + local269] ^= this.aByte45;
							}
						}
						this.aClass77_Sub39_6.anInt3089 += local216 * -1387468933;
						if (this.aClass77_Sub39_6.anInt3089 * 31645619 >= 5) {
							this.aClass77_Sub39_6.anInt3089 = 0;
							local269 = this.aClass77_Sub39_6.method22478();
							local452 = this.aClass77_Sub39_6.method22500();
							@Pc(454) byte local454 = 5;
							if (local269 != Class479.aClass479_5.method36479()) {
								local454 = 9;
							}
							local363 = this.aClass77_Sub1_Sub18_Sub2_2.aClass77_Sub39_14 = new Class77_Sub39(this.aClass77_Sub1_Sub18_Sub2_2.aByte93 + local452 + local454);
							local363.method22403(local269);
							local363.method22417(local452);
							this.anInt1347 += -708365043;
						}
					} else {
						local216 = local363.aByteArray53.length - this.aClass77_Sub1_Sub18_Sub2_2.aByte93;
						local269 = 102400 - this.anInt1347 * -826136359;
						if (local269 > local216 - local363.anInt3089 * 31645619) {
							local269 = local216 - local363.anInt3089 * 31645619;
						}
						if (local269 > local169) {
							local269 = local169;
						}
						this.aClass139_2.method14339(local363.aByteArray53, local363.anInt3089 * 31645619, local269);
						if (this.aByte45 != 0) {
							for (local452 = 0; local452 < local269; local452++) {
								local363.aByteArray53[local452 + local363.anInt3089 * 31645619] ^= this.aByte45;
							}
						}
						local363.anInt3089 += local269 * -1387468933;
						this.anInt1347 += local269 * -1859659927;
						if (local363.anInt3089 * 31645619 == local216) {
							this.aClass77_Sub1_Sub18_Sub2_2.method24069();
							this.aClass77_Sub1_Sub18_Sub2_2.aBoolean540 = false;
							this.aClass77_Sub1_Sub18_Sub2_2 = null;
						} else if (this.anInt1347 * -826136359 == 102400) {
							this.anInt1347 = 0;
							this.aClass77_Sub1_Sub18_Sub2_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(615) IOException local615) {
			try {
				this.aClass139_2.method14345();
			} catch (@Pc(621) Exception local621) {
			}
			this.aClass139_2 = null;
			this.anInt1344 += 1323405863;
			this.anInt1345 = -1672934554;
			return this.method12190() == 0 && this.method12188() == 0;
		}
	}

	@OriginalMember(owner = "client!aij", name = "n", descriptor = "()Z", line = 25)
	@Override
	public boolean method12200() {
		@Pc(13) int local13;
		if (this.aClass139_2 != null) {
			@Pc(5) long local5 = Class280.method26667();
			local13 = (int) (local5 - this.aLong49 * -8040290761580816281L);
			this.aLong49 = local5 * -1928393657558056105L;
			if (local13 > 200) {
				local13 = 200;
			}
			this.anInt1343 += local13 * 1431766545;
			if (this.anInt1343 * -229856527 > 30000) {
				try {
					this.aClass139_2.method14345();
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass139_2 = null;
			}
		}
		if (this.aClass139_2 == null) {
			return this.method12190() == 0 && this.method12188() == 0;
		}
		try {
			@Pc(68) Class77_Sub1_Sub18_Sub2 local68;
			for (local68 = (Class77_Sub1_Sub18_Sub2) this.aClass691_6.method36335(); local68 != null; local68 = (Class77_Sub1_Sub18_Sub2) this.aClass691_6.method36340()) {
				this.aClass77_Sub39_7.anInt3089 = 0;
				this.aClass77_Sub39_7.method22403(1);
				this.aClass77_Sub39_7.method22424(local68.aLong230 * -753566336061658369L);
				this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
				this.aClass691_5.method36326(local68);
			}
			for (local68 = (Class77_Sub1_Sub18_Sub2) this.aClass691_7.method36335(); local68 != null; local68 = (Class77_Sub1_Sub18_Sub2) this.aClass691_7.method36340()) {
				this.aClass77_Sub39_7.anInt3089 = 0;
				this.aClass77_Sub39_7.method22403(0);
				this.aClass77_Sub39_7.method22424(local68.aLong230 * -753566336061658369L);
				this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
				this.aClass691_8.method36326(local68);
			}
			for (@Pc(161) int local161 = 0; local161 < 100; local161++) {
				@Pc(169) int local169 = this.aClass139_2.method14340();
				if (local169 < 0) {
					throw new IOException();
				}
				if (local169 == 0) {
					break;
				}
				this.anInt1343 = 0;
				@Pc(216) int local216;
				@Pc(269) int local269;
				if (this.aClass77_Sub1_Sub18_Sub2_2 == null) {
					local13 = 5 - this.aClass77_Sub39_5.anInt3089 * 31645619;
					if (local13 > local169) {
						local13 = local169;
					}
					this.aClass139_2.method14339(this.aClass77_Sub39_5.aByteArray53, this.aClass77_Sub39_5.anInt3089 * 31645619, local13);
					if (this.aByte45 != 0) {
						for (local216 = 0; local216 < local13; local216++) {
							this.aClass77_Sub39_5.aByteArray53[local216 + this.aClass77_Sub39_5.anInt3089 * 31645619] ^= this.aByte45;
						}
					}
					this.aClass77_Sub39_5.anInt3089 += local13 * -1387468933;
					if (this.aClass77_Sub39_5.anInt3089 * 31645619 >= 5) {
						this.aClass77_Sub39_5.anInt3089 = 0;
						local216 = this.aClass77_Sub39_5.method22478();
						local269 = this.aClass77_Sub39_5.method22500();
						@Pc(278) boolean local278 = (local269 & Integer.MIN_VALUE) != 0;
						@Pc(282) int local282 = local269 & Integer.MAX_VALUE;
						@Pc(290) long local290 = (long) local282 + ((long) local216 << 32);
						@Pc(296) Iterator local296;
						@Pc(303) Class77_Sub1_Sub18_Sub2 local303;
						if (local278) {
							local296 = this.aClass691_8.iterator();
							while (local296.hasNext()) {
								local303 = (Class77_Sub1_Sub18_Sub2) local296.next();
								if (local290 == local303.aLong230 * -753566336061658369L) {
									this.aClass77_Sub1_Sub18_Sub2_2 = local303;
									break;
								}
							}
						} else {
							local296 = this.aClass691_5.iterator();
							while (local296.hasNext()) {
								local303 = (Class77_Sub1_Sub18_Sub2) local296.next();
								if (local290 == local303.aLong230 * -753566336061658369L) {
									this.aClass77_Sub1_Sub18_Sub2_2 = local303;
									break;
								}
							}
						}
						if (this.aClass77_Sub1_Sub18_Sub2_2 == null) {
							throw new IOException();
						}
						this.anInt1347 = -708365043;
						this.aClass77_Sub39_5.anInt3089 = 0;
						this.aClass77_Sub39_6.anInt3089 = 0;
					}
				} else {
					@Pc(363) Class77_Sub39 local363 = this.aClass77_Sub1_Sub18_Sub2_2.aClass77_Sub39_14;
					@Pc(452) int local452;
					if (local363 == null) {
						local216 = 5 - this.aClass77_Sub39_6.anInt3089 * 31645619;
						if (local216 > local169) {
							local216 = local169;
						}
						this.aClass139_2.method14339(this.aClass77_Sub39_6.aByteArray53, this.aClass77_Sub39_6.anInt3089 * 31645619, local216);
						if (this.aByte45 != 0) {
							for (local269 = 0; local269 < local216; local269++) {
								this.aClass77_Sub39_6.aByteArray53[this.aClass77_Sub39_6.anInt3089 * 31645619 + local269] ^= this.aByte45;
							}
						}
						this.aClass77_Sub39_6.anInt3089 += local216 * -1387468933;
						if (this.aClass77_Sub39_6.anInt3089 * 31645619 >= 5) {
							this.aClass77_Sub39_6.anInt3089 = 0;
							local269 = this.aClass77_Sub39_6.method22478();
							local452 = this.aClass77_Sub39_6.method22500();
							@Pc(454) byte local454 = 5;
							if (local269 != Class479.aClass479_5.method36479()) {
								local454 = 9;
							}
							local363 = this.aClass77_Sub1_Sub18_Sub2_2.aClass77_Sub39_14 = new Class77_Sub39(this.aClass77_Sub1_Sub18_Sub2_2.aByte93 + local452 + local454);
							local363.method22403(local269);
							local363.method22417(local452);
							this.anInt1347 += -708365043;
						}
					} else {
						local216 = local363.aByteArray53.length - this.aClass77_Sub1_Sub18_Sub2_2.aByte93;
						local269 = 102400 - this.anInt1347 * -826136359;
						if (local269 > local216 - local363.anInt3089 * 31645619) {
							local269 = local216 - local363.anInt3089 * 31645619;
						}
						if (local269 > local169) {
							local269 = local169;
						}
						this.aClass139_2.method14339(local363.aByteArray53, local363.anInt3089 * 31645619, local269);
						if (this.aByte45 != 0) {
							for (local452 = 0; local452 < local269; local452++) {
								local363.aByteArray53[local452 + local363.anInt3089 * 31645619] ^= this.aByte45;
							}
						}
						local363.anInt3089 += local269 * -1387468933;
						this.anInt1347 += local269 * -1859659927;
						if (local363.anInt3089 * 31645619 == local216) {
							this.aClass77_Sub1_Sub18_Sub2_2.method24069();
							this.aClass77_Sub1_Sub18_Sub2_2.aBoolean540 = false;
							this.aClass77_Sub1_Sub18_Sub2_2 = null;
						} else if (this.anInt1347 * -826136359 == 102400) {
							this.anInt1347 = 0;
							this.aClass77_Sub1_Sub18_Sub2_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(615) IOException local615) {
			try {
				this.aClass139_2.method14345();
			} catch (@Pc(621) Exception local621) {
			}
			this.aClass139_2 = null;
			this.anInt1344 += 1323405863;
			this.anInt1345 = -1672934554;
			return this.method12190() == 0 && this.method12188() == 0;
		}
	}

	@OriginalMember(owner = "client!aij", name = "q", descriptor = "(Ljava/lang/Object;ZB)V", line = 166)
	@Override
	public void method12195(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass139_2 != null) {
			try {
				this.aClass139_2.method14345();
			} catch (@Pc(8) Exception local8) {
			}
			this.aClass139_2 = null;
		}
		this.aClass139_2 = (Class139) arg0;
		this.method12217();
		this.method12197(arg1);
		this.aClass77_Sub39_5.anInt3089 = 0;
		this.aClass77_Sub39_6.anInt3089 = 0;
		this.aClass77_Sub1_Sub18_Sub2_2 = null;
		while (true) {
			@Pc(39) Class77_Sub1_Sub18_Sub2 local39 = (Class77_Sub1_Sub18_Sub2) this.aClass691_5.method36331();
			if (local39 == null) {
				while (true) {
					local39 = (Class77_Sub1_Sub18_Sub2) this.aClass691_8.method36331();
					if (local39 == null) {
						if (this.aByte45 != 0) {
							try {
								this.aClass77_Sub39_7.anInt3089 = 0;
								this.aClass77_Sub39_7.method22403(4);
								this.aClass77_Sub39_7.method22403(this.aByte45);
								this.aClass77_Sub39_7.method22417(0);
								this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
							} catch (@Pc(107) IOException local107) {
								try {
									this.aClass139_2.method14345();
								} catch (@Pc(113) Exception local113) {
								}
								this.aClass139_2 = null;
								this.anInt1344 += 1323405863;
								this.anInt1345 = -1672934554;
							}
						}
						this.anInt1343 = 0;
						this.aLong49 = Class280.method26667() * -1928393657558056105L;
						return;
					}
					local39.aClass77_Sub39_14 = null;
					this.aClass691_7.method36326(local39);
				}
			}
			local39.aClass77_Sub39_14 = null;
			this.aClass691_6.method36326(local39);
		}
	}

	@OriginalMember(owner = "client!aij", name = "h", descriptor = "(Ljava/lang/Object;Z)V", line = 166)
	@Override
	public void method12205(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass139_2 != null) {
			try {
				this.aClass139_2.method14345();
			} catch (@Pc(8) Exception local8) {
			}
			this.aClass139_2 = null;
		}
		this.aClass139_2 = (Class139) arg0;
		this.method12217();
		this.method12197(arg1);
		this.aClass77_Sub39_5.anInt3089 = 0;
		this.aClass77_Sub39_6.anInt3089 = 0;
		this.aClass77_Sub1_Sub18_Sub2_2 = null;
		while (true) {
			@Pc(39) Class77_Sub1_Sub18_Sub2 local39 = (Class77_Sub1_Sub18_Sub2) this.aClass691_5.method36331();
			if (local39 == null) {
				while (true) {
					local39 = (Class77_Sub1_Sub18_Sub2) this.aClass691_8.method36331();
					if (local39 == null) {
						if (this.aByte45 != 0) {
							try {
								this.aClass77_Sub39_7.anInt3089 = 0;
								this.aClass77_Sub39_7.method22403(4);
								this.aClass77_Sub39_7.method22403(this.aByte45);
								this.aClass77_Sub39_7.method22417(0);
								this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
							} catch (@Pc(107) IOException local107) {
								try {
									this.aClass139_2.method14345();
								} catch (@Pc(113) Exception local113) {
								}
								this.aClass139_2 = null;
								this.anInt1344 += 1323405863;
								this.anInt1345 = -1672934554;
							}
						}
						this.anInt1343 = 0;
						this.aLong49 = Class280.method26667() * -1928393657558056105L;
						return;
					}
					local39.aClass77_Sub39_14 = null;
					this.aClass691_7.method36326(local39);
				}
			}
			local39.aClass77_Sub39_14 = null;
			this.aClass691_6.method36326(local39);
		}
	}

	@OriginalMember(owner = "client!aij", name = "a", descriptor = "(Ljava/lang/Object;Z)V", line = 166)
	@Override
	public void method12213(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass139_2 != null) {
			try {
				this.aClass139_2.method14345();
			} catch (@Pc(8) Exception local8) {
			}
			this.aClass139_2 = null;
		}
		this.aClass139_2 = (Class139) arg0;
		this.method12217();
		this.method12197(arg1);
		this.aClass77_Sub39_5.anInt3089 = 0;
		this.aClass77_Sub39_6.anInt3089 = 0;
		this.aClass77_Sub1_Sub18_Sub2_2 = null;
		while (true) {
			@Pc(39) Class77_Sub1_Sub18_Sub2 local39 = (Class77_Sub1_Sub18_Sub2) this.aClass691_5.method36331();
			if (local39 == null) {
				while (true) {
					local39 = (Class77_Sub1_Sub18_Sub2) this.aClass691_8.method36331();
					if (local39 == null) {
						if (this.aByte45 != 0) {
							try {
								this.aClass77_Sub39_7.anInt3089 = 0;
								this.aClass77_Sub39_7.method22403(4);
								this.aClass77_Sub39_7.method22403(this.aByte45);
								this.aClass77_Sub39_7.method22417(0);
								this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
							} catch (@Pc(107) IOException local107) {
								try {
									this.aClass139_2.method14345();
								} catch (@Pc(113) Exception local113) {
								}
								this.aClass139_2 = null;
								this.anInt1344 += 1323405863;
								this.anInt1345 = -1672934554;
							}
						}
						this.anInt1343 = 0;
						this.aLong49 = Class280.method26667() * -1928393657558056105L;
						return;
					}
					local39.aClass77_Sub39_14 = null;
					this.aClass691_7.method36326(local39);
				}
			}
			local39.aClass77_Sub39_14 = null;
			this.aClass691_6.method36326(local39);
		}
	}

	@OriginalMember(owner = "client!aij", name = "m", descriptor = "(Ljava/lang/Object;Z)V", line = 166)
	@Override
	public void method12204(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass139_2 != null) {
			try {
				this.aClass139_2.method14345();
			} catch (@Pc(8) Exception local8) {
			}
			this.aClass139_2 = null;
		}
		this.aClass139_2 = (Class139) arg0;
		this.method12217();
		this.method12197(arg1);
		this.aClass77_Sub39_5.anInt3089 = 0;
		this.aClass77_Sub39_6.anInt3089 = 0;
		this.aClass77_Sub1_Sub18_Sub2_2 = null;
		while (true) {
			@Pc(39) Class77_Sub1_Sub18_Sub2 local39 = (Class77_Sub1_Sub18_Sub2) this.aClass691_5.method36331();
			if (local39 == null) {
				while (true) {
					local39 = (Class77_Sub1_Sub18_Sub2) this.aClass691_8.method36331();
					if (local39 == null) {
						if (this.aByte45 != 0) {
							try {
								this.aClass77_Sub39_7.anInt3089 = 0;
								this.aClass77_Sub39_7.method22403(4);
								this.aClass77_Sub39_7.method22403(this.aByte45);
								this.aClass77_Sub39_7.method22417(0);
								this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
							} catch (@Pc(107) IOException local107) {
								try {
									this.aClass139_2.method14345();
								} catch (@Pc(113) Exception local113) {
								}
								this.aClass139_2 = null;
								this.anInt1344 += 1323405863;
								this.anInt1345 = -1672934554;
							}
						}
						this.anInt1343 = 0;
						this.aLong49 = Class280.method26667() * -1928393657558056105L;
						return;
					}
					local39.aClass77_Sub39_14 = null;
					this.aClass691_7.method36326(local39);
				}
			}
			local39.aClass77_Sub39_14 = null;
			this.aClass691_6.method36326(local39);
		}
	}

	@OriginalMember(owner = "client!aij", name = "at", descriptor = "(I)V", line = 214)
	void method12217() {
		if (this.aClass139_2 == null) {
			return;
		}
		try {
			this.aClass77_Sub39_7.anInt3089 = 0;
			this.aClass77_Sub39_7.method22403(6);
			this.aClass77_Sub39_7.method22413(4);
			this.aClass77_Sub39_7.method22408(0);
			this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass139_2.method14345();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass139_2 = null;
			this.anInt1344 += 1323405863;
			this.anInt1345 = -1672934554;
		}
	}

	@OriginalMember(owner = "client!aij", name = "ah", descriptor = "()V", line = 214)
	void method12218() {
		if (this.aClass139_2 == null) {
			return;
		}
		try {
			this.aClass77_Sub39_7.anInt3089 = 0;
			this.aClass77_Sub39_7.method22403(6);
			this.aClass77_Sub39_7.method22413(4);
			this.aClass77_Sub39_7.method22408(0);
			this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass139_2.method14345();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass139_2 = null;
			this.anInt1344 += 1323405863;
			this.anInt1345 = -1672934554;
		}
	}

	@OriginalMember(owner = "client!aij", name = "as", descriptor = "()V", line = 214)
	void method12219() {
		if (this.aClass139_2 == null) {
			return;
		}
		try {
			this.aClass77_Sub39_7.anInt3089 = 0;
			this.aClass77_Sub39_7.method22403(6);
			this.aClass77_Sub39_7.method22413(4);
			this.aClass77_Sub39_7.method22408(0);
			this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass139_2.method14345();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass139_2 = null;
			this.anInt1344 += 1323405863;
			this.anInt1345 = -1672934554;
		}
	}

	@OriginalMember(owner = "client!aij", name = "ae", descriptor = "()V", line = 214)
	void method12220() {
		if (this.aClass139_2 == null) {
			return;
		}
		try {
			this.aClass77_Sub39_7.anInt3089 = 0;
			this.aClass77_Sub39_7.method22403(6);
			this.aClass77_Sub39_7.method22413(4);
			this.aClass77_Sub39_7.method22408(0);
			this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass139_2.method14345();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass139_2 = null;
			this.anInt1344 += 1323405863;
			this.anInt1345 = -1672934554;
		}
	}

	@OriginalMember(owner = "client!aij", name = "aj", descriptor = "(Z)V", line = 234)
	@Override
	public void method12202(@OriginalArg(0) boolean arg0) {
		if (this.aClass139_2 == null) {
			return;
		}
		try {
			this.aClass77_Sub39_7.anInt3089 = 0;
			this.aClass77_Sub39_7.method22403(arg0 ? 2 : 3);
			this.aClass77_Sub39_7.method22424(0L);
			this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
		} catch (@Pc(35) IOException local35) {
			try {
				this.aClass139_2.method14345();
			} catch (@Pc(41) Exception local41) {
			}
			this.aClass139_2 = null;
			this.anInt1344 += 1323405863;
			this.anInt1345 = -1672934554;
		}
	}

	@OriginalMember(owner = "client!aij", name = "x", descriptor = "(ZI)V", line = 234)
	@Override
	public void method12197(@OriginalArg(0) boolean arg0) {
		if (this.aClass139_2 == null) {
			return;
		}
		try {
			this.aClass77_Sub39_7.anInt3089 = 0;
			this.aClass77_Sub39_7.method22403(arg0 ? 2 : 3);
			this.aClass77_Sub39_7.method22424(0L);
			this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
		} catch (@Pc(35) IOException local35) {
			try {
				this.aClass139_2.method14345();
			} catch (@Pc(41) Exception local41) {
			}
			this.aClass139_2 = null;
			this.anInt1344 += 1323405863;
			this.anInt1345 = -1672934554;
		}
	}

	@OriginalMember(owner = "client!aij", name = "al", descriptor = "()V", line = 253)
	@Override
	public void method12209() {
		if (this.aClass139_2 == null) {
			return;
		}
		try {
			this.aClass77_Sub39_7.anInt3089 = 0;
			this.aClass77_Sub39_7.method22403(7);
			this.aClass77_Sub39_7.method22424(0L);
			this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
		} catch (@Pc(31) IOException local31) {
			try {
				this.aClass139_2.method14345();
			} catch (@Pc(37) Exception local37) {
			}
			this.aClass139_2 = null;
			this.anInt1344 += 1323405863;
			this.anInt1345 = -1672934554;
		}
	}

	@OriginalMember(owner = "client!aij", name = "ai", descriptor = "()V", line = 253)
	@Override
	public void method12207() {
		if (this.aClass139_2 == null) {
			return;
		}
		try {
			this.aClass77_Sub39_7.anInt3089 = 0;
			this.aClass77_Sub39_7.method22403(7);
			this.aClass77_Sub39_7.method22424(0L);
			this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
		} catch (@Pc(31) IOException local31) {
			try {
				this.aClass139_2.method14345();
			} catch (@Pc(37) Exception local37) {
			}
			this.aClass139_2 = null;
			this.anInt1344 += 1323405863;
			this.anInt1345 = -1672934554;
		}
	}

	@OriginalMember(owner = "client!aij", name = "ag", descriptor = "()V", line = 253)
	@Override
	public void method12208() {
		if (this.aClass139_2 == null) {
			return;
		}
		try {
			this.aClass77_Sub39_7.anInt3089 = 0;
			this.aClass77_Sub39_7.method22403(7);
			this.aClass77_Sub39_7.method22424(0L);
			this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
		} catch (@Pc(31) IOException local31) {
			try {
				this.aClass139_2.method14345();
			} catch (@Pc(37) Exception local37) {
			}
			this.aClass139_2 = null;
			this.anInt1344 += 1323405863;
			this.anInt1345 = -1672934554;
		}
	}

	@OriginalMember(owner = "client!aij", name = "d", descriptor = "(I)V", line = 253)
	@Override
	public void method12206() {
		if (this.aClass139_2 == null) {
			return;
		}
		try {
			this.aClass77_Sub39_7.anInt3089 = 0;
			this.aClass77_Sub39_7.method22403(7);
			this.aClass77_Sub39_7.method22424(0L);
			this.aClass139_2.method14341(this.aClass77_Sub39_7.aByteArray53, 0, this.aClass77_Sub39_7.aByteArray53.length);
		} catch (@Pc(31) IOException local31) {
			try {
				this.aClass139_2.method14345();
			} catch (@Pc(37) Exception local37) {
			}
			this.aClass139_2 = null;
			this.anInt1344 += 1323405863;
			this.anInt1345 = -1672934554;
		}
	}

	@OriginalMember(owner = "client!aij", name = "s", descriptor = "(I)V", line = 272)
	@Override
	public void method12198() {
		if (this.aClass139_2 != null) {
			this.aClass139_2.method14345();
		}
	}

	@OriginalMember(owner = "client!aij", name = "ao", descriptor = "()V", line = 272)
	@Override
	public void method12210() {
		if (this.aClass139_2 != null) {
			this.aClass139_2.method14345();
		}
	}

	@OriginalMember(owner = "client!aij", name = "ak", descriptor = "()V", line = 272)
	@Override
	public void method12193() {
		if (this.aClass139_2 != null) {
			this.aClass139_2.method14345();
		}
	}

	@OriginalMember(owner = "client!aij", name = "au", descriptor = "()V", line = 272)
	@Override
	public void method12212() {
		if (this.aClass139_2 != null) {
			this.aClass139_2.method14345();
		}
	}

	@OriginalMember(owner = "client!aij", name = "ax", descriptor = "()V", line = 272)
	@Override
	public void method12201() {
		if (this.aClass139_2 != null) {
			this.aClass139_2.method14345();
		}
	}

	@OriginalMember(owner = "client!aij", name = "r", descriptor = "(B)V", line = 276)
	@Override
	public void method12199() {
		if (this.aClass139_2 != null) {
			this.aClass139_2.method14343();
		}
	}

	@OriginalMember(owner = "client!aij", name = "ac", descriptor = "()V", line = 276)
	@Override
	public void method12215() {
		if (this.aClass139_2 != null) {
			this.aClass139_2.method14343();
		}
	}

	@OriginalMember(owner = "client!aij", name = "ar", descriptor = "()V", line = 276)
	@Override
	public void method12211() {
		if (this.aClass139_2 != null) {
			this.aClass139_2.method14343();
		}
	}

	@OriginalMember(owner = "client!aij", name = "ad", descriptor = "()V", line = 276)
	@Override
	public void method12214() {
		if (this.aClass139_2 != null) {
			this.aClass139_2.method14343();
		}
	}

	@OriginalMember(owner = "client!aij", name = "av", descriptor = "()V", line = 276)
	@Override
	public void method12216() {
		if (this.aClass139_2 != null) {
			this.aClass139_2.method14343();
		}
	}

	@OriginalMember(owner = "client!aij", name = "ep", descriptor = "(Lclient!yf;I)V", line = 5242)
	static final void method12221(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class184.method24600(local11, local14, arg0);
	}
}

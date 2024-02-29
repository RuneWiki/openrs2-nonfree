package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public class Class503 {

	@OriginalMember(owner = "client!r", name = "bs", descriptor = "Lclient!dj;")
	static Class94 aClass94_11;

	@OriginalMember(owner = "client!r", name = "ft", descriptor = "[Lclient!aid;")
	public static Class126_Sub1[] aClass126_Sub1Array2;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "I")
	int anInt5068;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "I")
	public int anInt5069;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "(IIII)Z", line = 10)
	public boolean method30234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt5068 * -129276299;
		if (this.anInt5069 * 949937137 == arg0 && this.anInt5068 * -129276299 == 0) {
			return false;
		}
		@Pc(60) boolean local60;
		@Pc(86) int local86;
		if (this.anInt5068 * -129276299 == 0) {
			if (arg0 > this.anInt5069 * 949937137 && arg0 <= this.anInt5069 * 949937137 + arg1 || arg0 < this.anInt5069 * 949937137 && arg0 >= this.anInt5069 * 949937137 - arg1) {
				this.anInt5069 = arg0 * -1460032239;
				return false;
			}
			local60 = true;
		} else {
			@Pc(93) int local93;
			if (this.anInt5068 * -129276299 > 0 && arg0 > this.anInt5069 * 949937137) {
				local86 = this.anInt5068 * -129276299 * this.anInt5068 * -129276299 / (arg1 * 2);
				local93 = local86 + this.anInt5069 * 949937137;
				if (local93 < arg0 && local93 >= this.anInt5069 * 949937137) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else if (this.anInt5068 * -129276299 < 0 && arg0 < this.anInt5069 * 949937137) {
				local86 = this.anInt5068 * -129276299 * -129276299 * this.anInt5068 / (arg1 * 2);
				local93 = this.anInt5069 * 949937137 - local86;
				if (local93 > arg0 && local93 <= this.anInt5069 * 949937137) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else {
				local60 = false;
			}
		}
		if (local60) {
			if (arg0 > this.anInt5069 * 949937137) {
				this.anInt5068 += arg1 * -1834567203;
				if (arg2 != 0 && this.anInt5068 * -129276299 > arg2) {
					this.anInt5068 = arg2 * -1834567203;
				}
			} else {
				this.anInt5068 -= arg1 * -1834567203;
				if (arg2 != 0 && this.anInt5068 * -129276299 < -arg2) {
					this.anInt5068 = -arg2 * -1834567203;
				}
			}
			if (local4 != this.anInt5068 * -129276299) {
				local86 = this.anInt5068 * -129276299 * -129276299 * this.anInt5068 / (arg1 * 2);
				if (arg0 > this.anInt5069 * 949937137) {
					if (this.anInt5069 * 949937137 + local86 > arg0) {
						this.anInt5068 = local4 * -1834567203;
					}
				} else if (arg0 < this.anInt5069 * 949937137 && this.anInt5069 * 949937137 - local86 < arg0) {
					this.anInt5068 = local4 * -1834567203;
				}
			}
		} else if (this.anInt5068 * -129276299 > 0) {
			this.anInt5068 -= arg1 * -1834567203;
			if (this.anInt5068 * -129276299 < 0) {
				this.anInt5068 = 0;
			}
		} else {
			this.anInt5068 += arg1 * -1834567203;
			if (this.anInt5068 * -129276299 > 0) {
				this.anInt5068 = 0;
			}
		}
		this.anInt5069 += (this.anInt5068 * -129276299 + local4 >> 1) * -1460032239;
		return local60;
	}

	@OriginalMember(owner = "client!r", name = "w", descriptor = "(III)Z", line = 10)
	public boolean method30235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt5068 * -129276299;
		if (this.anInt5069 * 949937137 == arg0 && this.anInt5068 * -129276299 == 0) {
			return false;
		}
		@Pc(60) boolean local60;
		@Pc(86) int local86;
		if (this.anInt5068 * -129276299 == 0) {
			if (arg0 > this.anInt5069 * 949937137 && arg0 <= this.anInt5069 * 949937137 + arg1 || arg0 < this.anInt5069 * 949937137 && arg0 >= this.anInt5069 * 949937137 - arg1) {
				this.anInt5069 = arg0 * -1460032239;
				return false;
			}
			local60 = true;
		} else {
			@Pc(93) int local93;
			if (this.anInt5068 * -129276299 > 0 && arg0 > this.anInt5069 * 949937137) {
				local86 = this.anInt5068 * -129276299 * this.anInt5068 * -129276299 / (arg1 * 2);
				local93 = local86 + this.anInt5069 * 949937137;
				if (local93 < arg0 && local93 >= this.anInt5069 * 949937137) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else if (this.anInt5068 * -129276299 < 0 && arg0 < this.anInt5069 * 949937137) {
				local86 = this.anInt5068 * -129276299 * -129276299 * this.anInt5068 / (arg1 * 2);
				local93 = this.anInt5069 * 949937137 - local86;
				if (local93 > arg0 && local93 <= this.anInt5069 * 949937137) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else {
				local60 = false;
			}
		}
		if (local60) {
			if (arg0 > this.anInt5069 * 949937137) {
				this.anInt5068 += arg1 * -1834567203;
				if (arg2 != 0 && this.anInt5068 * -129276299 > arg2) {
					this.anInt5068 = arg2 * -1834567203;
				}
			} else {
				this.anInt5068 -= arg1 * -1834567203;
				if (arg2 != 0 && this.anInt5068 * -129276299 < -arg2) {
					this.anInt5068 = -arg2 * -1834567203;
				}
			}
			if (local4 != this.anInt5068 * -129276299) {
				local86 = this.anInt5068 * -129276299 * -129276299 * this.anInt5068 / (arg1 * 2);
				if (arg0 > this.anInt5069 * 949937137) {
					if (this.anInt5069 * 949937137 + local86 > arg0) {
						this.anInt5068 = local4 * -1834567203;
					}
				} else if (arg0 < this.anInt5069 * 949937137 && this.anInt5069 * 949937137 - local86 < arg0) {
					this.anInt5068 = local4 * -1834567203;
				}
			}
		} else if (this.anInt5068 * -129276299 > 0) {
			this.anInt5068 -= arg1 * -1834567203;
			if (this.anInt5068 * -129276299 < 0) {
				this.anInt5068 = 0;
			}
		} else {
			this.anInt5068 += arg1 * -1834567203;
			if (this.anInt5068 * -129276299 > 0) {
				this.anInt5068 = 0;
			}
		}
		this.anInt5069 += (this.anInt5068 * -129276299 + local4 >> 1) * -1460032239;
		return local60;
	}

	@OriginalMember(owner = "client!r", name = "y", descriptor = "(III)Z", line = 10)
	public boolean method30236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt5068 * -129276299;
		if (this.anInt5069 * 949937137 == arg0 && this.anInt5068 * -129276299 == 0) {
			return false;
		}
		@Pc(60) boolean local60;
		@Pc(86) int local86;
		if (this.anInt5068 * -129276299 == 0) {
			if (arg0 > this.anInt5069 * 949937137 && arg0 <= this.anInt5069 * 949937137 + arg1 || arg0 < this.anInt5069 * 949937137 && arg0 >= this.anInt5069 * 949937137 - arg1) {
				this.anInt5069 = arg0 * -1460032239;
				return false;
			}
			local60 = true;
		} else {
			@Pc(93) int local93;
			if (this.anInt5068 * -129276299 > 0 && arg0 > this.anInt5069 * 949937137) {
				local86 = this.anInt5068 * -129276299 * this.anInt5068 * -129276299 / (arg1 * 2);
				local93 = local86 + this.anInt5069 * 949937137;
				if (local93 < arg0 && local93 >= this.anInt5069 * 949937137) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else if (this.anInt5068 * -129276299 < 0 && arg0 < this.anInt5069 * 949937137) {
				local86 = this.anInt5068 * -129276299 * -129276299 * this.anInt5068 / (arg1 * 2);
				local93 = this.anInt5069 * 949937137 - local86;
				if (local93 > arg0 && local93 <= this.anInt5069 * 949937137) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else {
				local60 = false;
			}
		}
		if (local60) {
			if (arg0 > this.anInt5069 * 949937137) {
				this.anInt5068 += arg1 * -1834567203;
				if (arg2 != 0 && this.anInt5068 * -129276299 > arg2) {
					this.anInt5068 = arg2 * -1834567203;
				}
			} else {
				this.anInt5068 -= arg1 * -1834567203;
				if (arg2 != 0 && this.anInt5068 * -129276299 < -arg2) {
					this.anInt5068 = -arg2 * -1834567203;
				}
			}
			if (local4 != this.anInt5068 * -129276299) {
				local86 = this.anInt5068 * -129276299 * -129276299 * this.anInt5068 / (arg1 * 2);
				if (arg0 > this.anInt5069 * 949937137) {
					if (this.anInt5069 * 949937137 + local86 > arg0) {
						this.anInt5068 = local4 * -1834567203;
					}
				} else if (arg0 < this.anInt5069 * 949937137 && this.anInt5069 * 949937137 - local86 < arg0) {
					this.anInt5068 = local4 * -1834567203;
				}
			}
		} else if (this.anInt5068 * -129276299 > 0) {
			this.anInt5068 -= arg1 * -1834567203;
			if (this.anInt5068 * -129276299 < 0) {
				this.anInt5068 = 0;
			}
		} else {
			this.anInt5068 += arg1 * -1834567203;
			if (this.anInt5068 * -129276299 > 0) {
				this.anInt5068 = 0;
			}
		}
		this.anInt5069 += (this.anInt5068 * -129276299 + local4 >> 1) * -1460032239;
		return local60;
	}

	@OriginalMember(owner = "client!r", name = "t", descriptor = "(III)Z", line = 10)
	public boolean method30237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt5068 * -129276299;
		if (this.anInt5069 * 949937137 == arg0 && this.anInt5068 * -129276299 == 0) {
			return false;
		}
		@Pc(60) boolean local60;
		@Pc(86) int local86;
		if (this.anInt5068 * -129276299 == 0) {
			if (arg0 > this.anInt5069 * 949937137 && arg0 <= this.anInt5069 * 949937137 + arg1 || arg0 < this.anInt5069 * 949937137 && arg0 >= this.anInt5069 * 949937137 - arg1) {
				this.anInt5069 = arg0 * -1460032239;
				return false;
			}
			local60 = true;
		} else {
			@Pc(93) int local93;
			if (this.anInt5068 * -129276299 > 0 && arg0 > this.anInt5069 * 949937137) {
				local86 = this.anInt5068 * -129276299 * this.anInt5068 * -129276299 / (arg1 * 2);
				local93 = local86 + this.anInt5069 * 949937137;
				if (local93 < arg0 && local93 >= this.anInt5069 * 949937137) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else if (this.anInt5068 * -129276299 < 0 && arg0 < this.anInt5069 * 949937137) {
				local86 = this.anInt5068 * -129276299 * -129276299 * this.anInt5068 / (arg1 * 2);
				local93 = this.anInt5069 * 949937137 - local86;
				if (local93 > arg0 && local93 <= this.anInt5069 * 949937137) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else {
				local60 = false;
			}
		}
		if (local60) {
			if (arg0 > this.anInt5069 * 949937137) {
				this.anInt5068 += arg1 * -1834567203;
				if (arg2 != 0 && this.anInt5068 * -129276299 > arg2) {
					this.anInt5068 = arg2 * -1834567203;
				}
			} else {
				this.anInt5068 -= arg1 * -1834567203;
				if (arg2 != 0 && this.anInt5068 * -129276299 < -arg2) {
					this.anInt5068 = -arg2 * -1834567203;
				}
			}
			if (local4 != this.anInt5068 * -129276299) {
				local86 = this.anInt5068 * -129276299 * -129276299 * this.anInt5068 / (arg1 * 2);
				if (arg0 > this.anInt5069 * 949937137) {
					if (this.anInt5069 * 949937137 + local86 > arg0) {
						this.anInt5068 = local4 * -1834567203;
					}
				} else if (arg0 < this.anInt5069 * 949937137 && this.anInt5069 * 949937137 - local86 < arg0) {
					this.anInt5068 = local4 * -1834567203;
				}
			}
		} else if (this.anInt5068 * -129276299 > 0) {
			this.anInt5068 -= arg1 * -1834567203;
			if (this.anInt5068 * -129276299 < 0) {
				this.anInt5068 = 0;
			}
		} else {
			this.anInt5068 += arg1 * -1834567203;
			if (this.anInt5068 * -129276299 > 0) {
				this.anInt5068 = 0;
			}
		}
		this.anInt5069 += (this.anInt5068 * -129276299 + local4 >> 1) * -1460032239;
		return local60;
	}

	@OriginalMember(owner = "client!r", name = "q", descriptor = "(III)Z", line = 10)
	public boolean method30238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt5068 * -129276299;
		if (this.anInt5069 * 949937137 == arg0 && this.anInt5068 * -129276299 == 0) {
			return false;
		}
		@Pc(60) boolean local60;
		@Pc(86) int local86;
		if (this.anInt5068 * -129276299 == 0) {
			if (arg0 > this.anInt5069 * 949937137 && arg0 <= this.anInt5069 * 949937137 + arg1 || arg0 < this.anInt5069 * 949937137 && arg0 >= this.anInt5069 * 949937137 - arg1) {
				this.anInt5069 = arg0 * -1460032239;
				return false;
			}
			local60 = true;
		} else {
			@Pc(93) int local93;
			if (this.anInt5068 * -129276299 > 0 && arg0 > this.anInt5069 * 949937137) {
				local86 = this.anInt5068 * -129276299 * this.anInt5068 * -129276299 / (arg1 * 2);
				local93 = local86 + this.anInt5069 * 949937137;
				if (local93 < arg0 && local93 >= this.anInt5069 * 949937137) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else if (this.anInt5068 * -129276299 < 0 && arg0 < this.anInt5069 * 949937137) {
				local86 = this.anInt5068 * -129276299 * -129276299 * this.anInt5068 / (arg1 * 2);
				local93 = this.anInt5069 * 949937137 - local86;
				if (local93 > arg0 && local93 <= this.anInt5069 * 949937137) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else {
				local60 = false;
			}
		}
		if (local60) {
			if (arg0 > this.anInt5069 * 949937137) {
				this.anInt5068 += arg1 * -1834567203;
				if (arg2 != 0 && this.anInt5068 * -129276299 > arg2) {
					this.anInt5068 = arg2 * -1834567203;
				}
			} else {
				this.anInt5068 -= arg1 * -1834567203;
				if (arg2 != 0 && this.anInt5068 * -129276299 < -arg2) {
					this.anInt5068 = -arg2 * -1834567203;
				}
			}
			if (local4 != this.anInt5068 * -129276299) {
				local86 = this.anInt5068 * -129276299 * -129276299 * this.anInt5068 / (arg1 * 2);
				if (arg0 > this.anInt5069 * 949937137) {
					if (this.anInt5069 * 949937137 + local86 > arg0) {
						this.anInt5068 = local4 * -1834567203;
					}
				} else if (arg0 < this.anInt5069 * 949937137 && this.anInt5069 * 949937137 - local86 < arg0) {
					this.anInt5068 = local4 * -1834567203;
				}
			}
		} else if (this.anInt5068 * -129276299 > 0) {
			this.anInt5068 -= arg1 * -1834567203;
			if (this.anInt5068 * -129276299 < 0) {
				this.anInt5068 = 0;
			}
		} else {
			this.anInt5068 += arg1 * -1834567203;
			if (this.anInt5068 * -129276299 > 0) {
				this.anInt5068 = 0;
			}
		}
		this.anInt5069 += (this.anInt5068 * -129276299 + local4 >> 1) * -1460032239;
		return local60;
	}

	@OriginalMember(owner = "client!r", name = "x", descriptor = "(I)V", line = 67)
	public void method30239(@OriginalArg(0) int arg0) {
		this.anInt5069 = arg0 * -1460032239;
		this.anInt5068 = 0;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(II)V", line = 67)
	public void method30240(@OriginalArg(0) int arg0) {
		this.anInt5069 = arg0 * -1460032239;
		this.anInt5068 = 0;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()I", line = 72)
	public int method30241() {
		return this.anInt5069 * 949937137 & 0x3FFF;
	}

	@OriginalMember(owner = "client!r", name = "v", descriptor = "(I)I", line = 72)
	public int method30242() {
		return this.anInt5069 * 949937137 & 0x3FFF;
	}

	@OriginalMember(owner = "client!r", name = "s", descriptor = "()I", line = 72)
	public int method30243() {
		return this.anInt5069 * 949937137 & 0x3FFF;
	}

	@OriginalMember(owner = "client!r", name = "r", descriptor = "()I", line = 72)
	public int method30244() {
		return this.anInt5069 * 949937137 & 0x3FFF;
	}

	@OriginalMember(owner = "client!r", name = "l", descriptor = "(B)V", line = 76)
	public void method30245() {
		this.anInt5069 = (this.anInt5069 * 949937137 & 0x3FFF) * -1460032239;
	}

	@OriginalMember(owner = "client!r", name = "z", descriptor = "()V", line = 76)
	public void method30246() {
		this.anInt5069 = (this.anInt5069 * 949937137 & 0x3FFF) * -1460032239;
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "()V", line = 76)
	public void method30247() {
		this.anInt5069 = (this.anInt5069 * 949937137 & 0x3FFF) * -1460032239;
	}

	@OriginalMember(owner = "client!r", name = "ko", descriptor = "(Lclient!yf;I)V", line = 6436)
	static final void method30248(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		Class14_Sub1.method17053(local11, arg0);
	}

	@OriginalMember(owner = "client!r", name = "acl", descriptor = "(Lclient!yf;B)V", line = 9530)
	static final void method30249(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (local13 & 0x1 << local23) == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!r", name = "aye", descriptor = "(Lclient!yf;I)V", line = 13604)
	static final void method30250(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 100;
	}
}

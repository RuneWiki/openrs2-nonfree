package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ase")
public class Class77_Sub1_Sub16_Sub1 extends Class77_Sub1_Sub16 {

	@OriginalMember(owner = "client!ase", name = "t", descriptor = "I")
	static final int anInt3121 = 16;

	@OriginalMember(owner = "client!ase", name = "q", descriptor = "I")
	int anInt3120;

	@OriginalMember(owner = "client!ase", name = "s", descriptor = "I")
	int anInt3122;

	@OriginalMember(owner = "client!ase", name = "d", descriptor = "I")
	int anInt3123;

	@OriginalMember(owner = "client!ase", name = "x", descriptor = "I")
	int anInt3124;

	@OriginalMember(owner = "client!ase", name = "r", descriptor = "[B")
	final byte[] aByteArray54;

	@OriginalMember(owner = "client!ase", name = "<init>", descriptor = "(Lclient!aeq;II)V", line = 14)
	Class77_Sub1_Sub16_Sub1(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray54 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!ase", name = "w", descriptor = "(IIII)V", line = 19)
	void method23043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3123 = arg0;
		this.anInt3122 = arg1;
		this.anInt3120 = arg2 - arg0;
		this.anInt3124 = arg3 - arg1;
	}

	@OriginalMember(owner = "client!ase", name = "t", descriptor = "(IIII)V", line = 19)
	void method23044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3123 = arg0;
		this.anInt3122 = arg1;
		this.anInt3120 = arg2 - arg0;
		this.anInt3124 = arg3 - arg1;
	}

	@OriginalMember(owner = "client!ase", name = "p", descriptor = "(IIII)V", line = 19)
	void method23045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3123 = arg0;
		this.anInt3122 = arg1;
		this.anInt3120 = arg2 - arg0;
		this.anInt3124 = arg3 - arg1;
	}

	@OriginalMember(owner = "client!ase", name = "q", descriptor = "(II)Z", line = 26)
	boolean method23046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray54.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!ase", name = "c", descriptor = "(II)Z", line = 26)
	boolean method23047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray54.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!ase", name = "v", descriptor = "()V", line = 30)
	void method23048() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray54.length - 8;
		while (local1 < local7) {
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
		}
		while (local1 < this.aByteArray54.length - 1) {
			local1++;
			this.aByteArray54[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!ase", name = "d", descriptor = "()V", line = 30)
	void method23049() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray54.length - 8;
		while (local1 < local7) {
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
		}
		while (local1 < this.aByteArray54.length - 1) {
			local1++;
			this.aByteArray54[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!ase", name = "x", descriptor = "()V", line = 30)
	void method23050() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray54.length - 8;
		while (local1 < local7) {
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
			local1++;
			this.aByteArray54[local1] = 0;
		}
		while (local1 < this.aByteArray54.length - 1) {
			local1++;
			this.aByteArray54[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!ase", name = "s", descriptor = "(IIIIII)V", line = 46)
	void method23051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg1 != arg0) {
			local1 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(16) int local16 = 0;
		if (arg2 != arg1) {
			local16 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(31) int local31 = 0;
		if (arg2 != arg0) {
			local31 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg1 < arg2) {
				arg5 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local31 * arg0;
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local16 * arg1;
					arg1 = 0;
				}
				if ((arg0 == arg1 || local31 >= local1) && (arg0 != arg1 || local31 <= local16)) {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3120;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg0, arg4 >> 16, arg5 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg0, arg3 >> 16, arg5 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3120;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3120;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg0, arg5 >> 16, arg4 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg0, arg5 >> 16, arg3 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3120;
					}
				}
			} else {
				arg4 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local31 * arg0;
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local16 * arg2;
					arg2 = 0;
				}
				if ((arg0 == arg2 || local31 >= local1) && (arg0 != arg2 || local16 <= local1)) {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3120;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg0, arg3 >> 16, arg5 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg0, arg3 >> 16, arg4 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3120;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3120;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg0, arg5 >> 16, arg3 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg0, arg4 >> 16, arg3 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3120;
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg2 < arg0) {
				arg3 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local1 * arg1;
					arg4 -= local16 * arg1;
					arg1 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				if (arg1 != arg2 && local1 < local16 || arg1 == arg2 && local1 > local31) {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3120;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg1, arg3 >> 16, arg5 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg1, arg3 >> 16, arg4 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3120;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3120;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg1, arg5 >> 16, arg3 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg1, arg4 >> 16, arg3 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3120;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local1 * arg1;
					arg4 -= local16 * arg1;
					arg1 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local31 * arg0;
					arg0 = 0;
				}
				if (local1 < local16) {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3120;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg1, arg3 >> 16, arg4 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg1, arg5 >> 16, arg4 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3120;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3120;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg1, arg4 >> 16, arg3 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg1, arg4 >> 16, arg5 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3120;
					}
				}
			}
		} else if (arg0 < arg1) {
			arg4 = arg5 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= local16 * arg2;
				arg5 -= local31 * arg2;
				arg2 = 0;
			}
			arg3 <<= 0x10;
			if (arg0 < 0) {
				arg3 -= local1 * arg0;
				arg0 = 0;
			}
			if (local16 < local31) {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3120;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23054(this.aByteArray54, arg2, arg4 >> 16, arg3 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3120;
						}
					}
					method23054(this.aByteArray54, arg2, arg4 >> 16, arg5 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3120;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3120;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23054(this.aByteArray54, arg2, arg3 >> 16, arg4 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3120;
						}
					}
					method23054(this.aByteArray54, arg2, arg5 >> 16, arg4 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3120;
				}
			}
		} else {
			arg3 = arg5 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= local16 * arg2;
				arg5 -= local31 * arg2;
				arg2 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local1 * arg1;
				arg1 = 0;
			}
			if (local16 < local31) {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3120;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23054(this.aByteArray54, arg2, arg4 >> 16, arg5 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3120;
						}
					}
					method23054(this.aByteArray54, arg2, arg3 >> 16, arg5 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3120;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3120;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23054(this.aByteArray54, arg2, arg5 >> 16, arg4 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3120;
						}
					}
					method23054(this.aByteArray54, arg2, arg5 >> 16, arg3 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3120;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ase", name = "l", descriptor = "(IIIIII)V", line = 46)
	void method23052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg1 != arg0) {
			local1 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(16) int local16 = 0;
		if (arg2 != arg1) {
			local16 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(31) int local31 = 0;
		if (arg2 != arg0) {
			local31 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg1 < arg2) {
				arg5 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local31 * arg0;
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local16 * arg1;
					arg1 = 0;
				}
				if ((arg0 == arg1 || local31 >= local1) && (arg0 != arg1 || local31 <= local16)) {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3120;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg0, arg4 >> 16, arg5 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg0, arg3 >> 16, arg5 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3120;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3120;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg0, arg5 >> 16, arg4 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg0, arg5 >> 16, arg3 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3120;
					}
				}
			} else {
				arg4 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local31 * arg0;
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local16 * arg2;
					arg2 = 0;
				}
				if ((arg0 == arg2 || local31 >= local1) && (arg0 != arg2 || local16 <= local1)) {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3120;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg0, arg3 >> 16, arg5 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg0, arg3 >> 16, arg4 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3120;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3120;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg0, arg5 >> 16, arg3 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg0, arg4 >> 16, arg3 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3120;
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg2 < arg0) {
				arg3 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local1 * arg1;
					arg4 -= local16 * arg1;
					arg1 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				if (arg1 != arg2 && local1 < local16 || arg1 == arg2 && local1 > local31) {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3120;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg1, arg3 >> 16, arg5 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg1, arg3 >> 16, arg4 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3120;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3120;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg1, arg5 >> 16, arg3 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg1, arg4 >> 16, arg3 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3120;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local1 * arg1;
					arg4 -= local16 * arg1;
					arg1 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local31 * arg0;
					arg0 = 0;
				}
				if (local1 < local16) {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3120;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg1, arg3 >> 16, arg4 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg1, arg5 >> 16, arg4 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3120;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3120;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg1, arg4 >> 16, arg3 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg1, arg4 >> 16, arg5 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3120;
					}
				}
			}
		} else if (arg0 < arg1) {
			arg4 = arg5 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= local16 * arg2;
				arg5 -= local31 * arg2;
				arg2 = 0;
			}
			arg3 <<= 0x10;
			if (arg0 < 0) {
				arg3 -= local1 * arg0;
				arg0 = 0;
			}
			if (local16 < local31) {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3120;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23054(this.aByteArray54, arg2, arg4 >> 16, arg3 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3120;
						}
					}
					method23054(this.aByteArray54, arg2, arg4 >> 16, arg5 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3120;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3120;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23054(this.aByteArray54, arg2, arg3 >> 16, arg4 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3120;
						}
					}
					method23054(this.aByteArray54, arg2, arg5 >> 16, arg4 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3120;
				}
			}
		} else {
			arg3 = arg5 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= local16 * arg2;
				arg5 -= local31 * arg2;
				arg2 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local1 * arg1;
				arg1 = 0;
			}
			if (local16 < local31) {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3120;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23054(this.aByteArray54, arg2, arg4 >> 16, arg5 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3120;
						}
					}
					method23054(this.aByteArray54, arg2, arg3 >> 16, arg5 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3120;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3120;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23054(this.aByteArray54, arg2, arg5 >> 16, arg4 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3120;
						}
					}
					method23054(this.aByteArray54, arg2, arg5 >> 16, arg3 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3120;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ase", name = "r", descriptor = "(IIIIII)V", line = 46)
	void method23053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg1 != arg0) {
			local1 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(16) int local16 = 0;
		if (arg2 != arg1) {
			local16 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(31) int local31 = 0;
		if (arg2 != arg0) {
			local31 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg1 < arg2) {
				arg5 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local31 * arg0;
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local16 * arg1;
					arg1 = 0;
				}
				if ((arg0 == arg1 || local31 >= local1) && (arg0 != arg1 || local31 <= local16)) {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3120;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg0, arg4 >> 16, arg5 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg0, arg3 >> 16, arg5 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3120;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3120;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg0, arg5 >> 16, arg4 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg0, arg5 >> 16, arg3 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3120;
					}
				}
			} else {
				arg4 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local31 * arg0;
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local16 * arg2;
					arg2 = 0;
				}
				if ((arg0 == arg2 || local31 >= local1) && (arg0 != arg2 || local16 <= local1)) {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3120;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg0, arg3 >> 16, arg5 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg0, arg3 >> 16, arg4 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3120;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3120;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg0, arg5 >> 16, arg3 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg0, arg4 >> 16, arg3 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3120;
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg2 < arg0) {
				arg3 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local1 * arg1;
					arg4 -= local16 * arg1;
					arg1 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				if (arg1 != arg2 && local1 < local16 || arg1 == arg2 && local1 > local31) {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3120;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg1, arg3 >> 16, arg5 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg1, arg3 >> 16, arg4 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3120;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3120;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg1, arg5 >> 16, arg3 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg1, arg4 >> 16, arg3 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3120;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local1 * arg1;
					arg4 -= local16 * arg1;
					arg1 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local31 * arg0;
					arg0 = 0;
				}
				if (local1 < local16) {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3120;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg1, arg3 >> 16, arg4 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg1, arg5 >> 16, arg4 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3120;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3120;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23054(this.aByteArray54, arg1, arg4 >> 16, arg3 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3120;
							}
						}
						method23054(this.aByteArray54, arg1, arg4 >> 16, arg5 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3120;
					}
				}
			}
		} else if (arg0 < arg1) {
			arg4 = arg5 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= local16 * arg2;
				arg5 -= local31 * arg2;
				arg2 = 0;
			}
			arg3 <<= 0x10;
			if (arg0 < 0) {
				arg3 -= local1 * arg0;
				arg0 = 0;
			}
			if (local16 < local31) {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3120;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23054(this.aByteArray54, arg2, arg4 >> 16, arg3 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3120;
						}
					}
					method23054(this.aByteArray54, arg2, arg4 >> 16, arg5 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3120;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3120;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23054(this.aByteArray54, arg2, arg3 >> 16, arg4 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3120;
						}
					}
					method23054(this.aByteArray54, arg2, arg5 >> 16, arg4 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3120;
				}
			}
		} else {
			arg3 = arg5 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= local16 * arg2;
				arg5 -= local31 * arg2;
				arg2 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local1 * arg1;
				arg1 = 0;
			}
			if (local16 < local31) {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3120;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23054(this.aByteArray54, arg2, arg4 >> 16, arg5 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3120;
						}
					}
					method23054(this.aByteArray54, arg2, arg3 >> 16, arg5 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3120;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3120;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23054(this.aByteArray54, arg2, arg5 >> 16, arg4 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3120;
						}
					}
					method23054(this.aByteArray54, arg2, arg5 >> 16, arg3 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3120;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ase", name = "y", descriptor = "([BIIII)V", line = 355)
	static final void method23054(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		arg1 += arg2;
		@Pc(13) int local13 = arg3 - arg2 >> 2;
		while (true) {
			local13--;
			if (local13 < 0) {
				local13 = arg3 - arg2 & 0x3;
				while (true) {
					local13--;
					if (local13 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(19) int local19 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(24) int local24 = local19 + 1;
			arg0[local19] = 1;
			@Pc(29) int local29 = local24 + 1;
			arg0[local24] = 1;
			arg1 = local29 + 1;
			arg0[local29] = 1;
		}
	}

	@OriginalMember(owner = "client!ase", name = "g", descriptor = "([BIIII)V", line = 355)
	static final void method23055(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		arg1 += arg2;
		@Pc(13) int local13 = arg3 - arg2 >> 2;
		while (true) {
			local13--;
			if (local13 < 0) {
				local13 = arg3 - arg2 & 0x3;
				while (true) {
					local13--;
					if (local13 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(19) int local19 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(24) int local24 = local19 + 1;
			arg0[local19] = 1;
			@Pc(29) int local29 = local24 + 1;
			arg0[local24] = 1;
			arg1 = local29 + 1;
			arg0[local29] = 1;
		}
	}
}

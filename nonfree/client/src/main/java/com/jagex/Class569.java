package com.jagex;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public class Class569 implements Runnable {

	@OriginalMember(owner = "client!u", name = "fh", descriptor = "Lclient!pw;")
	public static Class478 aClass478_130;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Z")
	volatile boolean aBoolean802;

	@OriginalMember(owner = "client!u", name = "v", descriptor = "Ljava/util/Queue;")
	Queue aQueue2 = new LinkedList();

	@OriginalMember(owner = "client!u", name = "p", descriptor = "Ljava/lang/Thread;")
	final Thread aThread11 = new Thread(this);

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 16)
	Class569() {
		this.aThread11.setPriority(1);
		this.aThread11.start();
	}

	@OriginalMember(owner = "client!u", name = "run", descriptor = "()V", line = 23)
	@Override
	public void run() {
		while (!this.aBoolean802) {
			try {
				@Pc(11) Class154 local11;
				synchronized (this) {
					local11 = (Class154) this.aQueue2.poll();
					if (local11 == null) {
						try {
							this.wait();
						} catch (@Pc(18) InterruptedException local18) {
						}
						continue;
					}
				}
				try {
					@Pc(33) URLConnection local33 = local11.anURL1.openConnection();
					local33.setConnectTimeout(30000);
					@Pc(39) int local39 = local33.getContentLength();
					if (local39 >= 0) {
						@Pc(44) byte[] local44 = new byte[local39];
						(new DataInputStream(local33.getInputStream())).readFully(local44);
						local11.aByteArray50 = local44;
					}
					local11.aBoolean494 = true;
				} catch (@Pc(59) IOException local59) {
					local11.aBoolean494 = true;
				}
			} catch (@Pc(64) Exception local64) {
				Class293.method27014(null, local64);
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "r", descriptor = "()V", line = 23)
	public void method31411() {
		while (!this.aBoolean802) {
			try {
				@Pc(11) Class154 local11;
				synchronized (this) {
					local11 = (Class154) this.aQueue2.poll();
					if (local11 == null) {
						try {
							this.wait();
						} catch (@Pc(18) InterruptedException local18) {
						}
						continue;
					}
				}
				try {
					@Pc(33) URLConnection local33 = local11.anURL1.openConnection();
					local33.setConnectTimeout(30000);
					@Pc(39) int local39 = local33.getContentLength();
					if (local39 >= 0) {
						@Pc(44) byte[] local44 = new byte[local39];
						(new DataInputStream(local33.getInputStream())).readFully(local44);
						local11.aByteArray50 = local44;
					}
					local11.aBoolean494 = true;
				} catch (@Pc(59) IOException local59) {
					local11.aBoolean494 = true;
				}
			} catch (@Pc(64) Exception local64) {
				Class293.method27014(null, local64);
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "()V", line = 23)
	public void method31412() {
		while (!this.aBoolean802) {
			try {
				@Pc(11) Class154 local11;
				synchronized (this) {
					local11 = (Class154) this.aQueue2.poll();
					if (local11 == null) {
						try {
							this.wait();
						} catch (@Pc(18) InterruptedException local18) {
						}
						continue;
					}
				}
				try {
					@Pc(33) URLConnection local33 = local11.anURL1.openConnection();
					local33.setConnectTimeout(30000);
					@Pc(39) int local39 = local33.getContentLength();
					if (local39 >= 0) {
						@Pc(44) byte[] local44 = new byte[local39];
						(new DataInputStream(local33.getInputStream())).readFully(local44);
						local11.aByteArray50 = local44;
					}
					local11.aBoolean494 = true;
				} catch (@Pc(59) IOException local59) {
					local11.aBoolean494 = true;
				}
			} catch (@Pc(64) Exception local64) {
				Class293.method27014(null, local64);
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "y", descriptor = "(Ljava/net/URL;)Lclient!ar;", line = 58)
	Class154 method31413(@OriginalArg(0) URL arg0) {
		@Pc(4) Class154 local4 = new Class154(arg0);
		synchronized (this) {
			this.aQueue2.add(local4);
			this.notify();
			return local4;
		}
	}

	@OriginalMember(owner = "client!u", name = "p", descriptor = "(Ljava/net/URL;I)Lclient!ar;", line = 58)
	Class154 method31414(@OriginalArg(0) URL arg0) {
		@Pc(4) Class154 local4 = new Class154(arg0);
		synchronized (this) {
			this.aQueue2.add(local4);
			this.notify();
			return local4;
		}
	}

	@OriginalMember(owner = "client!u", name = "v", descriptor = "(Ljava/net/URL;)Lclient!ar;", line = 58)
	Class154 method31415(@OriginalArg(0) URL arg0) {
		@Pc(4) Class154 local4 = new Class154(arg0);
		synchronized (this) {
			this.aQueue2.add(local4);
			this.notify();
			return local4;
		}
	}

	@OriginalMember(owner = "client!u", name = "l", descriptor = "(Ljava/net/URL;)Lclient!ar;", line = 58)
	Class154 method31416(@OriginalArg(0) URL arg0) {
		@Pc(4) Class154 local4 = new Class154(arg0);
		synchronized (this) {
			this.aQueue2.add(local4);
			this.notify();
			return local4;
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V", line = 67)
	void method31417() {
		this.aBoolean802 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			this.aThread11.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!u", name = "w", descriptor = "()V", line = 67)
	void method31418() {
		this.aBoolean802 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			this.aThread11.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!u", name = "t", descriptor = "()V", line = 67)
	void method31419() {
		this.aBoolean802 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			this.aThread11.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!u", name = "q", descriptor = "()V", line = 67)
	void method31420() {
		this.aBoolean802 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			this.aThread11.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!u", name = "fd", descriptor = "(I)I", line = 2224)
	public static int method31421() {
		if (Class706.aBoolean868 && Class184.aFrame1 != null) {
			return 3;
		} else if (client.aBoolean615) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!u", name = "kj", descriptor = "(Lclient!gm;ILclient!yf;I)V", line = 6461)
	static final void method31422(@OriginalArg(0) Class277 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class665 arg2) {
		if (arg0.aByteArrayArray13 == null) {
			throw new RuntimeException();
		}
		if (arg0.anIntArray404 == null) {
			arg0.anIntArray404 = new int[arg0.aByteArrayArray13.length];
		}
		arg0.anIntArray404[arg1] = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!u", name = "th", descriptor = "(Lclient!yf;I)V", line = 7967)
	static final void method31423(@OriginalArg(0) Class665 arg0) {
		@Pc(14) Class277 local14 = Class155.method23628(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		if (local14.anInt3936 * 403396513 == -1) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local14.anInt3934 * -148110895;
		}
	}

	@OriginalMember(owner = "client!u", name = "ajn", descriptor = "(Lclient!yf;I)V", line = 11218)
	static final void method31424(@OriginalArg(0) Class665 arg0) {
		Class413.aClass413_3.method28607();
	}

	@OriginalMember(owner = "client!u", name = "atz", descriptor = "(Lclient!yf;I)V", line = 12835)
	static final void method31425(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		Class303.method27192(2, local13, local23, "");
	}

	@OriginalMember(owner = "client!u", name = "azc", descriptor = "(Lclient!yf;I)V", line = 13839)
	static final void method31426(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(37) int local37 = Class480.method29812(local23);
		@Pc(41) int local41 = Class502.method30226(local23);
		@Pc(47) Class24 local47 = (Class24) Class75_Sub1.aClass35_1.method18319(local13);
		@Pc(53) Class52 local53 = (Class52) Class149.aClass35_10.method18319(local37);
		@Pc(58) Class498[] local58 = local53.aClass498ArrayArray2[local41];
		@Pc(63) Object[] local63 = local47.method439(local41);
		if (local63 == null && local53.anObjectArrayArray2 != null) {
			local63 = local53.anObjectArrayArray2[local41];
		}
		@Pc(79) int local79;
		if (local63 == null) {
			for (local79 = 0; local79 < local58.length; local79++) {
				@Pc(87) Class498 local87 = local58[local79];
				if (Class498.aClass498_158 == local87) {
					arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
				} else if (Class498.aClass498_113 == local87 || Class498.aClass498_8 == local87) {
					arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
				} else {
					arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
				}
			}
			return;
		}
		local79 = local63.length / local58.length;
		if (local33 < 0 || local33 >= local79) {
			throw new RuntimeException();
		}
		for (@Pc(163) int local163 = 0; local163 < local58.length; local163++) {
			@Pc(174) int local174 = local163 + local58.length * local33;
			if (Class498.aClass498_158 == local58[local163]) {
				arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local63[local174];
			} else {
				arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (Integer) local63[local174];
			}
		}
	}
}

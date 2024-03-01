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

@OriginalClass("client!x")
public class Class653 implements Runnable {

	@OriginalMember(owner = "client!x", name = "w", descriptor = "I")
	static int anInt5805;

	@OriginalMember(owner = "client!x", name = "l", descriptor = "Lclient!jb;")
	public static Class357 aClass357_1;

	@OriginalMember(owner = "client!x", name = "jm", descriptor = "Lclient!yb;")
	static Class678 aClass678_2;

	@OriginalMember(owner = "client!x", name = "n", descriptor = "Z")
	volatile boolean aBoolean860;

	@OriginalMember(owner = "client!x", name = "m", descriptor = "Ljava/util/Queue;")
	Queue aQueue2 = new LinkedList();

	@OriginalMember(owner = "client!x", name = "e", descriptor = "Ljava/lang/Thread;")
	final Thread aThread11 = new Thread(this);

	@OriginalMember(owner = "client!x", name = "<init>", descriptor = "()V", line = 16)
	Class653() {
		this.aThread11.setPriority(1);
		this.aThread11.start();
	}

	@OriginalMember(owner = "client!x", name = "run", descriptor = "()V", line = 23)
	@Override
	public void run() {
		while (!this.aBoolean860) {
			try {
				@Pc(11) Class165 local11;
				synchronized (this) {
					local11 = (Class165) this.aQueue2.poll();
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
						local11.aByteArray44 = local44;
					}
					local11.aBoolean364 = true;
				} catch (@Pc(59) IOException local59) {
					local11.aBoolean364 = true;
				}
			} catch (@Pc(64) Exception local64) {
				Class646.method32610(null, local64);
			}
		}
	}

	@OriginalMember(owner = "client!x", name = "o", descriptor = "()V", line = 23)
	public void method32701() {
		while (!this.aBoolean860) {
			try {
				@Pc(11) Class165 local11;
				synchronized (this) {
					local11 = (Class165) this.aQueue2.poll();
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
						local11.aByteArray44 = local44;
					}
					local11.aBoolean364 = true;
				} catch (@Pc(59) IOException local59) {
					local11.aBoolean364 = true;
				}
			} catch (@Pc(64) Exception local64) {
				Class646.method32610(null, local64);
			}
		}
	}

	@OriginalMember(owner = "client!x", name = "c", descriptor = "()V", line = 23)
	public void method32703() {
		while (!this.aBoolean860) {
			try {
				@Pc(11) Class165 local11;
				synchronized (this) {
					local11 = (Class165) this.aQueue2.poll();
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
						local11.aByteArray44 = local44;
					}
					local11.aBoolean364 = true;
				} catch (@Pc(59) IOException local59) {
					local11.aBoolean364 = true;
				}
			} catch (@Pc(64) Exception local64) {
				Class646.method32610(null, local64);
			}
		}
	}

	@OriginalMember(owner = "client!x", name = "r", descriptor = "()V", line = 23)
	public void method32704() {
		while (!this.aBoolean860) {
			try {
				@Pc(11) Class165 local11;
				synchronized (this) {
					local11 = (Class165) this.aQueue2.poll();
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
						local11.aByteArray44 = local44;
					}
					local11.aBoolean364 = true;
				} catch (@Pc(59) IOException local59) {
					local11.aBoolean364 = true;
				}
			} catch (@Pc(64) Exception local64) {
				Class646.method32610(null, local64);
			}
		}
	}

	@OriginalMember(owner = "client!x", name = "v", descriptor = "()V", line = 23)
	public void method32705() {
		while (!this.aBoolean860) {
			try {
				@Pc(11) Class165 local11;
				synchronized (this) {
					local11 = (Class165) this.aQueue2.poll();
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
						local11.aByteArray44 = local44;
					}
					local11.aBoolean364 = true;
				} catch (@Pc(59) IOException local59) {
					local11.aBoolean364 = true;
				}
			} catch (@Pc(64) Exception local64) {
				Class646.method32610(null, local64);
			}
		}
	}

	@OriginalMember(owner = "client!x", name = "n", descriptor = "([BI)Z", line = 27)
	public static boolean method32713(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		@Pc(8) int local8 = local4.method22413();
		if (local8 != 2) {
			return false;
		}
		@Pc(22) boolean local22 = local4.method22413() == 1;
		if (local22) {
			Class698.method36702(local4);
		}
		Class351.method27643(local4);
		return true;
	}

	@OriginalMember(owner = "client!x", name = "e", descriptor = "(Ljava/net/URL;I)Lclient!am;", line = 58)
	Class165 method32706(@OriginalArg(0) URL arg0) {
		@Pc(4) Class165 local4 = new Class165(arg0);
		synchronized (this) {
			this.aQueue2.add(local4);
			this.notify();
			return local4;
		}
	}

	@OriginalMember(owner = "client!x", name = "m", descriptor = "(Ljava/net/URL;)Lclient!am;", line = 58)
	Class165 method32707(@OriginalArg(0) URL arg0) {
		@Pc(4) Class165 local4 = new Class165(arg0);
		synchronized (this) {
			this.aQueue2.add(local4);
			this.notify();
			return local4;
		}
	}

	@OriginalMember(owner = "client!x", name = "k", descriptor = "(Ljava/net/URL;)Lclient!am;", line = 58)
	Class165 method32708(@OriginalArg(0) URL arg0) {
		@Pc(4) Class165 local4 = new Class165(arg0);
		synchronized (this) {
			this.aQueue2.add(local4);
			this.notify();
			return local4;
		}
	}

	@OriginalMember(owner = "client!x", name = "f", descriptor = "(Ljava/net/URL;)Lclient!am;", line = 58)
	Class165 method32709(@OriginalArg(0) URL arg0) {
		@Pc(4) Class165 local4 = new Class165(arg0);
		synchronized (this) {
			this.aQueue2.add(local4);
			this.notify();
			return local4;
		}
	}

	@OriginalMember(owner = "client!x", name = "w", descriptor = "(Ljava/net/URL;)Lclient!am;", line = 58)
	Class165 method32710(@OriginalArg(0) URL arg0) {
		@Pc(4) Class165 local4 = new Class165(arg0);
		synchronized (this) {
			this.aQueue2.add(local4);
			this.notify();
			return local4;
		}
	}

	@OriginalMember(owner = "client!x", name = "n", descriptor = "(B)V", line = 67)
	void method32702() {
		this.aBoolean860 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			this.aThread11.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!x", name = "l", descriptor = "()V", line = 67)
	void method32711() {
		this.aBoolean860 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			this.aThread11.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!x", name = "u", descriptor = "()V", line = 67)
	void method32712() {
		this.aBoolean860 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			this.aThread11.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!x", name = "gq", descriptor = "(Lclient!yf;I)V", line = 6042)
	static final void method32717(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class35.method686(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!x", name = "aom", descriptor = "(Lclient!yf;B)V", line = 12511)
	static final void method32714(@OriginalArg(0) Class681 arg0) throws Exception_Sub3 {
		arg0.anInt5891 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(41) Class472 local41 = Class472.method29529((float) local13, (float) local23, (float) local33);
		Class65.aClass123_Sub1_2.method9075(local41);
		local41.method29532();
	}

	@OriginalMember(owner = "client!x", name = "aqf", descriptor = "(Lclient!yf;I)V", line = 12868)
	static final void method32715(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= 1189701933;
		arg0.anInt5891 -= 1189701933;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!x", name = "ber", descriptor = "(Lclient!yf;I)V", line = 15053)
	static final void method32716(@OriginalArg(0) Class681 arg0) {
	}
}

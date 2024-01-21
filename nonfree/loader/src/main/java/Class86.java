import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!dc")
public final class Class86 implements Runnable {

	@OriginalMember(owner = "loader!dc", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "loader!dc", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!dc", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!dc", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!dc", name = "q", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!dc", name = "p", descriptor = "I")
	private static final int anInt3163 = 1;

	@OriginalMember(owner = "loader!dc", name = "l", descriptor = "Lloader!d;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!dc", name = "f", descriptor = "[Lloader!lb;")
	private Class87[] aClass87Array1;

	@OriginalMember(owner = "loader!dc", name = "a", descriptor = "Lloader!cc;")
	private Class85 aClass85_3 = null;

	@OriginalMember(owner = "loader!dc", name = "d", descriptor = "Z")
	private boolean aBoolean287 = false;

	@OriginalMember(owner = "loader!dc", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!dc", name = "e", descriptor = "Lloader!lb;")
	private Class87 aClass87_1 = null;

	@OriginalMember(owner = "loader!dc", name = "g", descriptor = "Ljava/io/File;")
	private File aFile4 = null;

	@OriginalMember(owner = "loader!dc", name = "k", descriptor = "Lloader!lb;")
	private Class87 aClass87_2 = null;

	@OriginalMember(owner = "loader!dc", name = "s", descriptor = "Lloader!lb;")
	private Class87 aClass87_3 = null;

	@OriginalMember(owner = "loader!dc", name = "m", descriptor = "Lloader!cc;")
	private Class85 aClass85_2 = null;

	@OriginalMember(owner = "loader!dc", name = "r", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!dc", name = "j", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!dc", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!dc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class86(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString8 = "Unknown";
		aString9 = "1.1";
		this.anApplet2 = arg1;
		try {
			aString8 = System.getProperty("java.vendor");
			aString9 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString7 = System.getProperty("user.home");
			if (aString7 != null) {
				aString7 = aString7 + "/";
			}
		} catch (@Pc(60) Exception local60) {
		}
		if (aString7 == null) {
			aString7 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(70) Throwable local70) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(97) Exception local97) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		this.method2062(arg4, arg3, arg2);
		this.aBoolean287 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!dc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class85 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean287) {
						return;
					}
					if (this.aClass85_2 != null) {
						local16 = this.aClass85_2;
						this.aClass85_2 = this.aClass85_2.aClass85_1;
						if (this.aClass85_2 == null) {
							this.aClass85_3 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local16.anInt3160;
				if (local45 == 1) {
					local16.anObject5 = new Socket(InetAddress.getByName((String) local16.anObject6), local16.anInt3162);
				} else if (local45 == 2) {
					@Pc(72) Thread local72 = new Thread((Runnable) local16.anObject6);
					local72.setDaemon(true);
					local72.start();
					local72.setPriority(local16.anInt3162);
					local16.anObject5 = local72;
				} else if (local45 == 4) {
					local16.anObject5 = new DataInputStream(((URL) local16.anObject6).openStream());
				} else {
					@Pc(150) Object[] local150;
					if (local45 == 8) {
						local150 = (Object[]) local16.anObject6;
						if (((Class) local150[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local150[0]).getDeclaredMethod((String) local150[1], (Class[]) local150[2]);
					} else if (local45 == 9) {
						local150 = (Object[]) local16.anObject6;
						if (((Class) local150[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local150[0]).getDeclaredField((String) local150[1]);
					} else if (local45 == 3) {
						@Pc(139) String local139 = (local16.anInt3162 >> 24 & 0xFF) + "." + (local16.anInt3162 >> 16 & 0xFF) + "." + (local16.anInt3162 >> 8 & 0xFF) + "." + (local16.anInt3162 & 0xFF);
						local16.anObject5 = InetAddress.getByName(local139).getHostName();
					}
				}
				local16.anInt3161 = 1;
			} catch (@Pc(220) ThreadDeath local220) {
				throw local220;
			} catch (@Pc(223) Throwable local223) {
				local16.anInt3161 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!dc", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method2062(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(53) String[] local53 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString7, "/tmp/", "" };
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(85) int local85 = 0; local85 < local78.length; local85++) {
				for (@Pc(95) int local95 = 0; local95 < local53.length; local95++) {
					try {
						@Pc(103) String local103 = local53[local95];
						if (local103.length() > 0 && !(new File(local103)).exists()) {
							continue;
						}
						@Pc(129) File local129 = new File(local103 + local78[local85]);
						@Pc(140) boolean local140;
						if (local80 == 1 && !local129.exists()) {
							local140 = local129.mkdir();
							if (!local140) {
								continue;
							}
						}
						@Pc(154) File local154;
						if (this.aClass87_3 == null) {
							try {
								local154 = new File(local129, "random.dat");
								if (local80 == 1 || local154.exists()) {
									this.aClass87_3 = new Class87(local154, "rw", 25L);
								}
							} catch (@Pc(173) Exception local173) {
								this.aClass87_3 = null;
							}
						}
						if (this.aFile4 == null) {
							@Pc(230) int local230;
							try {
								local129 = new File(local129, arg1);
								if (local80 == 1 && !local129.exists()) {
									local140 = local129.mkdir();
									if (!local140) {
										continue;
									}
								}
								local154 = new File(local129, "main_file_cache.dat2");
								if (local80 == 0 && !local154.exists()) {
									continue;
								}
								this.aClass87_1 = new Class87(local154, "rw", 52428800L);
								this.aClass87Array1 = new Class87[16];
								for (local230 = 0; local230 < 16; local230++) {
									this.aClass87Array1[local230] = new Class87(new File(local129, "main_file_cache.idx" + local230), "rw", 1048576L);
								}
								this.aClass87_2 = new Class87(new File(local129, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile4 = local129;
							} catch (@Pc(276) Exception local276) {
								try {
									this.aClass87_1.method2070();
									for (local230 = 0; local230 < 16; local230++) {
										this.aClass87Array1[local230].method2070();
									}
									this.aClass87_2.method2070();
								} catch (@Pc(299) Exception local299) {
								}
								this.aClass87Array1 = null;
								this.aClass87_1 = this.aClass87_2 = null;
								this.aFile5 = this.aFile4 = null;
							}
						}
					} catch (@Pc(316) Exception local316) {
					}
					if (this.aClass87_3 != null && this.aFile4 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile4 == null) {
			throw new RuntimeException();
		}
	}
}

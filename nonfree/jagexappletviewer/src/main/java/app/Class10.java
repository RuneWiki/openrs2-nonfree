package app;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/h")
final class Class10 implements Runnable, MouseListener, MouseMotionListener {

	@OriginalMember(owner = "jagexappletviewer!app/h", name = "a", descriptor = "Ljagexappletviewer!app/c;")
	private Canvas_Sub1 aCanvas_Sub1_2;

	@OriginalMember(owner = "jagexappletviewer!app/h", name = "b", descriptor = "I")
	private int anInt13 = -1;

	@OriginalMember(owner = "jagexappletviewer!app/h", name = "c", descriptor = "I")
	private int anInt14 = 0;

	@OriginalMember(owner = "jagexappletviewer!app/h", name = "d", descriptor = "I")
	private int anInt15 = 0;

	@OriginalMember(owner = "jagexappletviewer!app/h", name = "e", descriptor = "I")
	private int anInt16 = 0;

	@OriginalMember(owner = "jagexappletviewer!app/h", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (this.anInt13 >= 0) {
			@Pc(8) int local8 = arg0.getY();
			this.aCanvas_Sub1_2.setValue((this.aCanvas_Sub1_2.anInt8 - this.aCanvas_Sub1_2.anInt6) * (local8 - this.anInt13) / this.aCanvas_Sub1_2.anInt12 + this.anInt16);
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/h", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt14 = 0;
		this.anInt13 = -1;
		this.aCanvas_Sub1_2.aBoolean6 = false;
	}

	@OriginalMember(owner = "jagexappletviewer!app/h", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (!this.aCanvas_Sub1_2.isEnabled()) {
			return;
		}
		this.aCanvas_Sub1_2.aBoolean6 = true;
		@Pc(12) int local12 = this.aCanvas_Sub1_2.getHeight();
		@Pc(15) int local15 = arg0.getY();
		if (local15 < 15) {
			this.aCanvas_Sub1_2.setValue(this.aCanvas_Sub1_2.getValue() - this.aCanvas_Sub1_2.anInt9);
			this.anInt15 = this.aCanvas_Sub1_2.anInt9;
			this.anInt14 = 1;
			synchronized (this) {
				this.notifyAll();
			}
		} else if (local12 - 15 < local15) {
			this.aCanvas_Sub1_2.setValue(this.aCanvas_Sub1_2.getValue() + this.aCanvas_Sub1_2.anInt9);
			this.anInt14 = 3;
			this.anInt15 = this.aCanvas_Sub1_2.anInt9;
			synchronized (this) {
				this.notifyAll();
			}
		} else if (this.aCanvas_Sub1_2.anInt11 + 15 > local15) {
			this.aCanvas_Sub1_2.setValue(this.aCanvas_Sub1_2.getValue() - this.aCanvas_Sub1_2.anInt7);
			this.anInt15 = this.aCanvas_Sub1_2.anInt7;
			this.anInt14 = 1;
			synchronized (this) {
				this.notifyAll();
			}
		} else if (this.aCanvas_Sub1_2.anInt10 + this.aCanvas_Sub1_2.anInt11 + 15 <= local15) {
			this.aCanvas_Sub1_2.setValue(this.aCanvas_Sub1_2.getValue() + this.aCanvas_Sub1_2.anInt7);
			this.anInt14 = 3;
			this.anInt15 = this.aCanvas_Sub1_2.anInt7;
			synchronized (this) {
				this.notifyAll();
			}
		} else {
			this.anInt13 = local15;
			this.anInt16 = this.aCanvas_Sub1_2.getValue();
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/h", name = "run", descriptor = "()V")
	public final void run() {
		while (true) {
			@Pc(4) int local4 = this.anInt14;
			if (local4 == 0) {
				try {
					synchronized (this) {
						this.wait();
					}
				} catch (@Pc(55) InterruptedException local55) {
				}
			} else if (local4 == 1) {
				try {
					Thread.sleep(550L);
				} catch (@Pc(60) InterruptedException local60) {
				}
				if (this.anInt14 == 1) {
					this.anInt14 = 2;
					this.aCanvas_Sub1_2.setValue(this.aCanvas_Sub1_2.getValue() - this.anInt15);
				}
			} else if (local4 == 2) {
				try {
					Thread.sleep(50L);
				} catch (@Pc(83) InterruptedException local83) {
				}
				this.aCanvas_Sub1_2.setValue(this.aCanvas_Sub1_2.getValue() - this.anInt15);
			} else if (local4 == 3) {
				try {
					Thread.sleep(550L);
				} catch (@Pc(97) InterruptedException local97) {
				}
				if (this.anInt14 == 3) {
					this.anInt14 = 4;
					this.aCanvas_Sub1_2.setValue(this.aCanvas_Sub1_2.getValue() + this.anInt15);
				}
			} else if (local4 == 4) {
				try {
					Thread.sleep(50L);
				} catch (@Pc(121) InterruptedException local121) {
				}
				this.aCanvas_Sub1_2.setValue(this.aCanvas_Sub1_2.getValue() + this.anInt15);
			}
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/h", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/h", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/h", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/h", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/h", name = "<init>", descriptor = "(Ljagexappletviewer!app/c;)V")
	Class10(@OriginalArg(0) Canvas_Sub1 arg0) {
		this.aCanvas_Sub1_2 = arg0;
		@Pc(21) Thread local21 = new Thread(this);
		local21.setDaemon(true);
		local21.start();
	}
}

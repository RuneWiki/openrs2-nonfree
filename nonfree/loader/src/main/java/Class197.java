import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!g")
public final class Class197 {

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "()V")
	public Class197() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(31) GraphicsDevice local31 = local15[local19];
				if (local31 != null && local31.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local31;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method4798(@OriginalArg(1) Frame arg0) {
		@Pc(5) boolean local5 = false;
		try {
			@Pc(10) Field local10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local10.setAccessible(true);
			@Pc(20) boolean local20 = (Boolean) local10.get(this.aGraphicsDevice1);
			if (local20) {
				local5 = true;
				local10.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local5) {
				try {
					@Pc(61) Field local61 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local61.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(68) Throwable local68) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(I)[I")
	public int[] method4799() {
		@Pc(10) DisplayMode[] local10 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(16) int[] local16 = new int[local10.length << 2];
		for (@Pc(18) int local18 = 0; local18 < local10.length; local18++) {
			local16[local18 << 2] = local10[local18].getWidth();
			local16[(local18 << 2) + 1] = local10[local18].getHeight();
			local16[(local18 << 2) + 2] = local10[local18].getBitDepth();
			local16[(local18 << 2) + 3] = local10[local18].getRefreshRate();
		}
		return local16;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/awt/Frame;IIII)V")
	public void method4800(@OriginalArg(1) Frame arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method4798(arg0);
		if (arg2 == 0) {
			@Pc(40) int local40 = this.aDisplayMode1.getRefreshRate();
			@Pc(44) DisplayMode[] local44 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(46) boolean local46 = false;
			for (@Pc(48) int local48 = 0; local48 < local44.length; local48++) {
				if (local44[local48].getWidth() == arg4 && local44[local48].getHeight() == arg3 && local44[local48].getBitDepth() == arg1) {
					@Pc(79) int local79 = local44[local48].getRefreshRate();
					if (!local46 || Math.abs(local79 - local40) < Math.abs(arg2 - local40)) {
						local46 = true;
						arg2 = local79;
					}
				}
			}
			if (!local46) {
				arg2 = local40;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg4, arg3, arg1, arg2));
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(B)V")
	public void method4801() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method4798(null);
	}
}

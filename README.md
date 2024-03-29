### 工单管理系统<br>
基于java的web项目的后端部分,使用MVC架构<br>

管理对象：工单、部门、人员<br>
管理方式：工单导入、工单分类、部门编辑、权限控制<br>
系统支持：maven、jdk、mysql<br>

### 系统模块：
工单管理<br>
   a. 工单导入，工单需要进行标签勾选<br>
   b. 查看全部工单<br>
   <br>
部门管理<br>
   a. 添加部门<br>
  b. 修改部门信息<br>
  c. 编辑部门标签<br>
<br>
流程管理<br>
   a. 低权限用户进入，即只能看到本部门的工单情况<br>
      (1). 对未处理的工单进行处理<br>
    (2). 对被驳回的工单进行处理<br>
    (3). 对别的部门已处理但本部门也要参与的工单可进行驳回、或者处理<br>
  b. 高权限用户进入，可以看到所有部门的工单情况<br>
    (1). 看到对各部门收到的工单数<br>
    (2). 处理驳回超过2次的工单<br>
    (3). 可调整人员权限<br>
<br>
系统管理<br>
   a. 菜单管理 方便系统操作员增加页面和目录<br>
   b. 角色管理 控制分配每个人的权限<br>
   c. 资源管理 实现每种权限的可访问的地址<br>

### 系统业务逻辑说明
系统中涉及的实体类主要有两个 order(工单)、department(部门)、member(系统成员)<br>
<br>
order 以投诉工单为例，一份投诉从客户方进入系统，通过在导入这份工单时的打标签行为和部门发生联系<br>
<br>
department 以银行部门为例，一份投诉可能来自线上（系统反应速度、系统bug）、线下（业务人员、网点营业厅硬件、客户集中程度），这些对应了不同的部门为这些投诉负责<br>
<br>
member 以银行为例，不同的成员属于不同的部门，即使在同一部门也有职级的差异，控制权限不仅仅针对部门，也要针对到个人<br>

### 代码响应逻辑
>src
>>main
>>>java
>>>>com.emit.comlaint_manage
>>>>>controller api集中地，所有前端要调用后端的接口，一般设计会依据页面或者实体对象<br>
>>>>>dao dao中会写抽象方法加@Mapper前缀 对应名字的mapper项是sql语句 这也就是为什么大家说dao是数据库交互的原因<br>
>>>>>domin 实体类放的位置，加@Data前缀，不用再写get set方法<br>
>>>>>serivce 复杂逻辑处理的位置，作为dao与controller的中间项，可在数据库操作前整理，可在数据库操作后再整合等<br>
>>>>>util 随便定义的，一般会放算法<br>
>>>>>view 一般页面呈现出多个查询结果的组合时，应当将这张综合表的内容定义在view中<br>

>>>>resource
>>>>>mapper 这里是真正放sql语句的地方<br>
